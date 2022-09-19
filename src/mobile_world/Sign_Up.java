package mobile_world;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Sign_Up {

   @Test

   public void sign() throws InterruptedException {
        
	   System.setProperty("webdriver.chrome.driver","C:/Users/sanandh.sajith/Downloads/chromedriver_win32/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
             
             LandingPage landingpage2 = new LandingPage(driver);
            
             landingpage2.goTo();
             landingpage2.signupapplication("Sanandh","Sajith","sanandhsajith@gmail.com","s01//111" ,"01/11/2001","8342673759","Qualitester");
             Thread.sleep(1000);
}
}