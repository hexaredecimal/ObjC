/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ast;

/**
 *
 * @author hexaredecimal
 */
public class FloatingPointConstant extends Ast {
	private String num; 
	private boolean isDouble; 

	public FloatingPointConstant(String num) {
		this.num = num; 
		this.isDouble = false;
	}

	public void setIsDouble(boolean isDouble) {
		this.isDouble = isDouble; 
	} 

	@Override
	public String toString() {
		return this.num + (this.isDouble ? "d" : "f");
	}
}
