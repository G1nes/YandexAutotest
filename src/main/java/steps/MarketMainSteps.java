package steps;

import io.qameta.allure.Step;
import pages.MarketMain;

public class MarketMainSteps extends HomePageSteps {
    @Step
    public void moveToMainMenuElement(String value){
        new MarketMain(driver).selectMenuItem(value);
    }
    @Step
    public void selectSubMenuItem(String value){
        new MarketMain(driver).selectSubMenuItem(value);
    }
}
