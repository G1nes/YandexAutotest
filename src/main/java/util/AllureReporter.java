/*
package util;

import cucumber.api.Result;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {
    public void result(Result result) {
        if (result.getStatus().equals("failed")) {
            takeScreenShot();
        }
        super.result(result);
    }

    @Attachment(type = "image/png", value = "Скриншот ошибки")
    public byte[] takeScreenShot() {
        return ((TakesScreenshot) DriverLoader.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
*/
