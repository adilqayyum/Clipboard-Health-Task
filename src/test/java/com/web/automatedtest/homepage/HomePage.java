package com.web.automatedtest.homepage;

import com.web.automatedtest.basepage.BasePage;
import com.web.automatedtest.infrastructure.driver.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Set;


public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(@aria-label, 'Amazon')]")
    private WebElement logo;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]")
    private WebElement hamburger;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToPage(String url) {
        driver.get(url);
        wait.forLoading(Duration.ofSeconds(Setup.shortWait));
    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(Duration.ofSeconds(Setup.shortWait), this.logo, "Logo");
    }

    String getTitle() {
        return driver.getTitle();
    }

    void clickOnHamburgerButton() {
        wait.forElementToBeDisplayed(Duration.ofSeconds(Setup.shortWait), this.hamburger, "hamburger");
        this.hamburger.click();
        wait.forLoading(Duration.ofSeconds(10));
    }

    void clickOnValue(String spanText) {
        WebElement textElement = driver.findElement(
                By.xpath("//*[contains(text(), '" + spanText + "')]"));
        wait.forElementToBeDisplayed(Duration.ofSeconds(Setup.shortWait), textElement,
                "Span Value");
        textElement.click();
    }

    void clickSorting() {
        WebElement textElement = driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]"));
        wait.forElementToBeClickable(Duration.ofSeconds(Setup.shortWait), textElement, "Span Value");
        textElement.click();
    }

    void clickOnCheckboxValue(String spanText) {
        WebElement textElement = driver.findElement(
                By.xpath("//span[text()='" + spanText + "']//preceding-sibling::div[@class='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']"));
        wait.forElementToBeClickable(Duration.ofSeconds(Setup.longWait), textElement,
                "Span Value");
        textElement.click();
    }

    void clickOnDropdownValue(String spanText) {
        try {
            WebElement textElement = driver.findElement(
                    By.xpath("//*[@class='a-popover-inner']//*[contains(text(), '" + spanText + "')]"));
            wait.forElementToBeDisplayed(Duration.ofSeconds(Setup.longWait), textElement,
                    "Span Value");
            textElement.click();
        }
        catch (Exception ex){
            if (Setup.retry > 0) {
                clickSorting();
                clickOnDropdownValue(spanText);
                Setup.retry--;
            }
        }
    }

    void clickOnItemValue(String spanText) {
        WebElement textElement = driver.findElement(
                By.xpath("(//span[@class=\"a-size-base-plus a-color-base a-text-normal\"])[" + spanText + "]"));
        wait.forElementToBeDisplayed(Duration.ofSeconds(Setup.shortWait), textElement,
                "Span Value");
        textElement.click();
    }

    String getText() {
        WebElement textElement = driver.findElement(
                By.xpath("//*[@class='a-size-base-plus a-text-bold']"));
        wait.forElementToBeDisplayed(Duration.ofSeconds(Setup.shortWait), textElement,
                "Label Value");
        return textElement.getText();
    }

    void switchToChildWindow() {

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();

        for (String child_window : s) {

            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
            }
        }
    }
}
