package Companyweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pracweb {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver wb = new ChromeDriver();
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		 
		 wb.manage().window().maximize();
		 
		 wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		 wb.get("https://rahulshettyacademy.com/angularpractice/");
		 
		 wb.findElement(By.name("name")).sendKeys("Hello Men!!");
		 
		 wb.findElement(By.name("email")).sendKeys("example.com");
		 
		 wb.findElement(By.id("exampleInputPassword1")).sendKeys("SD123");
		 
		 
		 
		 wb.findElement(By.id("exampleCheck1")).click();
		   
		 Thread.sleep(1000);
	
		  JavascriptExecutor ss = (JavascriptExecutor)wb;
		  
		  ss.executeScript("window.scrollBy(0,400)");
		 
		 WebElement dropdown = wb.findElement(By.id("exampleFormControlSelect1")); 
		
		 Select select = new Select(dropdown);
		 
		 select.selectByVisibleText("Female");
		 
		 WebDriverWait wait = new WebDriverWait(wb,Duration.ofSeconds(5));
		 
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("bday")));	 
		 
	}
}




