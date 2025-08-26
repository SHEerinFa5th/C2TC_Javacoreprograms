package day12.UserDefined;
public class InvalidMarksException extends Exception {
	
	public InvalidMarksException() {
		super();
	}
	
	public InvalidMarksException(String message)
	{
		super(message);
	}
}