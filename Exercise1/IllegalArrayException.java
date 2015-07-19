package practice.excercises.excercize1;

public class IllegalArrayException extends Throwable {
	
	// An element that causes exception
	private String element;
	
	// Constructor
	public IllegalArrayException(String element) {
		this.element = element;
	}
	
	// Getter for element
	public String getElement() {
		return element;
	}
	
	public String getExceptionMessage(int[] array) {
		return "Error: Parameter " + element + " of command-line does not have legal type";
	}
	
}
