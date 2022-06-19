package com.web.automatedtest.infrastructure.driver;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class TearDown {

    private final WebDriver driver;

    public TearDown() {
        this.driver = Setup.driver;
    }

    @After
    public void quitDriver(){
        this.driver.quit();
    }
}
