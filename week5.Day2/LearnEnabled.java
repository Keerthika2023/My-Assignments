package week5.Day2;

import org.testng.annotations.Test;

public class LearnEnabled {
	@Test(enabled=false)
	public void editLead() {
		System.out.println("Edit");
	}
	@Test
	public void createLead() {
		System.out.println("Create");
	}
	
	@Test
	public void duplicateLead() {
		System.out.println("duplicate");
	}


}
