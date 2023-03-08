package week2.day1;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	public class CreateAccount {
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
			
	 String title = driver.getTitle();
	 System.out.println(title);
			
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.xpath("//a[text()='Create Account']")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Accounting1");
driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Tester");
driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf Platform");			
driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");

//drop1
WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industry1=new Select(industry);
		industry1.selectByValue("IND_SOFTWARE");
		
//drop2
WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select owner1=new Select(owner);
		owner1.selectByVisibleText("S-Corporation");
		
//drop3
WebElement source = driver.findElement(By.id("dataSourceId"));
     Select source1=new Select(source);
     source1.selectByValue("LEAD_EMPLOYEE");
     
//drop4
WebElement market = driver.findElement(By.id("marketingCampaignId"));
   Select market1=new Select(market);
   market1.selectByIndex(6);
   
  //drop5
WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
   Select state1=new Select(state);
   state1.selectByValue("TX");
   
 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();  
   
}}