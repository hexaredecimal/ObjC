package backend;

import ast.Ast;
import ast.FloatingPointConstant;
import ast.FunctionAst;
import ast.IdentifierAst;
import ast.IntegerContant;
import ast.NsStringAst;
import ast.ParamAst;
import ast.StringAst;
import java.util.ArrayList;
import java.util.List;
import parser.ObjCParser.*;
import rtc.FloatingType;
import rtc.IntType;
import rtc.Pointer;
import rtc.Type;
import rtc.UserType;

/**
 *
 * @author hexaredecimal
 */
public class Walker {

	public void walkProgram(ProgramContext program) {
		var decls
						= program.external_declaration();
		for (var decl : decls) {
			if (decl.function_definition() != null) {
				this.walkFuncionDecl(decl.function_definition());
			}
		}
	}

	public void walkFuncionDecl(Function_definitionContext fn) {
		var data_type_info
						= fn.declaration_specifiers();
		var fn_name_and_args
						= fn.declarator();
		var compound_stmt
						= fn.compound_statement();

		Type data_type
						= this.walkTypeUsage(data_type_info);
		var func
						= this.walkFunctionDeclarator(fn_name_and_args);
		func.setType(data_type);

		this.walkFunctionBodyCompound(compound_stmt);
		System.out.println("" + func);
	}

	public void walkFunctionBodyCompound(Compound_statementContext comp) {
		if (comp.LBRACE() != null && comp.RBRACE() != null) {
			// Antlr re-wrote our program with declaration on top. 
			// I have to be careful with this as I'm not used to this
			// kind of parsing. 

			var decls
							= comp.declaration();
			var stmt
							= comp.statement_list();

			for (var decl : decls) {
				this.walkLocalVariableDeclaration(decl);
			}
		}
	}

	public void walkLocalVariableDeclaration(DeclarationContext vardecl) {
		var data_type_info
						= vardecl.declaration_specifiers();
		Type data_type
						= this.walkTypeUsage(data_type_info);
		var initializers
						= vardecl.init_declarator_list();
		var var_list
						= initializers.init_declarator();

		for (var variable : var_list) {
			var name
							= variable.declarator().getText();
			if (variable.initializer() != null) {
				var init
								= variable.initializer();
				var value = this.walkVariableInitializerExpression(init);
				System.out.println(data_type  + " " + name + " = " + value + ";");
			}
		}
	}

	public Ast walkVariableInitializerExpression(InitializerContext ctx) {
		var expr
						= ctx.assignment_expression();

		if (expr.unary_expression() != null) {
			System.out.println("UNARY");
		}

		if (expr.conditional_expression() != null) {
			var cond_expr
							= expr.conditional_expression();
			return this.walkConditionalExpression(cond_expr);
		}

		return null;
	}

	public Ast walkConditionalExpression(Conditional_expressionContext cond) {
		if (cond.QUESTION() != null) { // TODO: handle -> 10 ?

			return null;
		}

		var logical
						= cond.logical_or_expression();
		return this.walkLogicalOrExpression(logical);
	}

	public Ast walkLogicalOrExpression(Logical_or_expressionContext lor) {

		if (lor.OR().isEmpty() && lor.logical_and_expression() != null) {
			var logical
							= lor.logical_and_expression().getFirst();
			return this.walkLogicalAndExpression(logical);
		} else if (lor.OR() != null && lor.logical_and_expression() != null) { // TODO: handle -> || ....
		}

		return null;
	}

	public Ast walkLogicalAndExpression(Logical_and_expressionContext lan) {
		if (lan.AND().isEmpty() && lan.inclusive_or_expression() != null) {
			var or_expr
							= lan.inclusive_or_expression().getFirst();
			return this.walkInclusiveOrExpression(or_expr);
		} else if (lan.AND() != null && lan.inclusive_or_expression() != null) {
		}
		return null;
	}

	public Ast walkInclusiveOrExpression(Inclusive_or_expressionContext incl) {
		if (incl.BITOR().isEmpty() && incl.exclusive_or_expression() != null) {
			var excl
							= incl.exclusive_or_expression().getFirst();
			return this.walkExclusiveOrExpression(excl);
		} else if (incl.BITOR() != null && incl.exclusive_or_expression() != null) {

		}

		return null;
	}

	public Ast walkExclusiveOrExpression(Exclusive_or_expressionContext excl) {
		if (excl.CARET().isEmpty() && excl.and_expression() != null) {
			var and_expr
							= excl.and_expression().getFirst();
			return this.walkAndExpression(and_expr);
		} else if (excl.CARET() != null && excl.and_expression() != null) {

		}
		return null;
	}

	public Ast walkAndExpression(And_expressionContext aec) {
		if (aec.equality_expression() != null) {
			var eqexpr
							= aec.equality_expression().getFirst();
			return this.walkEqualityExpression(eqexpr);
		}

		return null;
	}

	public Ast walkEqualityExpression(Equality_expressionContext eq) {
		if (eq.EQUAL().isEmpty() && eq.NOTEQUAL().isEmpty() && eq.relational_expression() != null) {
			var relational
							= eq.relational_expression().getFirst();
			return this.walkRelationalExpression(relational);
		}

		// TODO: Handle Equality 
		return null;
	}

	public Ast walkRelationalExpression(Relational_expressionContext rel) {
		if (rel.GE().isEmpty()
						&& rel.GT().isEmpty()
						&& rel.LE().isEmpty()
						&& rel.LT().isEmpty()
						&& rel.shift_expression() != null) {
			var shift
							= rel.shift_expression().getFirst();
			return this.walkShiftExpression(shift);
		} else if (!rel.GE().isEmpty() && rel.shift_expression() != null) {

		} else if (!rel.GT().isEmpty() && rel.shift_expression() != null) {

		} else if (!rel.LE().isEmpty() && rel.shift_expression() != null) {

		} else if (!rel.LT().isEmpty() && rel.shift_expression() != null) {

		}

		return null;
	}

	public Ast walkShiftExpression(Shift_expressionContext shft) {
		if (shft.SHIFT_L().isEmpty() && shft.SHIFT_R().isEmpty() && !shft.additive_expression().isEmpty()) {
			var additive
							= shft.additive_expression().getFirst();
			return this.walkAdditiveExpression(additive);
		} else if (shft.SHIFT_L().isEmpty() && !shft.additive_expression().isEmpty()) {

		}
		return null;
	}

	public Ast walkAdditiveExpression(Additive_expressionContext addtv) {
		if (addtv.ADD().isEmpty() && addtv.SUB().isEmpty() && !addtv.multiplicative_expression().isEmpty()) {
			var mutliplicative
							= addtv.multiplicative_expression().getFirst();
			return this.walkMultiplicativeExpression(mutliplicative);
		} else if (!addtv.ADD().isEmpty() && !addtv.multiplicative_expression().isEmpty()) {
		} else if (!addtv.SUB().isEmpty() && !addtv.multiplicative_expression().isEmpty()) {
		}
		return null;
	}

	public Ast walkMultiplicativeExpression(Multiplicative_expressionContext mule) {
		if (mule.DIV().isEmpty() && mule.MUL().isEmpty() && mule.MOD().isEmpty() && !mule.cast_expression().isEmpty()) {
			var cast_expr
							= mule.cast_expression().getFirst();
			return this.walkCastExpression(cast_expr);
		} else if (!mule.DIV().isEmpty() && !mule.cast_expression().isEmpty()) {

		} else if (!mule.MUL().isEmpty() && !mule.cast_expression().isEmpty()) {

		} else if (!mule.MOD().isEmpty() && !mule.cast_expression().isEmpty()) {

		}

		return null;
	}

	public Ast walkCastExpression(Cast_expressionContext cst) {
		if (cst.LPAREN() != null && cst.RPAREN() != null) { // Handle -> (int) x;

		} else if (cst.unary_expression() != null) {
			var unary
							= cst.unary_expression();
			return this.walkUnaryExpression(unary);
		}

		return null;
	}

	public Ast walkUnaryExpression(Unary_expressionContext unr) {
		if (unr.postfix_expression() != null) {
			var postfix
							= unr.postfix_expression();
			return this.walkPostfixExpression(postfix);
		}

		//TODO handle all cases for this
		return null;
	}

	public Ast walkPostfixExpression(Postfix_expressionContext pst) {
		if (pst.primary_expression() != null) {
			var primary
							= pst.primary_expression();
			return this.walkPrimaryExpression(primary);
		}

		//TODO handle all cases for this
		return null;
	}

	public Ast walkPrimaryExpression(Primary_expressionContext primary) {
		if (primary.IDENTIFIER() != null) {
			String id
							= primary.IDENTIFIER().getText();
			return new IdentifierAst(id);
		} else if (primary.constant() != null) {
			var cnst
							= primary.constant();
			return this.walkConstantExpression(cnst);
		} else if (primary.STRING_LITERAL() != null) {
			String val = primary.STRING_LITERAL().getText(); 
			if (val.charAt(0) == '@') {
				val = val.substring(1);
				return new NsStringAst(val);
			}  else { 
				return new StringAst(val);
			}
		}

		// TODO: Handle all primary expression nodes
		return null;
	}

	public Ast walkConstantExpression(ConstantContext cont) {
		Ast constant
						= null;
		if (cont.DECIMAL_LITERAL() != null) {
			var num
							= cont.DECIMAL_LITERAL().getText();
			constant
							= new IntegerContant(num);
		} else if (cont.HEX_LITERAL() != null) {
			var num
							= cont.DECIMAL_LITERAL().getText();
			constant
							= new IntegerContant(num);
		} else if (cont.OCTAL_LITERAL() != null) {
			var num
							= cont.DECIMAL_LITERAL().getText();
			constant
							= new IntegerContant(num);
		} else if (cont.FLOATING_POINT_LITERAL() != null) {
			var num
							= cont.FLOATING_POINT_LITERAL().getText().toLowerCase();
			int size
							= num.length();
			var end
							= num.charAt(size - 1);

			if (end == 'f') {
				num
								= num.substring(0, size - 1);
				FloatingPointConstant fpc
								= new FloatingPointConstant(num);
				constant
								= fpc;
			} else if (end == 'd') {
				num
								= num.substring(0, size - 1);
				FloatingPointConstant fpc
								= new FloatingPointConstant(num);
				fpc.setIsDouble(true);
				constant
								= fpc;
			} else {
				FloatingPointConstant fpc
								= new FloatingPointConstant(num);
				constant
								= fpc;
			}

		}

		return constant;
	}

	public FunctionAst walkFunctionDeclarator(DeclaratorContext decl) {

		if (decl.direct_declarator() != null) {
			return this.walkFunctionDirectDeclarator(decl.direct_declarator());
		}
		return null;
	}

	public FunctionAst walkFunctionDirectDeclarator(Direct_declaratorContext dirdecl) {
		if (dirdecl.identifier() != null && dirdecl.declarator_suffix() != null) {
			String func_name
							= dirdecl.identifier().getText();

			var declsufix
							= dirdecl.declarator_suffix().getFirst();

			var params
							= this.walkFunctionDeclaratorSuffix(declsufix);

			return new FunctionAst(func_name, params);
		}

		return null;
	}

	public List<ParamAst> walkFunctionDeclaratorSuffix(Declarator_suffixContext declsuf) {
		if (declsuf.LPAREN() != null && declsuf.parameter_list() != null
						&& declsuf.RPAREN() != null) {
			return this.walkFunctionParameterList(declsuf.parameter_list());
		} else if (declsuf.LPAREN() != null && declsuf.RPAREN() != null) {
			return new ArrayList<>();
		}

		return null;
	}

	public List<ParamAst> walkFunctionParameterList(Parameter_listContext params) {

		if (params.parameter_declaration_list() != null && params.COMMA() != null
						&& params.ELIPSIS() != null) {
			//TODO: Handle var args
			System.out.println("Varargs");
		} else if (params.parameter_declaration_list() != null) {
			return this.walkFunctionParameterDeclList(params.parameter_declaration_list());
		}

		return null;
	}

	public List<ParamAst> walkFunctionParameterDeclList(Parameter_declaration_listContext decllist) {
		if (decllist.parameter_declaration() != null) {
			var decls
							= decllist.parameter_declaration();
			List<ParamAst> parameters
							= new ArrayList<>();
			for (var decl : decls) {
				var param
								= this.walkFunctionParameterDeclaration(decl);
				parameters.add(param);
			}
			return parameters;
		}

		return null;
	}

	public ParamAst walkFunctionParameterDeclaration(Parameter_declarationContext pardecl) {
		var param_decl
						= pardecl.declaration_specifiers();
		var tss
						= param_decl.type_specifier();

		ParamAst node
						= null;
		if (tss.size() == 2) { // Type name
			Type type
							= null;
			var ts
							= tss.getFirst();
			if (ts.system_types() != null) {
				type
								= this.walkSystemType(ts.system_types());
			}

			String name
							= tss.getLast().getText();

			node
							= new ParamAst(type, name);
		} else {
			var last
							= tss.getLast();
			if (last.system_types() != null && last.pointer() != null) {
				var type
								= this.walkSystemType(last.system_types());

				type
								= new Pointer(type);

				var last_child
								= last.pointer().declaration_specifiers();
				var name
								= last_child.getText();
				node
								= new ParamAst(type, name);
			}
		}

		return node;
	}

	public Type walkTypeUsage(Declaration_specifiersContext decl) {
		Type result
						= null;

		if (decl.type_qualifier() != null) // TODO: Handle types such as unsigned int 
		{
			this.walkTypeQualifier(decl.type_qualifier());
		}

		if (decl.type_specifier() != null) // This handles types like int and int*
		{
			result
							= this.walkTypeSpecifier(decl.type_specifier());
		}

		return result;
	}

	public Type walkTypeSpecifier(List<Type_specifierContext> tss) {
		Type result
						= null;
		for (var ts : tss) {
			if (ts.system_types() != null && ts.pointer() != null) {
				Type systype
								= this.walkSystemType(ts.system_types());
				result
								= new Pointer(systype);
			} else if (ts.system_types() != null) {
				result
								= this.walkSystemType(ts.system_types());
			}
		}
		return result;
	}

	public void walkTypeQualifier(List<Type_qualifierContext> tqs) {
		for (var tq : tqs) {
			System.out.println("TQ: " + tq);
		}
	}

	public Type walkSystemType(System_typesContext systype) {
		if (systype.CHAR() != null) {
			return new IntType(8);
		} else if (systype.SHORT() != null) {
			return new IntType(16);
		} else if (systype.INT() != null) {
			return new IntType(32);
		} else if (systype.LONG() != null) {
			return new IntType(64);
		} else if (systype.FLOAT() != null) {
			return new FloatingType(32);
		} else if (systype.LONG() != null) {
			return new FloatingType(64);
		}
		return new UserType(systype.IDENTIFIER().getText());
	}
}
