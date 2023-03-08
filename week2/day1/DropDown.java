package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
        System.out.println(title);
        
 //Drop1
WebElement source = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
Select drop=new Select(source);
drop.selectByIndex(2);

//Drop2
driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
driver.findElement(By.xpath("//li[text()='India']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[2]")).click();
driver.findElement(By.xpath("//li[text()='Chennai']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();

driver.findElement(By.xpath("//label[text()='Select Language']")).click();
driver.findElement(By.xpath("//li[text()='Tamil']")).click();
Thread.sleep(2000);

}}
