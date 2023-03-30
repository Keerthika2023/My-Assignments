package week5.Day2;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority=0)
	public void openBrowser() {
		System.out.println("driver.get(url)");
	}
	@Test(priority=1)
	public void closeBrowser() {
		System.out.println("driver.close");
	}
	
	@Test
	public void createAccount() {
		System.out.println("create Account");
	}

}
