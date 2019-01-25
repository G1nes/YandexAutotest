package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverLoader;

public class MarketMain extends HomePage {
    public MarketMain(WebDriver driver){
        PageFactory.initElements(driver,this);
        (new WebDriverWait(driver,15)).until(ExpectedConditions.visibilityOf(menuBar));
    }
    @FindBy (xpath = "//div[contains(@class,'tabs_js_inited n-w')]")
    WebElement menuBar;

    @FindBy (xpath = "//div[@class = 'n-w-tab__content']/div[contains(@class,'navigation-menu-grouping')]")
    WebElement subMenuItem;

    public void selectMenuItem(String value){
        Actions actions = new Actions(driver);
        actions.moveToElement(menuBar.findElement(By.xpath(".//span[contains(text(), '"+value+"')]/ancestor::div[contains(@data-bem,'27903802_v')]")));
    }
    public void selectSubMenuItem (String value){
        subMenuItem.findElement(By.xpath(".//a[contains(text(),'"+value+"')]")).click();
    }
}
