package AssignmentWeek4.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Sortable {

	public static void main(String[] args) {
		 ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://jqueryui.com/sortable/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.switchTo().frame(0);
			WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
			WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
			Actions builder=new Actions(driver);
			builder.dragAndDrop(item1, item5).perform();	
			
	}}
