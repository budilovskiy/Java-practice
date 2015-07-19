package practice.excercises.excercize1;

public class IllegalArrayException extends Throwable {
	
	public String getExceptionMessage(int[] array) {
		return "Error: Parameters of command-line does not have type \"int\"";
	}
	
	public String getExceptionMessage(double[] array) {
		return "Error: Parameters of command-line does not have type \"double\"";
	}
	
}
