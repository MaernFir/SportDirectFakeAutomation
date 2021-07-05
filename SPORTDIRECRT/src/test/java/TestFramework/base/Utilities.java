package TestFramework.base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Utilities {

    private static WebDriver driver = BasePage.getDefaultDriver();

    public static WebElement getWebElement(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public static WebElement getWebElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }


    public static void checkElementText(String title) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(), title);
    }

    public static void checkSearchResult(String search, String value ) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(search, value);
    }

    public static void navigateToWebsite(String website) {
        driver.navigate().to(website);
    }
}
