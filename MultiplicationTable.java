package math;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("\t\tMultiplication Table");
	
	
	System.out.print("     ");
	for(int j = 1; j<=12; j++)
		System.out.printf("%4d",j);
	
	System.out.println("\n     ------------------------------------------------");
	
	for(int i = 1; i<=12; i++) {
		System.out.printf("%4d|", i);
		for(int j = 1; j<=12; j++) {
			System.out.printf("%4d", i * j);
		}
	System.out.println("");
	}
	
	
	
	
	}

}
