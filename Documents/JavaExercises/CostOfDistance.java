
/*
 * (Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip. Here is a sample run:
 */


import java.util.Scanner;
public class CostOfDistance {




	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the distance");
		double distance = kb.nextDouble();
	
		System.out.println("enter mile per gallon ");
		double mPerG = kb.nextDouble();
	
		System.out.println("enter you cost for driving");
		double cost = kb.nextDouble();

		distance /= mPerG;
		distance *=cost;
		System.out.println("your total cost is $" +( int)( distance*100)/100.0);
	
	
	
	}


}
