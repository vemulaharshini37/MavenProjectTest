package mavenProjectTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=brLs3IOqlzk");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		System.out.print("Hi");

	}

}
