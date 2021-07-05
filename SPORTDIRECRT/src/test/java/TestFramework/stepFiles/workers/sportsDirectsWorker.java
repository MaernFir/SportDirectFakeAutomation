package TestFramework.stepFiles.workers;

import TestFramework.base.Utilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static TestFramework.base.Utilities.getWebElement;
import static TestFramework.base.Utilities.getWebElementByXpath;
import static TestFramework.stepFiles.SportDirectsConstants.*;

public class sportsDirectsWorker {

   static Utilities utility = new Utilities();

    public static WebElement searchBarText() {
        return getWebElement(searchBar);
    }

    public static WebElement clickSearch() {
        return getWebElement(searchButton);
    }

    public static WebElement searchResults() {
        return getWebElement(searchResult);
    }


    public static WebElement addProducttoCart() {
        return getWebElement(addToBag);
    }

    public static WebElement shoppingCartButton() {
        return getWebElement(shoppingCart);
    }


    public static WebElement bagQuantity() { return getWebElement(bagQuantity); }

    public static void navigateToWebsite(String title) { utility.navigateToWebsite(title) ; }

    public static void clickSearchBar() {
        searchBarText().click();
    }

    public static void valueToSearchBar(String value) {
        searchBarText().sendKeys(value);
    }

    public static void clickSearchButton() {
        clickSearch().click();
    }

    public static void checkElementTitle(String title) {
        utility.checkElementText(title);
    }

    public static void checkSearchResult(String searchValue) {
            String valueAtPage = searchResults().getText();
            Utilities.checkSearchResult(searchValue,valueAtPage);
    }

    public static void clickProduct(String searchValue) {
       switch (searchValue){
           case "first":
               WebElement firstProduct = getWebElementByXpath("//*[@id=\"navlist\"]/li[1]/div/div/div[1]/a[1]");
               firstProduct.click();
               break;
           //better to put not first product but a constant that can get number according to case value .
           // ex: when customer enters first it will convert it to 1 and this value will be inserted to firstProduct constant to make it use multiple way.

           default:
               System.out.println("Use Proper Values");
       }

    }

    public static void addCart() {
        addProducttoCart().click();
        shoppingCartButton().click();
        String shoppingBagText = bagQuantity().getText();
        Assert.assertNotEquals(shoppingBagText,0);

        //assertNot Equal i think one of the worst assertion type but it is easy to implement
    }
    }


