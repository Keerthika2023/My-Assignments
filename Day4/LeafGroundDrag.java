package AssignmentWeek4.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDrag {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebElement source = driver.findElement(By.id("form:drag_content"));
	WebElement drop = driver.findElement(By.id("form:drop_content"));
		Actions DragDrop= new Actions(driver);
		DragDrop.dragAndDrop(source, drop).perform();
		System.out.println(drop.getCssValue("background-color"));
		
WebElement source1 = driver.findElement(By.xpath("//span[text()='Drag me around']"));
       Point location = source1.getLocation();
		int x = location.getX();
		System.out.println(x);
		int y = location.getY();
		System.out.println(y);
		DragDrop.dragAndDropBy(source1, 100, 100).perform();
		System.out.println(source1.getLocation().getX());

	}}
