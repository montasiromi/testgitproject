import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngsample {

	@BeforeTest
	public void openbrowser() {
		System.out.println("brpwser opened");
	}
	@Test(priority=0)
	public void Registration(){
		System.out.println("User is able to register");
	}
	@Test(priority=1)
	public void Login() {
		System.out.println("User is able to register");
	}
}
