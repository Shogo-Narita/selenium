package selenium;

import java.util.Iterator;
import java.util.List;
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
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String window1 = it.next();
		String window2 = it.next();
		driver.switchTo().window(window2);
		
		WebElement element2 = driver.findElement(By.cssSelector("#topMenuBtn03"));
		element2.click();
		
		WebElement element3 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(2)"));
		element3.sendKeys("4");
		WebElement element4 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(3)"));
		element4.sendKeys("11");
		WebElement element5 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(4)"));
		element5.sendKeys("15");
		
		WebElement element6 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(8)"));
		element6.sendKeys("4");
		WebElement element7 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(9)"));
		element7.sendKeys("12");
		WebElement element8 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(10)"));
		element8.sendKeys("16");
		
		WebElement element9 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table:nth-child(2) > tbody > tr > td > a"));
		element9.click();
		
		WebElement tableElement = driver.findElement(By.cssSelector("table.list-data"));
		
		List<WebElement>trElements=tableElement.findElements(By.tagName("tr"));
		for(WebElement elem : trElements) {
			List<WebElement>tdElements=elem.findElements(By.tagName("td"));
			int count=0;
			for(WebElement tdElem : tdElements) {
				if(count<3) {
	     		System.out.println(tdElem.getText()+"\t");
	     		if(count == 2) {
	     			String hrefStr=tdElem.findElement(By.tagName("a")).getAttribute("href");
	     			System.out.println(hrefStr+"\t");
	     		}
	     		
			}
			count++;
			}
		}
	}

}
