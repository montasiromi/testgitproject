 
public class creditCardConstructor {
	// create variables for the credit card
	public String ccname;
	public long ccnumber;
	public String expdate;
	public int cvc;
	
	//creditCardConstructor constructor with 4 parameters
	creditCardConstructor(String ccname, long ccnumber, String expdate, int cvc){
		//set the variables of the class to the value of the variables in the parameter
		
		this.ccname = ccname;
		this.ccnumber = ccnumber;
		this.expdate = expdate;
		this.cvc = cvc;
		
	}
}
