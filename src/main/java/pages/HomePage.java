package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverLoader;

public class HomePage extends DriverLoader {
    public HomePage (WebDriver driver){
        PageFactory.initElements(getDriver(), this);
        (new WebDriverWait(driver,15)).until(ExpectedConditions.visibilityOf(menu));
    }
    @FindBy (xpath = "//div[@class = 'home-arrow__tabs']")
    private WebElement menu;

    public void selectMenuItem(String value){
        menu.findElement(By.xpath(".//a[contains(text(), '"+value+"')]")).click();
    }
}
