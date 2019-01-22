package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketMain {
    @FindBy (xpath = "//div[contains(@class,'tabs_js_inited n-w')]")
    WebElement menuBar;

    @FindBy (xpath = "//div[@class = 'n-w-tab__content']/div[contains(@class,'navigation-menu-grouping')]")
    WebElement subMenuItem;

    public void selectMenuItem(String value){
        menuBar.findElement(By.xpath(".//span[contains(text(), '"+value+"')]/ancestor::div[contains(@data-bem,'27903802_v')]"));
    }
    public void selectSubMenuItem (String value){
        subMenuItem.findElement(By.xpath(".//a[contains(text(),'"+value+"')]"));
    }
}
