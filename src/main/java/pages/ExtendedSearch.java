package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverLoader;

public class ExtendedSearch extends HomePage {
    public ExtendedSearch (WebDriver driver){
        PageFactory.initElements(driver,this);
        (new WebDriverWait(driver,15)).until(ExpectedConditions.visibilityOf(priceFromField));
    }
    @FindBy(xpath = "//input[@id = 'glf-pricefrom-var']")
    public WebElement priceFromField;

    @FindBy(xpath = "//div[contains(@data-filter-id,'7893318')]")
    WebElement checkBoxBar;

    @FindBy(xpath = "//a[contains(@data-bem,'hid=90639')]")
    public WebElement applySettings;

    public void selectModelType(String value){
        checkBoxBar.findElement(By.xpath("//label[text()='"+value+"']/./preceding-sibling::span[@class='checkBoxBar__box']"));
    }
}
