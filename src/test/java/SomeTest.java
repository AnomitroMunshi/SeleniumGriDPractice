package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SomeTest {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                //driver=new ChromeDriver();
                DesiredCapabilities dc=new DesiredCapabilities();
                dc.setCapability("browserName","chrome");
                try{
                    driver= new RemoteWebDriver(new URL("http://3.142.235.68:4444/wd/hub"),dc);
                }
                catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                //driver=new FirefoxDriver();
                DesiredCapabilities cap=new DesiredCapabilities();
                cap.setCapability("browserName","firefox");
                try{
                    driver= new RemoteWebDriver(new URL("http://3.142.235.68:4444/wd/hub"),cap);
                }
                catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.freshworks.com/");
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
