import java.util.Scanner;

public class isPalindrone {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter a word:");
		String s = kb.nextLine();
		
		int high = s.length()-1;
		int low = 0;
		
		boolean isPalindrone = true;
		while(low < high) {
		  if(s.charAt(low) != s.charAt(high)) {
			isPalindrone = false;
			break;
		}
		
		  low++;
		  high--;
		}
		
		if(isPalindrone)
			System.out.println("Yes it is");

		else
			System.out.println("NO!!");
	
	}
}