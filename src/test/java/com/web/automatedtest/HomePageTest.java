package com.web.automatedtest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/home_page.feature"},

        plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json"},

        glue = {"com.web.automatedtest.infrastructure.driver",
                "com.web.automatedtest.homepage"})

public class HomePageTest {
}
