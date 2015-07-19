package practice.excercises.excercize1;

import java.util.Arrays;

public class TestNumberOperations {

	private static int[] intNumbers;
	private static double[] doubleNumbers;

	public static void main(String[] args) {

		try {
			intNumbers = intCommandLineInput(args);
			System.out.println(Arrays.toString(intNumbers));
			System.out.println("Average: "
					+ NumbersOperations.getAverage(intNumbers));
			System.out.println("Sum: "
					+ NumbersOperations.getSumNumbers(intNumbers));
			System.out.println("Difference: "
					+ NumbersOperations.getDifferenceNumbers(intNumbers));
			System.out.println("Product: "
					+ NumbersOperations.getProductNumbers(intNumbers));
			System.out.println("Maximum: "
					+ NumbersOperations.getMax(intNumbers));
			System.out.println("Mimimum: "
					+ NumbersOperations.getMin(intNumbers));
		} catch (IllegalArrayException e) {
			System.out.println(e.getExceptionMessage(intNumbers));
		}

		System.out.println();
		try {
			doubleNumbers = doubleCommandLineInput(args);
			System.out.println(Arrays.toString(doubleNumbers));
			System.out.println("Average: "
					+ NumbersOperations.getAverage(doubleNumbers));
			System.out.println("Sum: "
					+ NumbersOperations.getSumNumbers(doubleNumbers));
			System.out.println("Difference: "
					+ NumbersOperations.getDifferenceNumbers(doubleNumbers));
			System.out.println("Product: "
					+ NumbersOperations.getProductNumbers(doubleNumbers));
			System.out.println("Maximum: "
					+ NumbersOperations.getMax(doubleNumbers));
			System.out.println("Mimimum: "
					+ NumbersOperations.getMin(doubleNumbers));
		} catch (IllegalArrayException e) {
			System.out.println(e.getExceptionMessage(doubleNumbers));
		}

		System.out.println();
		int[] randomIntNumbers = intRandomInput(10);
		System.out.println(Arrays.toString(randomIntNumbers));
		System.out.println("Average: "
				+ NumbersOperations.getAverage(randomIntNumbers));
		System.out.println("Sum: "
				+ NumbersOperations.getSumNumbers(randomIntNumbers));
		System.out.println("Difference: "
				+ NumbersOperations.getDifferenceNumbers(randomIntNumbers));
		System.out.println("Product: "
				+ NumbersOperations.getProductNumbers(randomIntNumbers));
		System.out.println("Maximum: "
				+ NumbersOperations.getMax(randomIntNumbers));
		System.out.println("Mimimum: "
				+ NumbersOperations.getMin(randomIntNumbers));

		System.out.println();
		double[] doubleIntNumbers = doubleRandomInput(10);
		System.out.println(Arrays.toString(doubleIntNumbers));
		System.out.println("Average: "
				+ NumbersOperations.getAverage(doubleIntNumbers));
		System.out.println("Sum: "
				+ NumbersOperations.getSumNumbers(doubleIntNumbers));
		System.out.println("Difference: "
				+ NumbersOperations.getDifferenceNumbers(doubleIntNumbers));
		System.out.println("Product: "
				+ NumbersOperations.getProductNumbers(doubleIntNumbers));
		System.out.println("Maximum: "
				+ NumbersOperations.getMax(doubleIntNumbers));
		System.out.println("Mimimum: "
				+ NumbersOperations.getMin(doubleIntNumbers));

	}

	/**
	 * Fills the array of numbers with integer numbers from command-line
	 * arguments
	 * 
	 * @param args
	 *            the array of command-line parameters
	 * @throws IllegalArrayException
	 */
	private static int[] intCommandLineInput(String[] args)
			throws IllegalArrayException {
		int[] intNumbers = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			try {
				intNumbers[i] = Integer.parseInt(args[i]);
			} catch (NumberFormatException ex1) {
				intNumbers = null;
				throw new IllegalArrayException(args[i]);
			}
		}
		return intNumbers;
	}

	/**
	 * Fills the array of numbers with double numbers from command-line
	 * arguments
	 * 
	 * @param args
	 *            the array of command-line parameters
	 * @throws IllegalArrayException
	 */
	private static double[] doubleCommandLineInput(String[] args)
			throws IllegalArrayException {
		double[] doubleNumbers = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			try {
				doubleNumbers[i] = Double.parseDouble(args[i]);
			} catch (NumberFormatException ex1) {
				doubleNumbers = null;
				throw new IllegalArrayException(args[i]);
			}
		}
		return doubleNumbers;
	}

	/**
	 * Fills the array of numbers with random integer numbers
	 * 
	 * @param length
	 *            the length of array
	 */
	private static int[] intRandomInput(int length) {
		int[] numbers = new int[length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		return numbers;
	}

	/**
	 * Fills the array of numbers with random double numbers
	 * 
	 * @param length
	 *            the length of array
	 */
	private static double[] doubleRandomInput(int length) {
		double[] numbers = new double[length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.random() * 100;
		}
		return numbers;
	}
}
