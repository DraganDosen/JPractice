package android;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//import Pages.BlazeHomePage;
import Pages.BlazeFindAndPurchase;
import Pages.BlazeLogin;

import Pages.LoginParamBlaze;

public class BlazeLoginTest {

   
   // BlazeHomePage objHomePage;
    LoginParamBlaze logObj;
  

    @BeforeTest

    public void setup(){

    }
     
       
    @Test(priority=0)

    public void test_Login_And_Verify(){
    	//WebDriverManager.chromedriver().setup();
	    //WebDriver driver = new ChromeDriver();
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\draga\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	//EdgeOptions edgeOptions = new EdgeOptions();
    	WebDriver driver = new EdgeDriver();
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
    @Test(priority=1)

    public void test_Login_And_Verify_About_Us(){
    	//WebDriverManager.chromedriver().setup();
	    //WebDriver driver = new ChromeDriver();
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\draga\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	//EdgeOptions edgeOptions = new EdgeOptions();
    	WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();



	BlazeLogin objLogin = new BlazeLogin(driver);
	LoginParamBlaze logObj= new LoginParamBlaze();

       objLogin.clickLoginButtton();
	   objLogin.loginToDemoBlaze(logObj.username,logObj.password);
	   objLogin.checkIsLogged(logObj.username);
	   objLogin.checkAboutUs();
	  // objLogin.clickLabtops();
	   //objLogin.findLenovo();
	  // objLogin.useContactForm();
	 //  objLogin.handleAlert();
	   //Close the browser
        driver.quit();
	

    }                                
    @Test(priority=2)

    public void test_Alert(){
    	//WebDriverManager.chromedriver().setup();
	    //WebDriver driver = new ChromeDriver();
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\draga\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	//EdgeOptions edgeOptions = new EdgeOptions();
    	WebDriver driver = new EdgeDriver();
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
}

