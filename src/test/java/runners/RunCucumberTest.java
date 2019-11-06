package runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utilities.SelenoidChromeWebDriverProvider;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "stepdefs")
public class RunCucumberTest {

    @BeforeClass
    public static void setUp() {
        clearBrowserCookies();
        Configuration.browser = SelenoidChromeWebDriverProvider.class.getName();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterClass
    public static void tearDown() {
        SelenideLogger.removeListener("AllureSelenide");
    }
}
