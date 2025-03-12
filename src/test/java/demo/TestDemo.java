package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("searchInput")).sendKeys("apple");
		Thread.sleep(3000);
		WebElement appleSuggesstion = driver.findElement(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Apple_Inc.']"));
		appleSuggesstion.click();
		
		WebElement founderList = driver.findElement(By.xpath("//*[@id=\'mw-content-text\']/div[1]/table[1]/tbody/tr[9]/td/div/ul/li[1]/a"));
		founderList.click();
		
		String currentURL = driver.getCurrentUrl();
		if(currentURL.contains("Steve Jobs")) {
			System.out.println("URL Contains Steve Jobs");
		}
		driver.quit();
	}

}
