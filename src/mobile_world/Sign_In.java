package mobile_world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Sign_In {
@Test
public void sign() throws InterruptedException {
    
	 System.setProperty("webdriver.chrome.driver","C:/Users/sanandh.sajith/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         //driver.get(" https://mobileworld.banyanpro.com/");
         LandingPage landingpage = new LandingPage(driver);
         landingpage.goTo();
         landingpage.signinapplication("Sanandh","San$011");
          
       
    }
}

