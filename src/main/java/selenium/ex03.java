package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex03 {
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.e-procurement.metro.tokyo.lg.jp/index.jsp");
		
		WebElement element = driver.findElement(By.cssSelector("body > div.noticeofurlchange > div > button"));
		element.click();
		
		WebElement element1 = driver.findElement(By.cssSelector("#category_menu > ul > li.cat_menu_1 > a:nth-child(1) > img"));
		element1.click();
		
		//String wid = driver.getWindowHandle();
		driver.switchTo().window("http://www.e-procurement.metro.tokyo.lg.jp/SrvPublish");
		
//		Set<String> set = driver.getWindowHandles();
//		Iterator<String> it = set.iterator();
//		String window1 = it.next();
//		driver.switchTo().window(window1).get("http://www.e-procurement.metro.tokyo.lg.jp/SrvPublish");
		WebElement element2 = driver.findElement(By.cssSelector("#topMenuBtn03"));
		element2.click();


//		Iterator<String> it = set.iterator();		
	}

}
