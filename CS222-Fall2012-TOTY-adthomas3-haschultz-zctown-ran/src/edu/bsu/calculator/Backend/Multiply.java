package edu.bsu.calculator.Backend;
/**
 * 
 * @author Andrew Thomas, Harrison Schultz, Ran An, Zach Town
 */
public class Multiply {
	
	private static double n1;
	private static double n2;
	
	public Multiply(){
		
	}
	
	public Multiply(double num1, double num2){
		n1 = num1;
		n2 = num2;
	}
	
	public void SetNums(double num1, double num2){
		n1 = num1;
		n2 = num2;
	}
	
	public void SetFirstNum(double num1){
		n1 = num1;
	}
	
	public void SetSecondNum(double num2){
		n2 = num2;
	}
	
	public double Calculate(){
		return n1 * n2;
	}
	public static double Calculate(double num1, double num2){
		return num1 * num2;
	}
}
