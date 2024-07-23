/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ast;

/**
 *
 * @author hexaredecimal
 */
public class TypeAst extends Ast {
	private final String id; 
	private boolean isptr; 
	
	public TypeAst(String id) {
		this.id = id; 
		this.isptr = false;
	}
	
	public TypeAst(String id, boolean isptr) {
		this.id = id; 
		this.isptr = isptr;
	}

	public void setIsPtr(boolean isptr) {
		this.isptr = isptr;
	}

	@Override 
	public String toString() {
		return this.id.concat(this.isptr ? "*" : "");
	}
}
