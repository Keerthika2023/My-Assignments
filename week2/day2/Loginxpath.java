package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Loginxpath {
	public static void main(String[] args) throws InterruptedException{
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			//find the element and enter user nameS
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@id='decorativeSubmit']")).click();
//click Crmsfa
driver.findElement(By.xpath("//a[contains(text()'CRM/SFA)']")).click();
//click the lead
driver.findElement(By.xpath("//a[text()='Leads']")).click();
   Thread.sleep(2000);
}}
