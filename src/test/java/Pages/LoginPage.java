package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	//********************objects****************//
	@FindBy(linkText= "Log in")
	WebElement LoginLink;
	
	@FindBy(name= "user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement Checkbox;
	
	@FindBy(name="btn_login")
	WebElement Loginbtn;
	
	
	public LoginPage(WebDriver basedriver) {
		
		this.driver=basedriver;
		PageFactory.initElements(basedriver, this);
	}
	
	//*******************Methods**********************//
	
	public void Login(String UsernameVal, String Passvalue) {
		
		
		//step to click on Login
//		WebElement LoginLink= driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		//step to enter login field
//		WebElement UserName=driver.findElement(By.name("user_login"));
		UserName.sendKeys(UsernameVal);
		
		//steps to enter password field
//		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(Passvalue);
		
		//steps to enter rememberme checkbox
//		WebElement Checkbox=driver.findElement(By.className("rememberMe"));
		Checkbox.click();
		
		//step for login button
//		WebElement Loginbtn=driver.findElement(By.name("btn_login"));
		Loginbtn.click();
	}
}
