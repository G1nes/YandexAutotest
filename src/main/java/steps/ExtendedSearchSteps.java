package steps;

import io.qameta.allure.Step;
import pages.ExtendedSearch;
import util.DriverLoader;

public class ExtendedSearchSteps extends HomePageSteps {

    @Step
    public void enterFromPrice(int price){
        String tmp = Integer.toString(price);
        DriverLoader.fillField(new ExtendedSearch(driver).priceFromField, tmp);
    }
    @Step
    public void selectProducerLable(String value){
        new ExtendedSearch(driver).selectModelType(value);
    }
    @Step
    public void selectApplySettingsBtn(){
        new ExtendedSearch(driver).applySettings.click();
    }
}
