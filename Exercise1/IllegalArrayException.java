package practice.excercises.excercize1;

public class IllegalArrayException extends Throwable {
	
	private String element;
	
	public IllegalArrayException(String element) {
		this.element = element;
	}
	
	public String getElement() {
		return element;
	}
	
	public String getExceptionMessage(int[] array) {
		return "Error: Parameter " + element + " of command-line does not have type \"int\"";
	}
	
	public String getExceptionMessage(double[] array) {
		return "Error: Parameter " + element + " of command-line does not have type \"double\"";
	}
	
}
