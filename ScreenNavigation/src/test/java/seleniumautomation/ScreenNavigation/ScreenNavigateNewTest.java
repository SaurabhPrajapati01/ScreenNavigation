package seleniumautomation.ScreenNavigation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class ScreenNavigateNewTest {
	public WebDriver driver;
	public Actions action;

	@Test(priority=1)
	public void launchApplication() {
		System.out.println("The Application Is launched Successfully");

		//Step:1- Set the properties According to the ChromeDriver And launch the URL
		System.setProperty("webdriver.chrome.driver",".\\Driver\\Chromedriver.exe");

		//Create the object for chrome Browser
		driver = new ChromeDriver();


		//Parents Browser 
		//launch the url
		String url = "https://nxtgenaiacademy.com" ;
		driver.get(url);
		System.out.println("launch URL Successfully ");

		//Maximize the Application view
		driver.manage().window().maximize();



	}



	@Test(priority=2)
	public void navigateToRegisterForm() {
		System.out.println("Register Form is Displayed Successfully");
		action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//*[text()='QA Automation']"))).perform();
		System.out.println("QA- Automatrion is Selected ");
	
		action.moveToElement(driver.findElement(By.xpath("//i[@class='nav-arrow fa fa-angle-right']"))).perform();
		System.out.println("Practice-Automation is Selected ");

		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Demo Site – Registration Form')]"))).click().perform();
		System.out.println("Register form is Selected ");
		
	}


	@Test(priority=3)
	public void navigateToAlertPopup() {
		System.out.println("Alert Pop up is Displayed Successfully");
		action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[text()='QA Automation']"))).perform();
		System.out.println("QA- Automatrion is Selected ");
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='nav-arrow fa fa-angle-right']"))).perform();
		System.out.println("Practice-Automation is Selected ");

		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Demo Site – Alert and Popup')]"))).click().perform();
		System.out.println("Alert Pop up is Selected ");
		

	}

	@Test(priority=4)
	public void navigateToMultiWindow() {
		System.out.println("Multi Windows is Displayed Successfully");
		action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//*[text()='QA Automation']"))).perform();
		System.out.println("QA- Automatrion is Selected ");
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='nav-arrow fa fa-angle-right']"))).perform();
		System.out.println("Practice-Automation is Selected ");

		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Demo Site – Multiple Windows')]"))).click().perform();
		System.out.println("Multi Windows is Selected ");


	}
	
	@Test(priority=5)
	public void navigateToWebTable() {
		System.out.println("Web Table is Displayed Successfully");
		action = new Actions(driver);


		action.moveToElement(driver.findElement(By.xpath("//*[text()='QA Automation']"))).perform();
		System.out.println("QA- Automatrion is Selected ");
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='nav-arrow fa fa-angle-right']"))).perform();
		System.out.println("Practice-Automation is Selected ");

		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Demo Site – WebTable')]"))).click().perform();
		System.out.println("Web Table is Selected ");
	}

	@Test(priority=6)
	public void closeApplication() {
		System.out.println("The Application Is Closed Successfully");
		//Close the Parents Browser 
		driver.close();
		System.out.println("Close Parents Browser Window");


  }
}
