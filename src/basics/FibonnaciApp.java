package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
//
		int factResult = factorial(5);
		System.out.println("\nThe Factorial of the above numbers is " + factResult );
	}
	
	static int result = 1;
	static final int factorial(int y) {
		
		System.out.print(y+"*");
		if (y == 0) {
			return 1;
		}
		if ( y > 1 ) {
			factorial(y - 1);
		}
		
		return result *= y;		
	}
	
}
