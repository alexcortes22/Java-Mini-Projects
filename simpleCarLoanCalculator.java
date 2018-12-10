/*
Title: Simply Car Loan Payment Calculator
Author: Alex Cortes
Purpose: To determine the monthly car payment on a car loan using static
variables for the car loan, the length of the car loan, the interest rate and the downpayment.
*/

public class CarLoan {
	public static void main(String[] args) {
		int carLoan = 10000;
		int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
    if(loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    }else if(downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }else{
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance/months;
      int interest = (interestRate * monthlyBalance)/100;
      int monthlyPayment = monthlyBalance + interest;
      
      System.out.println("The monthly payment for the carloan is: " + monthlyPayment);
    }

	}
}