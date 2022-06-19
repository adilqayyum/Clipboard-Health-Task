package com.web.automatedtest.basepage;

import com.web.automatedtest.infrastructure.driver.Setup;
import com.web.automatedtest.infrastructure.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
