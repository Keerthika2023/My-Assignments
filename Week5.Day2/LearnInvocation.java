package week5.Day2;

import org.testng.annotations.Test;

public class LearnInvocation {
	@Test(enabled=false)
	public void editLead() {
		System.out.println("Edit");
	}
	@Test(invocationCount = 3)
	public void createLead() {
		System.out.println("create");
	}
	
	@Test(invocationCount = 3,invocationTimeOut = 3000)
	public void duplicateLead() {
		System.out.println("duplicate");
	}
	@Test(invocationCount = 3,invocationTimeOut = 4000,threadPoolSize = 2)
	public void mergeLead() {
		System.out.println("merge");
	}

	@Test(priority=1)
	public void deleteLead() {
		System.out.println("driver.close");
	}



}
