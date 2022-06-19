# selenium-cucumber-framework

## Overview

This is a simple yet easily scalable Web Application Testing Framework designed in BDD fashion. The languages used are Java and Gherkins. The build tool used is Maven. The tests can easily be executed, modified or added without many code changes or complexities. The tests can be scaled or modified on the go right from the feature files.

Languages Used: JAVA, Gherkins

## Installation

To install all dependencies, run 

```console
$ mvn clean install
```

## Running tests ##

```console
$ mvn test
```

By default, tests will run on Chrome. To change that, specify `-Dbrowser={browser}` where `{browser}` is either `chrome` or `firefox`.

You can also select specific scenarios to execute using `-Dcucumber.options="--tags @your_tag"`. More info about tags and how to combine them [here](https://github.com/cucumber/cucumber/tree/master/tag-expressions).

To run from the IDE itself (IntelliJ), following are the steps:
- Navigate to Run -> Edit Configurations
- Click on + Icon, and select Cucumber Java
- In Main Class, add io.cucumber.core.cli.Main
- In Glue, add com.web.automatedtest.homepage com.web.automatedtest.infrastructure.driver
- In Feature or Folder Path, add path to your code/selenium-cucumber-framework/src/test/resources/features/Home_page.feature
- Set Program Arguments to  --plugin org.jetbrains.plugins.cucumber.java.run.CucumberJvm5SMFormatter
- Click on Apply, Ok and then Run your tests from the Run button on the toolbar

---

## Architecture 🔨🔨🔨

- POM (Page Object Model)
    - Implementation makes it easier to keep centralized code for all pages
    - Improves redundancy of locators and page methods
    - Change in DOM becomes easier to manage

- Selenium WebDriver tool as the baseline due to its vast array of open-source collection of APIs which is used for testing web applications.
	- Largest open source community and numerous integrations
	- Native Cross Browser and Cross OS support
	- Support for multiple languages and vast range of frameworks 
	- Use of regex based xpaths to make tests dynamic and yet stable
	
	
- Cucumber Framework due to its BDD (Behavior Driven Development) approach
	- Gherkin language support, making it layman friendly and understandable for all stakeholders.
	- Cross Platform Support for Web, iOS, Android & more.
	- Easy parameterization from the feature files, making tests scalable on the go.
	- Reusability of same steps across different tests in different combinations.
	- Built in Cucumber Reports which contain the logs and precise test details.

---

## Support

Reach out to me at one of the following places!

- Linkedin at <a href="https://www.linkedin.com/in/madilqayyum/" target="_blank">`Adil Qayyum Linkedin`</a>
- Email at: adilqayyumk@gmail.com
