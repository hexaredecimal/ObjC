/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rtc;

/**
 *
 * @author hexaredecimal
 */
public class Pointer extends Type {
	private Type internal; 

	public Pointer(Type pointee) {
		this.internal = pointee;
	}
	
	@Override
	public String toString() {
		return "w"; // QBE pointers are weird :)
	}
	
	@Override
	public boolean isSystemType() {
		return true;
	}
}
