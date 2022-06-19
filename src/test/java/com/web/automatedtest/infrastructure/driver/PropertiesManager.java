package com.web.automatedtest.infrastructure.driver;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;


public class PropertiesManager {

    Properties prop = new Properties();

    public String getProperty(String propertyName){

        try {
            // load a properties file for reading
            prop.load(Files.newInputStream(Paths.get("src/test/resources/config.properties")));
            return prop.getProperty(propertyName);
        }
        catch (Exception ex){
            System.out.println(ex);
        }

        return propertyName;
    }
}
