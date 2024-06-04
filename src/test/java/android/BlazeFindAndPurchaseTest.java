package android;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BlazeFindAndPurchase;
import Pages.LoginParamBlaze;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BlazeFindAndPurchaseTest {
	

	 WebDriver driver;
    @BeforeTest
    public void setup() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }
    @Test(priority=0)

    public void test_Find_Purchase(){
    	
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();


    
       LoginParamBlaze logObj = new LoginParamBlaze();
	   
	   BlazeFindAndPurchase objFindandPurchase = new BlazeFindAndPurchase(driver);
	   objFindandPurchase.clickLoginButtton();
	   System.out.println("***login method***");
	   objFindandPurchase.loginToDemoBlaze(logObj.username,logObj.password);
	   System.out.println("***clickLabtops method***");
	   objFindandPurchase.clickLabtops();
	   System.out.println("***findProduct method***");
	   objFindandPurchase.findProduct();
	   System.out.println("***goToChart method***");
	   objFindandPurchase.goToChart();
	   System.out.println("***LogOut method***");
	   objFindandPurchase.logOut();
	   System.out.println("***Verify LogOut method***");
	   objFindandPurchase.verifyLogOut();
	
       // driver.quit();
    } 
    @AfterTest
    void tearDown() {
        driver.quit();
    }


}
