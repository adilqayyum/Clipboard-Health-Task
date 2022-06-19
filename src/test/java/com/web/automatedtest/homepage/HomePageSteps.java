package com.web.automatedtest.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageSteps {


    private final HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^A user navigates to URL \"([^\"]*)\"$")
    public void aUserNavigatesToURL(String url) {
        this.homePage.goToPage(url);
    }

    @Then("^Amazon logo is displayed$")
    public void amazonLogoIsDisplayed() {
        this.homePage.checkLogoDisplay();
    }
    @And("^Click on Hamburger Button$")
    public void clickOnHamBurgerButton() {
        this.homePage.clickOnHamburgerButton();
    }

    @And("^Click on Dropdown Value \"([^\"]*)\"$")
    public void clickOnDropdownValue(String value) {
        this.homePage.clickOnDropdownValue(value);
    }

    @And("^Click on Value \"([^\"]*)\"$")
    public void clickOnValue(String value) {
        this.homePage.clickOnValue(value);
    }

    @And("^Select Form Value \"([^\"]*)\"$")
    public void selectText(String value) {
        this.homePage.selectText(value);
    }

    @Then("^page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        String displayedTitle = this.homePage.getTitle();
        Assert.assertEquals("Displayed title is " + displayedTitle +
                " instead of " + title, title, displayedTitle);
    }
}
