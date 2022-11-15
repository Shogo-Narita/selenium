package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.jp/");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium");
		Thread.sleep(1000);
		element.sendKeys(Keys.ENTER);
		
		
//		WebElement element1 = driver.findElement(By.linkText("Google検索"));
//		element1.click();
		
	}

}
