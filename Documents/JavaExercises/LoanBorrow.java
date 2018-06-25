import java.util.Scanner;

public class LoanBorrow {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter annual interest rate, e.g., 7.25%: ");
		 double annualInterestRate = input.nextDouble();
		
		 // monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		 // Enter number of years
		 System.out.print(
		 "Enter number of years as an integer, e.g., 5: ");
		 int numberOfYears = input.nextInt();
		
		 // Enter loan amount
		 System.out.print("Enter loan amount, e.g., 120000.95: ");
		 double loanAmount = input.nextDouble();
		
		 // Calculate payment
		 double monthlyPayment = loanAmount * monthlyInterestRate
				 / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		 double totalPayment = monthlyPayment * numberOfYears * 12;
		 
		 double profit = totalPayment - loanAmount;
		 
		  System.out.println("The monthly payment is $" +
		  (int)(monthlyPayment * 100) / 100.0);
		  System.out.println("The total payment is $" +
		  (int)(totalPayment * 100) / 100.0);
		  System.out.println("Profit the bank make " + (int)(profit *100)/100.0);
	}

}
