package testNg;

import org.testng.annotations.Test;

public class testNgDay1 {
	
	
	@Test(priority = 1)
	void login() {
		System.out.println("Login");
		
	}
	@Test(priority = 2)
	void homePage() {
		System.out.println("HomePage");
		
	}
	@Test(priority = 3,enabled = false)
	void Logout() {
		System.out.println("Logout");
		
	}

}
