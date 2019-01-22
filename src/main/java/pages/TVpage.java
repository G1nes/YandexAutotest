package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverLoader;

public class TVpage extends DriverLoader {
    public TVpage(WebDriver driver){
        PageFactory.initElements(getDriver(),this);
        (new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(allFiltersBtn));
    }

    @FindBy(xpath = "//a[contains(@class, 'Ocaft')]")
    WebElement allFiltersBtn;

    @FindBy(xpath = "//span[contains(@data-bem,'Показать все')]")
    WebElement showBtn;

    @FindBy(xpath = "//span[text()='Показывать по 12']/ancestor::span")
    WebElement showTwelveRecordings;

    @FindBy(xpath = "//div[contains(@data-bem,'\"count\":12')]")
    WebElement checkElementsCount;

    @FindBy(xpath = "//div[contains(@class,'b-spy-init_js')]/div[1]//a[contains(@class,'theme_blue link_type_cpc')]")
    WebElement firstRecordName;

    @FindBy(xpath = "//input[@id='header-search']")
    WebElement headerSearchLine;

    @FindBy (xpath = "//button[contains(@class,'suggest2-form__button')]")
    WebElement headerSearchBtn;
}
