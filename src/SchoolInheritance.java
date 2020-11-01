class professor{
	void professorname() {
		
		//string for professors name
		String profname = "John Smith";
		
		//print statement for provessors name
		System.out.println("Professor's name: " +profname);
	}
}
//students class inherits professor class
class students extends professor{
	
	//method for Adam
	void studentAdam() {
		
		//Adam's data
		String studname = "Adam";
		int gradyear = 2012; 
		double gpa = 3.5;
		
		//print Adam's data
		System.out.println(studname+" graduated in the year "+gradyear+"and has a GPA of "+ gpa);
	}
	//method for Barry
	void studentBarry() {
		
		//Barry's data
		String studname = "Barry";
		int gradyear = 2015;
		double gpa = 3.9;
		
		//Print Barry's data
		System.out.println(studname+" graduated in the year "+gradyear+"and has a GPA of "+ gpa);
	}
	//method for Carl
	void studentCarl() {
		
		//Carl's data
		String studname = "Carl";
		int gradyear = 2019;
		double gpa = 2.3;
		
		//print Carl's data
		System.out.println(studname+" graduated in the year "+gradyear+"and has a GPA of "+ gpa);
	}
	//method for David
	void studentDavid() {
		
		//David's data
		String studname = "David";
		int gradyear = 2010;
		double gpa = 2.66;
		
		//print David's data
		System.out.println(studname+" graduated in the year "+gradyear+"and has a GPA of "+ gpa);
	}
}

public class SchoolInheritance {
	
	public static void main(String[] args) {
	
		//create an objects of the students class that also inherited professor
		students obj = new students();
		
		//call each method the print the statements
		obj.professorname();
		obj.studentAdam();
		obj.studentBarry();
		obj.studentCarl();
		obj.studentDavid();
	}

}
