package steps;

import org.junit.Assert;
import pages.SearchResult;
import ru.yandex.qatools.allure.annotations.Step;
import util.DriverLoader;

public class SearchResultSteps extends DriverLoader {
    @Step
    public void assertModelName(){
        Assert.assertEquals(recordedElementName, new SearchResult(getDriver()).modelName.getText());
    }
}
