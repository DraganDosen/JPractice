package android;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

//import Pages.BlazeHomePage;
import Pages.BlazeFindAndPurchase;
import Pages.BlazeLogin;

import Pages.LoginParamBlaze;


public class BlazeLoginTest {
	WebDriver driver;
	// BlazeHomePage objHomePage;
    LoginParamBlaze logObj;
	 
	    @BeforeTest
	    public void setup() {
	       
	        
	    }
   
  
  
  
    
  
       
    @Test(priority=1)

    public void test_Login_And_Verify(){
    	 WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
   
	BlazeLogin objLogin = new BlazeLogin(driver);
	LoginParamBlaze logObj= new LoginParamBlaze();

       objLogin.clickLoginButtton();
	   objLogin.loginToDemoBlaze(logObj.username,logObj.password);
	   objLogin.checkIsLogged(logObj.username);
	  // objLogin.checkAboutUs();
	   objLogin.clickLabtops();
	   objLogin.findLenovo();
	   objLogin.useContactForm();
	  // objLogin.handleAlert();
	   //Close the browser
        driver.quit();
	

    }                                               
    @Test(priority=2)

    public void test_Login_And_Verify_About_Us(){
    	 WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();

	BlazeLogin objLogin = new BlazeLogin(driver);
	LoginParamBlaze logObj= new LoginParamBlaze();

       objLogin.clickLoginButtton();
	   objLogin.loginToDemoBlaze(logObj.username,logObj.password);
	   objLogin.checkIsLogged(logObj.username);
	   objLogin.checkAboutUs();
	   driver.quit();
	
    }                                
    @Test(priority=3)

    public void test_Alert(){
    	 WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
    	
	BlazeLogin objLogin = new BlazeLogin(driver);
	LoginParamBlaze logObj= new LoginParamBlaze();

       objLogin.clickLoginButtton();
	   objLogin.loginToDemoBlaze(logObj.username,logObj.password);
	   objLogin.checkIsLogged(logObj.username);
	   objLogin.clickLabtops();
	   objLogin.findLenovo();
	   objLogin.useContactForm();
	   objLogin.handleAlert();
	   //Close the browser
        driver.quit();
	

    }   
    @AfterMethod
	public void afterTest() {

		// close and quit the browser
		//driver.quit();
	}
}

