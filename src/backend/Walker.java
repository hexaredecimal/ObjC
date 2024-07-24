package backend;

import ast.CharAst;
import ast.Ast;
import ast.BinaryExpressionAst;
import ast.BoolAst;
import ast.FunctionAst;
import ast.GroupAst;
import ast.IdentifierAst;
import ast.IntegerContant;
import ast.NegateAst;
import ast.NilAst;
import ast.NullAst;
import ast.ParamAst;
import ast.StringAst;
import ast.TypeAst;
import ast.VariableAst;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import parser.ObjectiveCParser.*;

public class Walker {

	public void walkTranslationUnit(TranslationUnitContext translation) {
		var top_level_declarations = translation.topLevelDeclaration();

		for (var topleveldecl : top_level_declarations) {
			this.walkTopLevelDeclaration(topleveldecl);
		}

	}

	public void walkTopLevelDeclaration(TopLevelDeclarationContext topleveldecl) {

		if (topleveldecl.functionDefinition() != null) {
			var func = topleveldecl.functionDefinition();
			this.walkFunctionDefinition(func);
		}
	}

	public void walkFunctionDefinition(FunctionDefinitionContext funcdef) {
		var func_sig = funcdef.functionSignature();
		var body_ = funcdef.compoundStatement();
		var fx = this.walkFunctionSignature(func_sig);

		System.out.println("" + fx);
		this.walkCompoundStatement(body_);
	}

	public void walkCompoundStatement(CompoundStatementContext compound) {
		// Move all variable declarations to the top of the AST so that vars
		// can be defined even if they are declared later in the programm 

		List<Ast> var_decls = null; 
		if (!compound.declaration().isEmpty()) {
			var decls = compound.declaration();
			for (var dec : decls) {
				var vars = this.walkDeclaration(dec);
				if (var_decls == null) 
					var_decls = vars; 
				else 
					var_decls.addAll(vars);
			}
		}

		System.out.println("{");
		var_decls.forEach(v -> {
			System.out.print(v.toString().indent(4));
		});
		System.out.println("}");
	}

	public List<Ast> walkDeclaration(DeclarationContext decl) {
		if (decl.varDeclaration() != null) {
			var vdecl = decl.varDeclaration();
			return this.walkVarDeclaration(vdecl);
		}
		return null;
	}

	public List<Ast> walkVarDeclaration(VarDeclarationContext vardecl) {
		if (vardecl.declarationSpecifiers() != null && vardecl.initDeclaratorList() != null) {
			var declspec = vardecl.declarationSpecifiers();
			var type = this.walkDeclarationSpecifiers(declspec);

			var inits = vardecl.initDeclaratorList();
			var vars = this.walkInitDeclaratorList(inits);
			for (var v: vars) {
				((VariableAst)v).setType((TypeAst) type);
			}
			return vars;
		} else if (vardecl.declarationSpecifiers() != null) {

		}

		return null;
	}

	public List<Ast> walkInitDeclaratorList(InitDeclaratorListContext decllist) {
		if (!decllist.COMMA().isEmpty() && !decllist.initDeclarator().isEmpty()) {
			// Handle multiple vars declared on a single line
			// such as int x = 10, y = 20, ...;
			var initdecllist = decllist.initDeclarator();
			List<Ast> vars = new ArrayList<>();
			for (var initdecl : initdecllist) {
				vars.add(this.walkInitDeclarator(initdecl));
			}

			return vars;
		} else if (!decllist.initDeclarator().isEmpty()) {
			List<Ast> vars = new ArrayList<>();
			var initdecllist = decllist.initDeclarator();
			for (var initdecl : initdecllist) {
				vars.add(this.walkInitDeclarator(initdecl));
			}
			return vars;
		}

		return null;
	}

	public Ast walkInitDeclarator(InitDeclaratorContext initdecl) {
		if (initdecl.ASSIGNMENT() != null && initdecl.declarator() != null && initdecl.initializer() != null) {
			// Full variable declaration
			// eg: int x = 10 * 2; 
			var id = this.walkDeclarator(initdecl.declarator());
			var init = this.walkInitializer(initdecl.initializer());
			var v = new VariableAst((IdentifierAst) id);
			v.setValue(init);
			return v;
		} else if (initdecl.ASSIGNMENT() == null && initdecl.declarator() != null) {
			// Variable declaration without an initializer
			// eg: int x; 
			var id = this.walkDeclarator(initdecl.declarator());
			var v = new VariableAst((IdentifierAst) id);
		}

		return null;
	}

	public Ast walkInitializer(InitializerContext init) {
		if (init.expression() != null) {
			return this.walkExpression(init.expression());
		} else if (init.arrayInitializer() != null) {
			System.out.println("Array: )");
		} else if (init.structInitializer() != null) {
			System.out.println("StructInit: )");
		}
		return null;
	}

	private Ast constructBinaryAst(ExpressionContext expr, String op) {
		var left = this.walkExpression(expr.expression().getFirst());
		var right = this.walkExpression(expr.expression().getLast());
		return new BinaryExpressionAst(left, op, right);
	}

	public Ast walkExpression(ExpressionContext expr) {
		if (expr.castExpression() != null) {
			return this.walkCastExpression(expr.castExpression());
		} else if (expr.ADD() != null) {
			return this.constructBinaryAst(expr, "+");
		} else if (expr.SUB() != null) {
			return this.constructBinaryAst(expr, "-");
		} else if (expr.MOD() != null) {
			return this.constructBinaryAst(expr, "%");
		} else if (expr.MUL() != null) {
			return this.constructBinaryAst(expr, "*");
		} else if (expr.DIV() != null) {
			return this.constructBinaryAst(expr, "/");
		} else if (expr.LT().size() == 1) {
			return this.constructBinaryAst(expr, "<");
		} else if (expr.GT().size() == 1) {
			return this.constructBinaryAst(expr, ">");
		} else if (expr.LT().size() == 2) {
			return this.constructBinaryAst(expr, "<<");
		} else if (expr.GT().size() == 2) {
			return this.constructBinaryAst(expr, ">>");
		} else if (expr.LE() != null) {
			return this.constructBinaryAst(expr, "<=");
		} else if (expr.GE() != null) {
			return this.constructBinaryAst(expr, ">=");
		} else if (expr.EQUAL() != null) {
			return this.constructBinaryAst(expr, "==");
		} else if (expr.NOTEQUAL() != null) {
			return this.constructBinaryAst(expr, "!=");
		} else if (expr.BITAND() != null) {
			return this.constructBinaryAst(expr, "&");
		} else if (expr.BITOR() != null) {
			return this.constructBinaryAst(expr, "|");
		} else if (expr.BITXOR() != null) {
			return this.constructBinaryAst(expr, "^");
		}

		return null;
	}

	public Ast walkCastExpression(CastExpressionContext cst) {
		if (cst.unaryExpression() != null) {
			return this.walkUnaryExpression(cst.unaryExpression());
		} else {
			System.out.println("Handle type Cast");
		}
		return null;
	}

	public Ast walkUnaryExpression(UnaryExpressionContext unr) {
		if (unr.postfixExpression() != null) {
			return this.walkPostFixExpression(unr.postfixExpression());
		} else {
			System.out.println("Handle all unary cases now: )");
		}
		return null;
	}

	public Ast walkPostFixExpression(PostfixExpressionContext postexpr) {
		if (postexpr.primaryExpression() != null && postexpr.postfix().isEmpty()) {
			return this.walkPrimaryExpression(postexpr.primaryExpression());
		} else {
			System.out.println("Handle all post fix cases :)");
		}
		return null;
	}

	public Ast walkPrimaryExpression(PrimaryExpressionContext prm) {
		if (prm.identifier() != null) {
			return new IdentifierAst(prm.identifier().getText());
		} else if (prm.constant() != null) {
			return this.walkConstantExpression(prm.constant());
		} else if (prm.stringLiteral() != null) {
			return new StringAst(prm.stringLiteral().getText());
		} else if (prm.LP() != null && prm.expression() != null && prm.RP() != null) {
			var expr = this.walkExpression(prm.expression());
			return new GroupAst(expr);
		} else {
			System.out.println("Todo: Finish the rest of expressions");
		}

		return null;
	}

	public Ast walkConstantExpression(ConstantContext cons) {
		if (cons.HEX_LITERAL() != null) {
			return new IntegerContant(cons.HEX_LITERAL().getText());
		} else if (cons.OCTAL_LITERAL() != null) {
			return new IntegerContant(cons.OCTAL_LITERAL().getText());
		} else if (cons.CHARACTER_LITERAL() != null) {
			return new CharAst(cons.CHARACTER_LITERAL().getText());
		} else if (cons.NIL() != null) {
			return new NilAst();
		} else if (cons.NULL_() != null) {
			return new NullAst();
		} else if (cons.YES() != null) {
			return new BoolAst(BoolAst.Value.YES);
		} else if (cons.NO() != null) {
			return new BoolAst(BoolAst.Value.NO);
		} else if (cons.TRUE() != null) {
			return new BoolAst(BoolAst.Value.TRUE);
		} else if (cons.FALSE() != null) {
			return new BoolAst(BoolAst.Value.FALSE);
		} else if (cons.ADD() == null && cons.SUB() == null && cons.DECIMAL_LITERAL() != null) {
			return new IntegerContant(cons.DECIMAL_LITERAL().getText());
		} else if (cons.ADD() != null && cons.DECIMAL_LITERAL() != null) {
			return new IntegerContant(cons.DECIMAL_LITERAL().getText());
		} else if (cons.SUB() != null && cons.DECIMAL_LITERAL() != null) {
			var num = new IntegerContant(cons.DECIMAL_LITERAL().getText());
			return new NegateAst(num);
		} else if (cons.ADD() == null && cons.SUB() == null && cons.FLOATING_POINT_LITERAL() != null) {
			return new IntegerContant(cons.FLOATING_POINT_LITERAL().getText());
		} else if (cons.ADD() != null && cons.FLOATING_POINT_LITERAL() != null) {
			return new IntegerContant(cons.FLOATING_POINT_LITERAL().getText());
		} else if (cons.SUB() != null && cons.FLOATING_POINT_LITERAL() != null) {
			var num = new IntegerContant(cons.FLOATING_POINT_LITERAL().getText());
			return new NegateAst(num);
		}

		return null;
	}

	public Ast walkDeclarator(DeclaratorContext decl) {
		if (decl.pointer() == null && decl.directDeclarator() != null) {
			return this.walkDirectDeclarator(decl.directDeclarator());
		} else {
			System.out.println("Unreachable: WalkDeclarator");
		}
		return null;
	}

	public Ast walkDirectDeclarator(DirectDeclaratorContext decl) {
		if (decl.identifier() != null && !decl.declaratorSuffix().isEmpty()) {
			System.out.println("Handle array indexing");
		} else if (decl.LP() != null && decl.declarator() != null && decl.RP() != null) {
			System.out.println("Handle unknown");
		} else if (decl.identifier() != null && decl.declaratorSuffix().isEmpty()) {
			return new IdentifierAst(decl.identifier().getText());
		}

		return null;
	}

	public FunctionAst walkFunctionSignature(FunctionSignatureContext funcsig) {
		var decl_specifiers = funcsig.declarationSpecifiers();
		var name = funcsig.identifier().getText();
		var param_list = funcsig.parameterList();

		var type = this.walkDeclarationSpecifiers(decl_specifiers);
		var args_ = this.walkFunctionParamList(param_list);

		var args = args_
						.stream()
						.map(arg -> {
							return (ParamAst) arg;
						})
						.collect(Collectors.toList());

		var fx = new FunctionAst(name, args);
		fx.setType((TypeAst) type);
		return fx;
	}

	public List<Ast> walkFunctionParamList(ParameterListContext params) {
		if (params.COMMA() == null && params.parameterDeclarationList() == null && params.ELIPSIS() != null) {
			// (...)
			// TODO: Handle variadic arguments
		} else if (params.COMMA() != null && params.parameterDeclarationList() != null && params.ELIPSIS() != null) {
			// (int age, ...)
			// TODO: Handle this case
		} else if (params.COMMA() == null && params.parameterDeclarationList() != null && params.ELIPSIS() == null) {
			// (int age, int y) <- Normal case
			var paramdecl = params.parameterDeclarationList();
			return this.walkFunctionParamDeclarationList(paramdecl);
		}

		return null;
	}

	public List<Ast> walkFunctionParamDeclarationList(ParameterDeclarationListContext paramdecl) {
		if (!paramdecl.parameterDeclaration().isEmpty()) {
			var paramList = paramdecl.parameterDeclaration();

			return paramList
							.stream()
							.map(this::walkFunctionParameterDeclaration)
							.collect(Collectors.toList());
		}
		return null;
	}

	public Ast walkFunctionParameterDeclaration(ParameterDeclarationContext paramdecl) {
		var decl_spec = paramdecl.declarationSpecifiers();
		var declarator = paramdecl.declarator();
		var type = this.walkDeclarationSpecifiers(decl_spec);
		var name = declarator.getText(); // TODO: Fix this for other cases of declarators

		return new ParamAst((TypeAst) type, name);
	}

	public Ast walkDeclarationSpecifiers(DeclarationSpecifiersContext declspec) {

		if (!declspec.typeSpecifier().isEmpty()) {
			var type_specifier = declspec.typeSpecifier().getFirst();
			return this.walkTypeSpecifier(type_specifier);
		}

		return null;
	}

	public Ast walkTypeSpecifier(TypeSpecifierContext typespec) {
		TypeAst result = null;
		if (typespec.INT() != null) {
			result = new TypeAst("int");
		} else if (typespec.LONG() != null) {
			result = new TypeAst("long");
		} else if (typespec.SHORT() != null) {
			result = new TypeAst("short");
		} else if (typespec.CHAR() != null) {
			result = new TypeAst("char");
		} else if (typespec.UNSIGNED() != null) {
			result = new TypeAst("unsigned");
		} else if (typespec.SIGNED() != null) {
			result = new TypeAst("signed");
		} else if (typespec.identifier() != null) {
			result = new TypeAst(typespec.identifier().getText());
		} else if (typespec.typeSpecifier() != null && !typespec.MUL().isEmpty()) {
			var lhs = typespec.typeSpecifier();
			var type = (TypeAst) this.walkTypeSpecifier(lhs);
			type.setIsPtr(true);
			type.setPtrCount(typespec.MUL().size());
			result = type;
		}

		return result;
	}
}
