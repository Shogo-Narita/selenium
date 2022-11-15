package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex02 {
	public static void main(String[] args) {
		
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://rakuplus.jp/");
	
	WebElement element = driver.findElement(By.cssSelector("#user_login"));
	element.sendKeys("shogo.narita@rakus-partners.co.jp");
	
	WebElement element1 = driver.findElement(By.cssSelector("#user_pass"));
	element1.sendKeys("shogo.narita@rakus-partners.co.jp");
	
	element.sendKeys(Keys.ENTER);
	
	WebElement element2 = driver.findElement(By.cssSelector("#categories-3 > ul > li.cat-item.cat-item-2 > ul > li.cat-item.cat-item-48"));
	element2.click();
	
	WebElement element3 = driver.findElement(By.cssSelector("#main > div.cardtype.cf > article:nth-child(1) > a > div"));
	element3.click();
	
	System.out.println(driver.getCurrentUrl());
	
	

	}
}