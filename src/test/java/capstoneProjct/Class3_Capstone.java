package capstoneProjct;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Class3_Capstone  {

@Test
public void Class3_Capstone1() throws BiffException, IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://qainterview.pythonanywhere.com/");
	       FileInputStream fi = new FileInputStream("C:\\Users\\ammul\\OneDrive\\Pictures\\Test\\Capstone.xls");
	      Workbook wb  = Workbook.getWorkbook(fi);
	      Sheet s = wb.getSheet("Sheet1");
	      WebElement button = driver.findElement(By.xpath("//button[text()=\"Calculate!\"]"));
	      
	       WebElement textfield = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	       textfield.isDisplayed();
	       int cc= s.getColumns();
	       int rc = s.getRows();
	    for(int j = 0;j<cc;j++)
	       {
	      
	        for(int i =0 ;i<rc;i++) 
	       {
	    	   textfield.sendKeys(s.getCell(j,i).getContents());
	    	   button.click();
	    	   Thread.sleep(2000);
		   System.out.println(driver.findElement(By.xpath("//p[@id='resultDiv']")).getText()); 
		   textfield.clear();

	       }
	       
	       }
	    driver.close(); 
	}


}
