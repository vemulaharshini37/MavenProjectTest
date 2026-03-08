package capstoneProjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2_Capston {

	@Test
	public void Class2_Capston1()
	{
		 WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://qainterview.pythonanywhere.com/");
	       WebElement textfield = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	       textfield.isDisplayed();
	       String PH =   textfield.getDomProperty("placeholder");
	       String ExpectedPH = "Enter an integer";
	       if(PH==ExpectedPH)
	       {
	    	   System.out.println("Pass");
	    	   
	       }
	       else
	       {
	    	   System.out.print("fail");
	       }
	       
	     System.out.println(driver.getTitle().contains("Factorial")+" -- yes page title contains Factorial");
	     System.out.println(driver.getCurrentUrl().contains("https")+" -- page URL contains https");
	     driver.close();

	     

	

	}
}
