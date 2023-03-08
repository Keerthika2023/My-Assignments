package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.name("firstname")).sendKeys("Keerthika");
	driver.findElement(By.name("lastname")).sendKeys("Shanmugam");
	driver.findElement(By.name("reg_email__")).sendKeys("keerthishanmugam432@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("Test@1234");

WebElement date = driver.findElement(By.id("day"));
	Select date1=new Select(date);
	date1.selectByValue("28");
WebElement month = driver.findElement(By.id("month"));
    Select month1=new Select(month);
    month1.selectByValue("12");
WebElement year = driver.findElement(By.id("year"));
    Select year1=new Select(year);
    year1.selectByValue("1993");
    
driver.findElement(By.xpath("//label[text()='Female']")).click();
   
  	}}

