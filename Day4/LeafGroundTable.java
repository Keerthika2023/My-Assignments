package AssignmentWeek4.Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGroundTable {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		System.out.println("The Row Size is: "+rows.size());
		List<WebElement> Columns = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr/th"));
		System.out.println("The Column Size is: "+Columns.size());
		for (int i = 1; i < rows.size(); i++) {
	    	for (int j = 1; j < Columns.size(); j++) {
	    		String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td["+j+"]")).getText();
	    		     System.out.println(text2);		
}}}}
