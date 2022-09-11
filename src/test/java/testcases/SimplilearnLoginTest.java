package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {
      
	@Test	
	public void Test1() {
		
		LoginPage lp= new LoginPage(driver);
		lp.Login("abc@xyz.com", "Abc@1234");
		
		//validate message when we enter wrong password
		WebElement Error=driver.findElement(By.id("msg_box"));
		
		String ActError=Error.getText();
		String ExpError="The email or password you have entered is invalid.";
		
		//assert is for actual vs expected. in this case both will get pass coz conditions are as expected
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActError, ExpError);
	 	 
//		if(ActError.equals(ExpError)) {
//			System.out.println("TC Passed");
//		}else {
//			System.out.println("TC failed");
//		}
	}
		
		@Test
		@Parameters({"uname","pwd"})
		public void Test2(String Username, String Password) {
		LoginPage lp= new LoginPage(driver);
		//lp.Login("abc@xyz.com", "Abc@1234");
		//data driven from testng file
		lp.Login(Username,Password);
			
	}

		@Test
		public void Test3() {
			String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
	        String Password = sheet.getRow(1).getCell(1).getStringCellValue();
	        LoginPage lp= new LoginPage(driver);
			lp.Login(UserName,Password);
				
		}
		
}