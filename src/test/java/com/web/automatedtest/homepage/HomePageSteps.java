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

    @And("^Click on Sorting$")
    public void clickOnSorting() {
        this.homePage.clickSorting();
    }

    @And("^Click on Item Value \"([^\"]*)\"$")
    public void clickOnItemValue(String value) {
        this.homePage.clickOnItemValue(value);
    }

    @And("^Click on Checkbox Value \"([^\"]*)\"$")
    public void clickOnCheckboxValue(String value) {
        this.homePage.clickOnCheckboxValue(value);
    }

    @And("^Switch to New Window$")
    public void switchWindow() {
        this.homePage.switchToChildWindow();
    }

    @Then("^page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        String displayedTitle = this.homePage.getTitle();
        Assert.assertEquals("Displayed title is " + displayedTitle +
                " instead of " + title, title, displayedTitle);
    }

    @Then("^Text \"([^\"]*)\" is present")
    public void textIsPresent(String text) {
        String displayedText = this.homePage.getText();
        Assert.assertEquals(displayedText, text);
    }
}
