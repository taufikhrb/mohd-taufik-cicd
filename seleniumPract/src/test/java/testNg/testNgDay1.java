package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testNgDay1 {
	
	
	@Test(priority = 1)
	void login() {
		System.out.println("Login");
		
	}
	@Test(priority = 2)
	void homePage() {
		System.out.println("HomePage");
		Assert.assertTrue(false);
		
	}
	@Test(priority = 3)
	void Logout() {
		System.out.println("Logout");
		
	}

}
