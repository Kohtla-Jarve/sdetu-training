package basics;

public class ArrayAsParam {

	public static void main(String[] args) {
		
		double [] numbers = {1,2,3,4,5,6,7, 8};
	  
		System.out.println("\nMinimum return is: " + minValue(numbers));
		System.out.println("Maximum return is: " + maxValue(numbers));
		System.out.println("Aerage return is: " + avgValue(numbers));
	}

	static double minValue(double[] numbers) {
		double minReturn = numbers[0];
		for (int i = 0; i < numbers.length; i++ ) {
			System.out.print(i + 1 + " ");
			if (numbers[i] < minReturn) {
				minReturn = numbers[i];
			}
		}
		return minReturn;
	}
	
	static double maxValue(double[] numbers) {
		double maxReturn = numbers[0];
		for (int i = 0; i < numbers.length; i++ ) {
			if (numbers[i] > maxReturn) {
				maxReturn = numbers[i];
			}
		}
		return maxReturn;
	}
	
	static double avgValue(double[] numbers) {
		double averageReturn = 0;
		for (int i = 1; i <= numbers.length; i++ ) {
			averageReturn = averageReturn + i;
		}
		return averageReturn/numbers.length;
	}
}
