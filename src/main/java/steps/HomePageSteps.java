package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import util.DriverLoader;

public class HomePageSteps {
    public WebDriver driver;
    public HomePageSteps(WebDriver driver){
        this.driver = driver;
    }
    public HomePageSteps(){
    }
    @Step
    public void selectMenuItem(String value){
        new HomePage(driver).selectMenuItem(value);
    }
}
