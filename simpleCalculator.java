/*
Title: Simple Calculator
Author: Alex Cortes
Purpose: To create a simple calculator that adds, subtracts, multiplies, divides and finds the modulus of two numbers.
Methods: @add
				 @subtract
         @multiply
         @divide
         @modulo
*/

public class Calculator {
  public Calculator(){
    
  }
  
  public int add(int a, int b){
    return (a+b);
  }
  
  public int subtract(int a, int b){
    return (a-b);
  }
  
  public int multiply(int a, int b){
    return (a*b);
  }
  
  public int divide(int a, int b){
    if(b == 0){
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    }else{
      return (a/b);
    }
  }
  
  public int modulo(int a, int b){
    if(b == 0){
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    }else{
      return (a%b);
    }
  }
  
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(5,7));
    System.out.println(myCalculator.divide(5,7));
    System.out.println(myCalculator.modulo(5,7));
  }
}