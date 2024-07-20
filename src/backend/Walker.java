package backend;

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
		var decls = program.external_declaration();
		for (var decl: decls) {
			if (decl.function_definition() != null) 
				this.walkFuncionDecl(decl.function_definition());
		}
	}

	public void walkFuncionDecl(Function_definitionContext fn) {
		var data_type_info = fn.declaration_specifiers();
		var fn_name_and_args = fn.declarator();
		var compound_stmt = fn.compound_statement();

		Type data_type = this.walkTypeUsage(data_type_info);
		this.walkFunctionDeclarator(fn_name_and_args);
	}



	public void walkFunctionDeclarator(DeclaratorContext decl) {
		
		if (decl.direct_declarator() != null)
			this.walkFunctionDirectDeclarator(decl.direct_declarator());

	}

	public void walkFunctionDirectDeclarator(Direct_declaratorContext dirdecl) {
		if (dirdecl.identifier() != null && dirdecl.declarator_suffix() != null) {
			String func_name = dirdecl.identifier().getText(); 
			System.out.println("" + func_name);
		}
	}
	
	public Type walkTypeUsage(Declaration_specifiersContext decl) {
		Type result = null;
		
		if (decl.type_qualifier() != null) // TODO: Handle types such as unsigned int 
			this.walkTypeQualifier(decl.type_qualifier());
		
		if(decl.type_specifier() != null) // This handles types like int and int*
			result = this.walkTypeSpecifier(decl.type_specifier());
	
		return result;
	}

	public Type walkTypeSpecifier(List<Type_specifierContext> tss) {
		Type result = null;
		for (var ts: tss) {
			if (ts.system_types() != null && ts.pointer() != null) {
				Type systype  = this.walkSystemType(ts.system_types());
				result = new Pointer(systype);
			} else if (ts.system_types() != null) {
				result = this.walkSystemType(ts.system_types());
			}
		}
		return result;
	}
	
	public void walkTypeQualifier(List<Type_qualifierContext> tqs) {
		for (var tq: tqs) {
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
		} else if (systype.FLOAT()!= null) {
			return new FloatingType(32);
		} else if (systype.LONG() != null) {
			return new FloatingType(64);
		}
		return new UserType(systype.IDENTIFIER().getText());
	}
}
