package util;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class DriverLoader {
    private static Properties setProperties = Property.getInstance().getProperties();
    private static String url;
    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
    switch (setProperties.getProperty("browser")){
        case "chrome" :
            System.setProperty("webdriver.chrome.driver",setProperties.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
            break;
        case "firefox" :
            System.setProperty("webdriver.gecko.driver",setProperties.getProperty("webdriver.gecko.driver"));
            driver = new FirefoxDriver();
            break;
            default:
                System.setProperty("webdriver.chrome.driver",setProperties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;
    }
    url = setProperties.getProperty("url");
    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }
    @AfterClass
    public static void endTest(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }
    public void nextTab (){
        ArrayList<String>tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }
    public void fillField (WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }
}
