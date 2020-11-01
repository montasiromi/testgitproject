
public class creditCardMain {

	public static void main(String[] args) {

		// create cc object and initalize the constructor method "creditCardConstructor"
		creditCardConstructor cc = new creditCardConstructor("John Smith" , 34343433331028L, "07/2024", 343);
		
		//print the data in the constructor
		System.out.println(cc.ccname);
		System.out.println(cc.ccnumber);
		System.out.println(cc.expdate);
		System.out.println(cc.cvc);
		
	}

}
