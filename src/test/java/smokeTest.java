import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ER27 on 2016-04-14.
 */
public class smokeTest {

    @Test
    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.seleniumsimplified.com");

        Assert.assertTrue("title should start with Selenium Simplified",
                driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
