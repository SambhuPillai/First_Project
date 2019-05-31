
public class Conditional {
	public static int add(int firstNumber, int secondNumber, boolean condition) {//introsuce the variables required for the add function to work
		int result;
		result = firstNumber + secondNumber;
		return result;
	}

	public static void arrays() {
		int[] array;
		array = new int[10];
		array[0] = 15;
		array[1] = 1;
		array[2] = 3;
		array[3] = 14;
		array[4] = 5;
		array[5] = 5;
		array[6] = 3;
		array[7] = 5;
		array[8] = 7;
		array[9] = 2;
		for(int i=0;i<10;i++) {
			System.out.println(multiply(array[i],5,false));
		}
	}
	
	public static int multiply(int firstNumber, int secondNumber, boolean condition) {
		if (firstNumber==0) {
			return secondNumber;
		}
		else if (secondNumber==0) {
			return firstNumber;
		}
		else if (condition==true) {
			return firstNumber + secondNumber;
		}
		else {
			return firstNumber * secondNumber;
		}
	}
	
	public static void iteration(int max) {
		for (int i=0; i<=max; i++) {
			System.out.println(multiply(i,i, false));
		}
	}
	
	
}
