package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 public class LeafGround {
	public static void main(String[] args){
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/select.xhtml");
	driver.manage().window().maximize();
	//Find Element
	WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
	//create obj class
	Select drop=new Select (tool);
	//method
	drop.selectByVisibleText("Selenium");
	//find element
	driver.findElement(By.xpath(//span[@class='ui-icon ui-icon-triangle-1-s ui-c']));
	}}
	


