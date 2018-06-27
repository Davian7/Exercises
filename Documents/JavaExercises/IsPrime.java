public class IsPrime {

	
	public static void main(String[] args) {
		System.out.println("The first 30 prime numbers are: ");
		printNum(30);
	
	}


	public static void printNum(int numOfPrimes) {
		final int PRIME_PER_LINE = 10;
		int count = 0;
		int number = 2;
	
		while(count < numOfPrimes) {
			if(isPrime(number)) { //invoke prime method to check if number is prime
				count++;			// then increment the numberOF Prime you want (count)
		
			if(count % PRIME_PER_LINE == 0)//when the count is increment it check
				System.out.printf("%-5s\n", number);//if is divisible by PRIME_PER_LINE(10)then if true, then println if not print 
			else
			  System.out.printf("%-5s", number);
			}
		
		number++; // increment the number
		
		}
	}




   public static boolean isPrime(int num) { //boolean return type method
	   for(int div = 2; div <= num/2; div++) { //eg.when the num is 10...10 divide by 2 is 5. therefore, looping 4 times
		 if(num % div == 0)//if num modulo div then it's not prime.therefore return false;
			return false;
	   }	// end of for loop.
	return true;// return true if the number is prime;
   }

}
