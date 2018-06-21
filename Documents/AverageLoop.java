/*
 * (Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number. Here is a sample run:
 */

import java.util.Scanner;

public class AverageLoop {

	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	 System.out.print("Enter an integer: "); //prompt the user to enter
	  int num = kb.nextInt();
		
	int positive = 0;
	int negative = 0;
	int counter =  0;
	
	double sum = 0;
	double average = 0;
	
	if(num == 0) {
		System.out.println("No numbers are entered except 0");
		System.exit(1);
	}
	
	while(num != 0) {
	  System.out.print("Enter an integer again: ");
	  if(num > 0) 
		positive++;
		
	   else if(num < 0) 
		negative++;
			
		sum += num;
		counter++;
		num = kb.nextInt();
	}
	average = sum /counter;
		System.out.println("The number of positive is " + positive + "\nThe number of negative is " 
				 + negative + "\nThe sum is " + sum + "\nThe average is " + average );
		
	
	
	
	}

}