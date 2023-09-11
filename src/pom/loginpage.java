package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

    WebDriver wd;
    
    public loginpage(WebDriver wd)
    {
    	this.wd =wd;
    	
    }	
    //repository of webelment
    By uname = By.name("username");
    By pword = By.name("password");
    By loginbtn = By.cssSelector("button[type=submit]");
    
    public void url()
    {
    	wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }
    public void username(String un) {
    	wd.findElement(uname).sendKeys(un);
    }
    public void password(String pw)
    {
    	wd.findElement(pword).sendKeys(pw);
    }
    public void login()
    {
    	wd.findElement(loginbtn).click();
    }
    public void loginprocess(String un,String pw) {
    	
    	url();
    	username(un);
    	password(pw);
    	login();
    }
}
