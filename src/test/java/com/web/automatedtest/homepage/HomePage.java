package com.web.automatedtest.homepage;

import com.web.automatedtest.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class HomePage extends BasePage{

    @FindBy(xpath = "//a[contains(@aria-label, 'Amazon')]")
    private WebElement logo;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]")
    private WebElement hamburger;

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/div[20]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")
    private WebElement samsung;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToPage(String url){
        driver.get(url);
        wait.forLoading(Duration.ofSeconds(5));
    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(Duration.ofSeconds(5), this.logo, "Logo");
    }
    String getTitle() {
        return driver.getTitle();
    }

    void clickOnHamburgerButton() {
        wait.forElementToBeDisplayed(Duration.ofSeconds(10), this.hamburger, "hamburger");
        this.hamburger.click();
        wait.forLoading(Duration.ofSeconds(10));
    }

    void clickOnValue(String spanText) {
        WebElement textElement = driver.findElement(
                By.xpath("//*[contains(text(), '"+spanText+"')]"));
        wait.forElementToBeDisplayed(Duration.ofSeconds(20), textElement,
                "Span Value");
        textElement.click();
    }

    void clickOnDropdownValue(String spanText) {
        WebElement textElement = driver.findElement(
                By.xpath("//*[@class='language-picker-component']//*[contains(text(), '"+spanText+"')]"));
        wait.forElementToBeDisplayed(Duration.ofSeconds(20), textElement,
                "Span Value");
        textElement.click();
    }

    void selectText(String labelText) {
        WebElement textElement = driver.findElement(
                By.xpath("//*[@class='questions-page-container']//*[contains(text(), '"+labelText+"')]"));
        wait.forElementToBeDisplayed(Duration.ofSeconds(20), textElement,
                "Label Value");
        textElement.click();
    }
}
