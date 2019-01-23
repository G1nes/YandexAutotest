package steps;

import pages.ExtendedSearch;
import ru.yandex.qatools.allure.annotations.Step;
import util.DriverLoader;

public class ExtendedSearchSteps extends DriverLoader {
    @Step
    public void enterFromPrice(int price){
        String tmp = Integer.toString(price);
        fillField(new ExtendedSearch(getDriver()).priceFromField, tmp);
    }
    @Step
    public void selectProducerLable(String value){
        new ExtendedSearch(getDriver()).selectModelType(value);
    }
    @Step
    public void selectApplySettingsBtn(){
        new ExtendedSearch(getDriver()).applySettings.click();
    }
}
