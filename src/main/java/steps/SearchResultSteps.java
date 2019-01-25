package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import pages.SearchResult;
import util.DriverLoader;

public class SearchResultSteps extends HomePageSteps {
    @Step
    public void assertModelName(){
        Assert.assertEquals(DriverLoader.recordedElementName, new SearchResult(driver).modelName.getText());
    }
}
