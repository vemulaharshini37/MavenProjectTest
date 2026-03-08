package capstoneProjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class All_ElementsinUI {
	@Test
	public void All_ElementsinUI1()

	{
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://qainterview.pythonanywhere.com/");
       WebElement textfield = driver.findElement(By.xpath("//input[@placeholder=\"Enter an integer\"]"));
       textfield.isDisplayed();
       WebElement button = driver.findElement(By.xpath("//button[text()=\"Calculate!\"]"));
       button.isDisplayed();
       button.isEnabled();
       WebElement about = driver.findElement(By.xpath("//a[text()=\"About\"]"));
       about.isDisplayed();
       about.isEnabled();
       WebElement TC = driver.findElement(By.xpath("//a[text()=\"Terms and Conditions\"]"));
       TC.isDisplayed();
       TC.isEnabled();
       WebElement privacy = driver.findElement(By.xpath("//a[text()=\"Privacy\"]"));
       privacy.isDisplayed();
       privacy.isEnabled();
       
       
       
       driver.close();

       
       
       
       
       
       
		
	}

}
