package capstoneProjct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class4_Capstone {

	@Test()
	public  void Class4_Capstone1()  throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://qainterview.pythonanywhere.com/");
	     List<WebElement> TC =  driver.findElements(By.tagName("a"));
	     Thread.sleep(3000);
	     int TCC = TC.size();
	     System.out.println(TC.size() +" ---Links count");
	     Assert.assertEquals(4, TCC);
	     {
	     {
	     for(int i =0;i<TC.size();i++)
	     {
	    	 System.out.println(TC.get(i).getText());
	     }
	     }
	       driver.close();
	       

	}
	}
}
