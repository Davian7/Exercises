

// calcuating body mass index



import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); // creating a scanner
		final double KG_POUND = 0.45359237;
		final double METER_PER_INCH = 0.0254;
		final double INCH_PER_FEET = 12;
		System.out.println("Enter your weight"); // prompt the user
			double weight = kb.nextDouble();
		System.out.println("Enter feet");
			double feet = kb.nextDouble();
		System.out.println("Enter inch");
			double inch = kb.nextDouble();
			
			weight*=KG_POUND;
			double heightInInch = (feet * INCH_PER_FEET) + inch;
			double heightInMeter = heightInInch * METER_PER_INCH;
			double BMI = weight/ Math.pow(heightInMeter, 2);
		System.out.printf("BMI is %.2f ", BMI);
		System.out.println();
		
		if(BMI < 18.5)
			System.out.println("Under weight");
		else if( BMI < 25.0)
			System.out.println("Normal");
		else if( BMI < 30.0)
			System.out.println("Over weight");	
		else
			System.out.println("Obese");	
			
			
			
	
	
	
	}

}
