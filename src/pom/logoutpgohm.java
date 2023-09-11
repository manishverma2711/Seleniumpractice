 package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutpgohm {
	
	WebDriver wd ;
	
	public logoutpgohm(WebDriver wd){
		this.wd = wd;		
	}
	  By call = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	  By logoutlink = By.xpath("//a[normalize-space()='Logout']");
 
  public void calling() {
	  wd.findElement(call).click();
  }  
  public void logout() {
    wd.findElement(logoutlink).click();
  
  }
  public void logoutprocess() {
	  calling();
	  logout();
   }
 }