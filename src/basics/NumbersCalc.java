package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		
	printName();
	int result = addNumbers(5 , 7);
	System.out.println("the result is: " + result);
	}
	
	
	

	private static int addNumbers(int i, int j) {
		return i + j;
		
	}




	static void printName() {
		System.out.println("My Name is Vlad");
		
	}

}
