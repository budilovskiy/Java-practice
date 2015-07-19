/*
 * 1. Реализовать приложение, для введенной с консоли последовательности целых
 * чисел вычисляющее следующие функции- нахождение среднего значения,
 * максимального значения, минимального значения, произведения, суммы, разности
 * значений. В качестве объекта, применяемого для хранения последовательности
 * целых чисел, использовать массив. Методы, реализующие данные функции должны
 * иметь прототипы следующего вида:
 *  public static int getSumNumbers(int[] numbers); 
 * 2. Дополнить приложение из упражнения 1, методами, реализующими
 * аналогичные операции над числами типа Double, перегружающие одноименные
 * методы реализованные в упражнении 1, с функцией проверки вводимых значений
 * на соответствие тому или иному типу. Проверку выполнять в методе main
 * приложения. В случае если хотя бы одно из значений не соответствует одному из
 * заданных ти- пов, в консоль должно быть выведено сообщение об ошибке и 
 * программа должна завершить свою работу. 
 * 3. Изменить приложение реализованное в упражнение 2 таким образом, чтобы 
 * последовательность чисел передавалась как параметр командной строки. 
 * 4. Спроектировать и реализовать класс для обработки исключительной ситуации, 
 * возникающей в том случае, если элемент последовательности не является числом, 
 * с возможностью представления ин формации об элементе, обработка которого вызвала 
 * исключительную ситуацию.
 * Изменить приложение, таким образом, чтобы метод разбора последовательности
 * обладал возможностью генерировать исключительную ситуацию являющуюся
 * объектом заданного класса. 
 * 5. Дополнить приложение таким образом, чтобы имелась возможность формирования 
 * исходной числовой последовательности со стоящих из чисел сформированных генератором 
 * случайных чисел. 
 * 6. Реализовать класс, в который выделены методы, реализованные в пунктах 1-5.
 * 
 */
package practice.exercises.exercise1;

public class NumbersOperations {

	/**
	 * Calculates sum of numbers in the given array of integers
	 * 
	 * @param numbers the array that contains numbers to be summarized
	 * @return the sum of numbers that are stored in the given array
	 */
	public static int getSumNumbers(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	/**
	 * Calculates sum of numbers in the given array of doubles
	 * 
	 * @param numbers the array that contains numbers to be summarized
	 * @return the sum of numbers that are stored in the given array
	 */
	public static double getSumNumbers(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	/**
	 * Calculates product of numbers in the given array of integers
	 * 
	 * @param numbers the array that contains numbers to be multiplied
	 * @return the product of numbers that are stored in the given array
	 */
	public static int getProductNumbers(int[] numbers) {
		int product = 1;
		for (int number : numbers) {
			product *= number;
		}
		return product;
	}
	
	/**
	 * Calculates product of numbers in the given array of doubles
	 * 
	 * @param numbers the array that contains numbers to be multiplied
	 * @return the product of numbers that are stored in the given array
	 */
	public static double getProductNumbers(double[] numbers) {
		double product = 1;
		for (double number : numbers) {
			product *= number;
		}
		return product;
	}
	
	/**
	 * Calculates difference of numbers in the given array of integers
	 * 
	 * @param numbers the array that contains numbers to be substract
	 * @return the difference of numbers that are stored in the given array
	 */
	public static int getDifferenceNumbers(int[] numbers) {
		int diff = 0;
		for (int number : numbers) {
			diff -= number;
		}
		return diff;
	}
	
	/**
	 * Calculates difference of numbers in the given array of doubles
	 * 
	 * @param numbers the array that contains numbers to be substract
	 * @return the difference of numbers that are stored in the given array
	 */
	public static double getDifferenceNumbers(double[] numbers) {
		double diff = 0;
		for (double number : numbers) {
			diff -= number;
		}
		return diff;
	}

	/**
	 * Calculates average of numbers in the given array of integers
	 * 
	 * @param numbers the array that contains numbers
	 * @return the average of numbers that are stored in the given array
	 */
	public static double getAverage(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum / (double) numbers.length;
	}
	
	/**
	 * Calculates average of numbers in the given array of doubles
	 * 
	 * @param numbers the array that contains numbers
	 * @return the average of numbers that are stored in the given array
	 */
	public static double getAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	/**
	 * Returns the greatest of numbers in the given array of integers. 
	 * If the numbers have the same value, the result is that same value.
	 * 
	 * @param numbers the array that contains numbers
	 * @return the lagest number that are stored in the given array
	 */
	public static int getMax(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	/**
	 * Returns the greatest of numbers in the given array of doubles. 
	 * If the numbers have the same value, the result is that same value.
	 * 
	 * @param numbers the array that contains numbers
	 * @return the lagest number that are stored in the given array
	 */
	public static double getMax(double[] numbers) {
		double max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	/**
	 * Returns the smallest of numbers in the given array of integers. 
	 * If the numbers have the same value, the result is that same value.
	 * 
	 * @param numbers the array that contains numbers
	 * @return the smallest number that are stored in the given array
	 */
	public static int getMin(int[] numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	/**
	 * Returns the smallest of numbers in the given array of doubles. 
	 * If the numbers have the same value, the result is that same value.
	 * 
	 * @param numbers the array that contains numbers
	 * @return the smallest number that are stored in the given array
	 */
	public static double getMin(double[] numbers) {
		double min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

}
