package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.TVpage;
import util.DriverLoader;

public class TVpageSteps extends HomePageSteps {

    @Step
    public void selectExtendedSearchBtn(){
        new TVpage(driver).allFiltersBtn.click();
    }

    @Step
    public void selectShowCountElementsBtv(){
        new TVpage(driver).showBtn.click();
    }
    @Step
    public void selectNShowElements(int count){
        new TVpage(driver).selectNShowElements(count);
    }
    @Step
    public void checkElementsCount(){
        driver.findElement(By.xpath(new TVpage(driver).getTwelveElementsXpath()));
    }
    @Step
    public void recordNElementOfListName(int count){
        DriverLoader.recordedElementName = new TVpage(driver).selectNElementName(count);
    }
    @Step
    public void inputSearchRequest(){
        DriverLoader.fillField(new TVpage(driver).headerSearchLine, DriverLoader.recordedElementName);
    }
    @Step
    public void selectSearchBtn(){
        new TVpage(driver).headerSearchBtn.click();
    }
}
