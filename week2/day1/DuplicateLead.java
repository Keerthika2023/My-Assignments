package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);

driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
System.out.println(driver.getTitle());
	   
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
Thread.sleep(2000);

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthika");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Keerthi");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating Duplicate Lead");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthishanmugam432@gmail.com");

driver.findElement(By.name("submitButton")).click();
System.out.println(driver.getTitle());

String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println(text);

driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_lastName")).clear();

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Avira");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sai");
driver.findElement(By.className("smallSubmit")).click();
Thread.sleep(2000);
System.out.println(driver.getTitle());

//driver.close();

}}
	