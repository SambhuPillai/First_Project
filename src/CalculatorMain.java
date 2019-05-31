
public class CalculatorMain {
	public static void main(String[] args) {
		System.out.println("Hello World");
		//Calculator calculator = new Calculator(); This is what we would have done is the Clalculator class was npot static. Because we have meda ithis class staic, we can avoid this and go to the next line.
		int additionResult = Calculator.add(10, 5);
		System.out.println(additionResult);
		
		int multiplyResult = Calculator.multiply(10, 5);
		System.out.println(multiplyResult);
		
		int divideResult = Calculator.divide(10,5);
		System.out.println(divideResult);
		
		int subtractResult = Calculator.subtract(10,5);
		System.out.println(subtractResult);
		
		int conditionalResult = Conditional.multiply(10,5, true);
		System.out.println(conditionalResult);
		/*Conditional.iteration(12);*/
		
		
		
		Conditional.arrays();
	}
}
