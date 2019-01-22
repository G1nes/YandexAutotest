package steps;

import pages.MarketMain;
import ru.yandex.qatools.allure.annotations.Step;
import util.DriverLoader;

public class MarketMainSteps extends DriverLoader {
    @Step
    public void moveToMainMenuElement(String value){
        new MarketMain(getDriver()).selectMenuItem(value);
    }
    @Step
    public void selectSubMenuItem(String value){
        new MarketMain(getDriver()).selectSubMenuItem(value);
    }
}
