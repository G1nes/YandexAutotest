package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverLoader;

public class SearchResult extends HomePage {
    public SearchResult (WebDriver driver){
        PageFactory.initElements(driver,this);
        (new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(modelName));
    }
    @FindBy(xpath = "//h1[contains(@class,'title_size_28')]")
    public WebElement modelName;
}
