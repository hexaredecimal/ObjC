package backend;

import ast.Ast;
import ast.TypeAst;
import parser.ObjectiveCParser;
import parser.ObjectiveCParser.DeclarationSpecifiersContext;
import parser.ObjectiveCParser.TypeSpecifierContext;

public class Walker {

	public void walkTranslationUnit(ObjectiveCParser.TranslationUnitContext translation) {
		var top_level_declarations = translation.topLevelDeclaration();

		for (var topleveldecl : top_level_declarations) {
			this.walkTopLevelDeclaration(topleveldecl);
		}

	}

	public void walkTopLevelDeclaration(ObjectiveCParser.TopLevelDeclarationContext topleveldecl) {

		if (topleveldecl.functionDefinition() != null) {
			var func = topleveldecl.functionDefinition();
			this.walkFunctionDefinition(func);
		}
	}

	public void walkFunctionDefinition(ObjectiveCParser.FunctionDefinitionContext funcdef) {
		var func_sig = funcdef.functionSignature();
		var body_ = funcdef.compoundStatement();

		this.walkFunctionSignature(func_sig);
	}

	public void walkFunctionSignature(ObjectiveCParser.FunctionSignatureContext funcsig) {
		var decl_specifiers = funcsig.declarationSpecifiers();
		var name = funcsig.identifier().getText();
		var param_list = funcsig.parameterList();

		var type = this.walkFunctionDeclarationSpecifiers(decl_specifiers);
		System.out.println("" + type);
	}

	public Ast walkFunctionDeclarationSpecifiers(DeclarationSpecifiersContext declspec) {

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
		} else if (typespec.typeSpecifier() != null && typespec.pointer() != null) {
			var lhs = typespec.typeSpecifier();
			var type = (TypeAst) this.walkTypeSpecifier(lhs);
			type.setIsPtr(true);
			result = type;
		}

		return result;
	}
}
