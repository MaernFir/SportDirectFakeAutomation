package TestFramework.stepFiles.pages;

import static TestFramework.stepFiles.SportDirectsConstants.*;
import static TestFramework.stepFiles.workers.sportsDirectsWorker.*;

import cucumber.api.java.en.Given;

public class searchPage {


    @Given("^User navigates to website$")
    public void user_navigates_to_website() {
        navigateToWebsite(SDUrl);
        checkElementTitle("SportsDirect.com – The UK’s No 1 Sports Retailer");
    }

    @Given("^User clicks search bar$")
    public void userClicksToSearchBar()  {
        clickSearchBar();
    }

    @Given("^User enter \"(.*)\" to search bar and click search button$")
    public void userClicksToSearchBar(String xxx)  {
        valueToSearchBar(xxx);
        clickSearchButton();
    }

    @Given("^User sees \"(.*)\" value at search results$")
    public void UserSeeSearchResult(String value)  {
        checkSearchResult(value);
    }

    //as it is homework i didnt create a table structure for this job. its good to create table and write products in table and assert it
    @Given("^User adds \"(.*)\" product to cart$")
    public void userAddsProduct(String value)  {
        clickProduct(value);
        addCart();
    }

}
