package capstoneProjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Capstone5 {

	@Test
	public void Capstone51()
	{
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://qainterview.pythonanywhere.com/");
	       WebElement textfield = driver.findElement(By.xpath("//input[@placeholder=\"Enter an integer\"]"));
	       textfield.sendKeys("0");
	       WebElement button = driver.findElement(By.xpath("//button[text()=\"Calculate!\"]"));
	       button.click();
	       if(driver.findElement(By.xpath("//p[@id='resultDiv']")).getText()=="The factorial of 0 is: 0")
   {
	    	   System.out.print("Pass");
	}
	       else
	       {
	    	   System.out.print("Fail -- This is a major defect");
	       }
	     
	       
	       
	       driver.close();


	}

}
