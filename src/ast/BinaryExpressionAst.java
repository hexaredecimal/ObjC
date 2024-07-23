/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ast;

/**
 *
 * @author hexaredecimal
 */
public class BinaryExpressionAst extends Ast {
	private Ast left; 
	private Ast right; 
	private String op; 

	public BinaryExpressionAst(Ast left, String op, Ast right) {
		this.left = left; 
		this.op = op; 
		this.right = right; 
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(left.toString()); 
		sb.append(" ".concat(this.op).concat(" ")); 
		sb.append(right.toString());
		return sb.toString();
	}
}
