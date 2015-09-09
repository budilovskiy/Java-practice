package practice.exercises.exercise2;

import java.util.Random;

public class TestTrigonometricOperations {
	
	static double[] inArray;
	
	/**
	 * Create and return array of given size with random angle values in radians
	 * 
	 * @param size
	 *            - the size of the requested array
	 * @return array with random angle values in radians
	 */
	public static double[] getRandomAnglesArray(int size) {
		double[] array = new double[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = 2 * Math.PI * random.nextDouble();
		}
		return array;
	}

	public static void main(String[] args) {
		
		// Create new array
		inArray = new double[args.length-1];
		
		// Filling array from array of command line arguments
		try {
			for (int i = 0; i < args.length - 1; i++) {
				inArray[i] = Double.parseDouble(args[i]);
			}
			// Last argument is the type of angle (0 for degrees, 1 for radians)
			int angleType = Integer.parseInt(args[args.length-1]);
			// Printing results of operations
			System.out.println("Sum of sines="+ TrigonometricOperations.getSumSines(inArray, angleType));
			System.out.println("Sum of cosines="+ TrigonometricOperations.getSumCosines(inArray, angleType));
			System.out.println("Differense of sines="+ TrigonometricOperations.getDiffSines(inArray, angleType, 5));
			System.out.println("Difference of cosines="+ TrigonometricOperations.getDiffCosines(inArray, angleType, 3));
			System.out.println("Product of sines="+ TrigonometricOperations.getProductSines(inArray, angleType, 8));
			System.out.println("Product of cosines="+ TrigonometricOperations.getProductCosines(inArray, angleType, 7));
		} catch (NumberFormatException e) {
			throw new IllegalAngleException(e.getMessage());
		}
	}
	
}
