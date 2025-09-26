package linstener;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(linstener.MyListener.class)
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
		throw new SkipException("Skipping test intentionally");
		
		//System.out.println("Logout");
		
	}

}
