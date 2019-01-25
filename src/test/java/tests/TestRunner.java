package tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.*;

import java.util.concurrent.TimeUnit;


public class TestRunner {
    public static WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://yandex.ru");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }
    @After
    public static void endTest(){
        driver.quit();
    }

    @When("^перейти на страницу (.+)$")
    public void goToSomePage(String pageName){
        new HomePageSteps(driver).selectMenuItem(pageName);
    }
    @When("^выбрали пункт меню (.+) без нажатия$")
    public void choseSomeMenuItem(String value){
        new MarketMainSteps().moveToMainMenuElement(value);
    }
    @When("^выбрали подпункт меню (.+)$")
    public void choseSomeSubMenuItem(String value){
        new MarketMainSteps().selectSubMenuItem(value);
    }
    @When("^перейти к расширенному поиску$")
    public void goToExtendedSearch(){
        new TVpageSteps().selectExtendedSearchBtn();
    }
    @When("^ввести цену от (.+)$")
    public void enterSomePrice(String price){
        int tmp = Integer.valueOf(price);
        new ExtendedSearchSteps().enterFromPrice(tmp);
    }
    @When("^выбрать производителя (.+)$")
    public void selectProducer(String name){
        new ExtendedSearchSteps().selectProducerLable(name);
    }
    @When("^применить настройки расширенного поиска$")
    public void selectApplyBtn(){
        new ExtendedSearchSteps().selectApplySettingsBtn();
    }
    @When("^нажать на фильтр кол-ва записей на странице$")
    public void selectElementsCount(){
        new TVpageSteps().selectShowCountElementsBtv();
    }
    @When("^выбрать (.+) записей на странице$")
    public void selectNeededElementsCount(int count){
        new TVpageSteps().selectNShowElements(count);
    }

    @Then("^проверить кол-во записей на странице$")
    public void checkElementsCount(){
        new TVpageSteps().checkElementsCount();
    }

    @When("^записать имя (.+) элемента на странице$")
    public void recordNElementName(int count){
        new TVpageSteps().recordNElementOfListName(count);
    }
    @When("^заполнить строку поиска записанным значением$")
    public void inputRecordedValueToSearchLine(){
        new TVpageSteps().inputSearchRequest();
    }
    @When("^нажать кнопку \"Найти\"$")
    public void selectSearchBtn(){
        new TVpageSteps().selectSearchBtn();
    }
    @Then("^проверить соответствие результата поиска ожидаемому значению$")
    public void assertSearchResult(){
        new SearchResultSteps().assertModelName();
    }
}
