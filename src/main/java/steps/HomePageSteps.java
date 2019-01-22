package steps;

import pages.HomePage;
import ru.yandex.qatools.allure.annotations.Step;
import util.DriverLoader;

public class HomePageSteps extends DriverLoader {
    @Step
    public void selectMenuItem(String value){
        new HomePage(getDriver()).selectMenuItem(value);
    }
}
