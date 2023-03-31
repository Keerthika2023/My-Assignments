package week5.Day2;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
public void openLead() {
		System.out.println("open");
	}
	@Test (dependsOnMethods = {"deleteLead","openLead"},alwaysRun = true)
	public void editLead() {
		System.out.println("edit");
	}
	@Test
	public void deleteLead() {
		System.out.println("deleted");
	}
}
