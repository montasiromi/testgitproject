//String Out Of Bounds Exception Handling
public class errorHandling {

	public static void main(String[] args) {
		
		//create a string
		String pemdas = "Please Excuse My Dear Aunt Sally";
		
		//set an invalid index for the String
		int size = 51;
		try {
		System.out.println(pemdas.charAt(size));
	}
		catch(Exception e) {
			// there is no 51 position in the string so statement will print
			System.out.println("There is no available character at index "+size+". Please try again.");
		}
		}
}
