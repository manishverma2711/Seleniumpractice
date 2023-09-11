package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Call {

	public static void main(String[] args) {
	WebDriver wd = new ChromeDriver();
		
	
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.manage().window().maximize();
 
	    loginpage lin = new loginpage(wd);
	    logoutpgohm log = new logoutpgohm(wd);
	    
	    lin.loginprocess("admin", "admin123");
	    log.logoutprocess();
	    
		
	}
}
