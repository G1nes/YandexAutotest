package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pages.TVpage;
import ru.yandex.qatools.allure.annotations.Step;
import util.DriverLoader;

public class TVpageSteps extends DriverLoader {

    @Step
    public void selectExtendedSearchBtn(){
        new TVpage(getDriver()).allFiltersBtn.click();
    }
    @Step
    public void selectShowCountElementsBtv(){
        new TVpage(getDriver()).showBtn.click();
    }
    @Step
    public void selectNShowElements(int count){
        new TVpage(getDriver()).selectNShowElements(count);
    }
    @Step
    public void checkElementsCount(){
        getDriver().findElement(By.xpath(new TVpage(getDriver()).getTwelveElementsXpath()));
    }
    @Step
    public void recordNElementOfListName(int count){
        recordedElementName = new TVpage(getDriver()).selectNElementName(count);
    }
    @Step
    public void inputSearchRequest(){
        fillField(new TVpage(getDriver()).headerSearchLine, recordedElementName);
    }
    @Step
    public void selectSearchBtn(){
        new TVpage(getDriver()).headerSearchBtn.click();
    }
}
