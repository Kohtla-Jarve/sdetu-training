package basics;

public class Lab1 {

	public static void main(String[] args) {
		// 1.  Write a function that takes a value n returns the sum of numbers 1 to n 
		int sumResult = sumOfNumbers(5);
		System.out.println("The sum of the above numbers is: " + sumResult);
	}
	
	static final int sumOfNumbers(int i) {
	  int sumResult = 0;
		for (int x = 1; x <= i; x++) {
			sumResult = sumResult + x ;
			System.out.println(x);
		}
		return sumResult;
	}
}
