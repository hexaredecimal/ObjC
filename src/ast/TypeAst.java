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
	private int ptrCount; // Counts the number of "*" in int*
	
	public TypeAst(String id) {
		this.id = id; 
		this.isptr = false;
		this.ptrCount = 0;
	}
	
	public TypeAst(String id, boolean isptr) {
		this.id = id; 
		this.isptr = isptr;
		this.ptrCount = 0;
	}

	public void setIsPtr(boolean isptr) {
		this.isptr = isptr;
		this.ptrCount = 1;
	}

	public void setPtrCount(int count) {
		this.ptrCount = count;
	}

	@Override 
	public String toString() {
		return this.id.concat(this.isptr ? "*".repeat(ptrCount) : "");
	}
}
