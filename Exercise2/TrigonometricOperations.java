package practice.exercises.exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 1. Реализовать приложение, вычисляющее для последовательности чисел, 
 * представляющих величины углов, следующие тригонометрические функции:
 * • сумма синусов/косинусов значений,
 * • разность синусов/косинусов значений,
 * • произведение синусов/косинусов введенных значений.
 * Единица измерения углов должна указываться как параметр командной строки. 
 * Для представления единиц измерения и спользуйте константы с типом int. 
 * Для хранения значений, необходимо использовать массив с типом double. 
 * Объявления методов должны выглядеть следующим образом:
 *
 * @param angles – массив значений углов;
 * @param type -единица измерения, имеющее значение од-
 * ной из констант
 * @return сумму синусов значений углов;
 * 
 * public static double getSumSinuses(double[] angles,int type);
 * 
 * 2. С помощью перегрузки реализуйте методы, позволяющие
 * указывать количество значащих знаков для результатов выполнения
 * операций.
 * 
 * 3. Дополнить приложение, таким образом, чтобы имелась воз-
 * можность формирования исходной числовой последовательности чис-
 * лами, сформированными генератором случайных чисел;
 * 
 * 4. Реализовать класс объявляемой исключительной ситуации,
 * для проверки корректности вводимых данных. Объект данной исклю-
 * чительной ситуации содержать в себе информацию о значении, обра-
 * ботка которого вызвала данную исключительную ситуацию.
 * 
 * 5. Реализовать класс, в котором будут содержаться все описан-
 * ные выше функциональные возможности. 
 *
 */
public class TrigonometricOperations {
	private static final int DEGREES = 0;
	private static final int RADIANS = 1;

	/**
	 * Calculate sum of sines of angles
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @return sum of sines of angles
	 */
	public static double getSumSines(double[] angles, int type) {
		double res = 0;
		for (double angle : angles) {
			if (type == DEGREES) {
				res += Math.sin(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res += Math.sin(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		return res;
	}

	/**
	 * Calculate sum of cosines of angles
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @return sum of cosines of angles
	 */
	public static double getSumCosines(double[] angles, int type) {
		double res = 0;
		for (double angle : angles) {
			if (type == DEGREES) {
				res += Math.cos(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res += Math.cos(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		return res;
	}

	/**
	 * Calculate difference of sines of angles 
	 * (не понятно, что значит разность)
	 * (отрицательное значение суммы?)
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @return difference of sines of angles
	 */
	public static double getDiffSines(double[] angles, int type) {
		double res = 0;
		for (double angle : angles) {
			if (type == DEGREES) {
				res -= Math.sin(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res -= Math.sin(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		return res;
	}

	/**
	 * Calculate difference of cosines of angles 
	 * (не понятно, что значит разность) 
	 * (отрицательное значение суммы?)
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @return difference of cosines of angles
	 */
	public static double getDiffCosines(double[] angles, int type) {
		double res = 0;
		for (double angle : angles) {
			if (type == DEGREES) {
				res -= Math.cos(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res -= Math.cos(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		return res;
	}

	/**
	 * Calculate product of sines of angles
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @return product of sines of angles
	 */
	public static double getProductSines(double[] angles, int type) {
		double res = 1;
		for (double angle : angles) {
			if (type == DEGREES) {
				res *= Math.sin(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res *= Math.sin(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		return res;
	}

	/**
	 * Calculate product of cosines of angles
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @return product of cosines of angles
	 */
	public static double getProductCosines(double[] angles, int type) {
		double res = 1;
		for (double angle : angles) {
			if (type == DEGREES) {
				res *= Math.cos(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res *= Math.cos(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		return res;
	}

	/**
	 * Calculate sum of sines of angles
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @param places
	 *            - the number of decimal places of result
	 * @return sum of sines of angles
	 */
	public static double getSumSines(double[] angles, int type, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		double res = 0;
		for (double angle : angles) {
			if (type == DEGREES) {
				res += Math.sin(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res += Math.sin(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		BigDecimal bd = new BigDecimal(res);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Calculate sum of cosines of angles
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @param places
	 *            - the number of decimal places of result
	 * @return sum of cosines of angles
	 */
	public static double getSumCosines(double[] angles, int type, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		double res = 0;
		for (double angle : angles) {
			if (type == DEGREES) {
				res += Math.cos(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res += Math.cos(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		BigDecimal bd = new BigDecimal(res);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Calculate difference of sines of angles 
	 * (не понятно, что значит разность)
	 * (отрицательное значение суммы?)
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @param places
	 *            - the number of decimal places of result
	 * @return difference of sines of angles
	 */
	public static double getDiffSines(double[] angles, int type, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		double res = 0;
		for (double angle : angles) {
			if (type == DEGREES) {
				res -= Math.sin(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res -= Math.sin(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		BigDecimal bd = new BigDecimal(res);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Calculate difference of cosines of angles
	 * (не понятно, что значит разность) 
	 * (отрицательное значение суммы?)
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @param places
	 *            - the number of decimal places of result
	 * @return difference of cosines of angles
	 */
	public static double getDiffCosines(double[] angles, int type, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		double res = 0;
		for (double angle : angles) {
			if (type == DEGREES) {
				res -= Math.cos(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res -= Math.cos(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		BigDecimal bd = new BigDecimal(res);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Calculate product of sines of angles
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @param places
	 *            - the number of decimal places of result
	 * @return product of sines of angles
	 */
	public static double getProductSines(double[] angles, int type, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		double res = 1;
		for (double angle : angles) {
			if (type == DEGREES) {
				res *= Math.sin(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res *= Math.sin(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		BigDecimal bd = new BigDecimal(res);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Calculate product of cosines of angles
	 * 
	 * @param angles
	 *            - an array with angles
	 * @param type
	 *            - unit of measure: 0 - degrees, 1 - radians
	 * @param places
	 *            - the number of decimal places of result
	 * @return product of cosines of angles
	 */
	public static double getProductCosines(double[] angles, int type, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		double res = 1;
		for (double angle : angles) {
			if (type == DEGREES) {
				res *= Math.cos(angle * (Math.PI / 180));
			} else if (type == RADIANS) {
				res *= Math.cos(angle);
			} else {
				throw new IllegalArgumentException("Incorrect type of angle: "
						+ type + "\n Type must be " + DEGREES
						+ " for degrees and " + RADIANS + " for radians.");
			}
		}
		BigDecimal bd = new BigDecimal(res);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

}
