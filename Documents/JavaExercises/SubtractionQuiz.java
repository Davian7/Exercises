
/*
 * gives a program that generates five questions 
 * and, after a student answers all
five, reports the number of correct answers. 
The program also displays the time spent on the
test and lists all the questions
*/

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		
		final int NUM_OF_QUESTS = 5;
		int count = 0;
		int correctCount = 0;
		String output = " "; // keep track of the score
		long startTime = System.currentTimeMillis();//before the test is start
		Scanner kb = new Scanner(System.in);
	
		while(count<NUM_OF_QUESTS) {
			int num1 = (int)(Math.random()*100);
			int num2 = (int)(Math.random()*100);
	
			if(num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			System.out.print("What is " + num1+ " - "
						+ num2+ "?");
			int answer = kb.nextInt();
			if(num1-num2 == answer) {
				System.out.println("You are correct");
				correctCount++;
			}
			else 
				System.out.println("Wrong");
				
			count++;
		output += "\n" + num1 + " - " + num2 + " = " + + answer
				+((num1-num2==answer)?" correct " : " wrong ");// list all of the questions
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime-startTime;
		
		System.out.println("The correctCount is " + correctCount+"\n" + "Test time is "
						+ testTime/1000 +"seconds" + "\n" + ""+output);

	
	
	}

}
