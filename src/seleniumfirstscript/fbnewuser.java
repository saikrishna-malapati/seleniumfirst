package seleniumfirstscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fbnewuser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\saikr\\Desktop\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String atitle= "Facebook – log in or sign up";
		String etitle= "";
		
			driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		etitle= driver.getTitle();
		
		if (atitle.equals(etitle))
		{
			System.out.println("Test passed");
			
		}
		else
		{
			
			System.out.println("Test fail");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='u_0_q']")).sendKeys("sriram");
		WebDriverWait wait= new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("u_0_s")));
		
		driver.findElement(By.id("u_0_s")).sendKeys("malapati");
		driver.findElement(By.id("u_0_v")).sendKeys("sai.malapati87@gmail.com");
		driver.findElement(By.id("u_0_10")).sendKeys("malapati@5");	
	driver.findElement(By.id("u_0_7")).click();
	driver.quit();
	}

}
