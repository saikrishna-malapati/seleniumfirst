package seleniumfirstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikr\\Desktop\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9912993010");
	driver.findElement(By.id("pass")).sendKeys("pavani5");
	driver.findElement(By.id("u_0_b")).click();
		
		System.out.println(driver.getCurrentUrl());

		driver.quit();
		
		
	}

}
