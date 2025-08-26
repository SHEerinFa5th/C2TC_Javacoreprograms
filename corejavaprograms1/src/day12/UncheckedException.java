package day12;

public class UncheckedException {
	public static void main(String[] args) {
		int intArray[];
		//try {
			intArray = new int[] { 11, 12, 13, 14 };
			System.out.println(intArray[6]);
		//} catch (ArrayIndexOutOfBoundsException e) {
			//System.err.println("Specified index does not exist. "+e.getMessage());
		//}
	}
}
