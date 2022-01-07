package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lumen_Page {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		/*
		driver.get("https://demoqa.com/links");
		//WebElement e = driver.findElement(By.linkText("Home"));
		//e.click();

		
		
		WebElement plnk = driver.findElement(By.partialLinkText("Request"));
		plnk.click();

		
		
		driver.get("https://demoqa.com/buttons");
		WebElement btn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		btn.click();
		*/
		//TextBox
		driver.get("https://www.lumen.com/en-us/home.html");
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'SOLUTIONS') and @class ='tier-link']"));
		btn.click();
		
		WebElement btn2 = driver.findElement(By.xpath("//span[contains(text(),'By Industry') and @class ='tier-link']"));
		btn2.click();
		
		WebElement btn3 = driver.findElement(By.linkText("Financial Services"));
		btn3.click();
		String text = null;
		text = driver.getCurrentUrl();
		
		System.out.println(text);
		
		driver.close();
		driver.quit();
		
	}

}
