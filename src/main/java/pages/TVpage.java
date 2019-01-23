package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
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
    private String twelveElementsXpath = "//div[contains(@data-bem,'\"count\":12')]";

    public String getTwelveElementsXpath(){
        return twelveElementsXpath;
    }
    @FindBy(xpath = "//a[contains(@class, 'Ocaft')]")
    public WebElement allFiltersBtn;

    @FindBy(xpath = "//span[contains(@data-bem,'Показать все')]")
    public WebElement showBtn;

    /*@FindBy(xpath = "//span[text()='Показывать по 12']/ancestor::span")
    public WebElement showTwelveRecordings;
    
    @FindBy(xpath = "//div[contains(@data-bem,'\"count\":12')]")
    public static WebElement checkElementsCount;*/

    @FindBy(xpath = "//div[contains(@class,'b-spy-init_js')]")
    public WebElement ListRecordName;

    @FindBy(xpath = "//input[@id='header-search']")
    public WebElement headerSearchLine;

    @FindBy (xpath = "//button[contains(@class,'suggest2-form__button')]")
    public WebElement headerSearchBtn;

    public void selectNShowElements(int count){
        showBtn.findElement(By.xpath("//span[text()='Показывать по "+count+"']/ancestor::span")).click();
    }
    public String selectNElementName(int count){
        String tmp = ListRecordName.findElement(By.xpath(".//div["+count+"]//a[contains(@class,'theme_blue link_type_cpc')]")).getText();
        return tmp;
    }
}
