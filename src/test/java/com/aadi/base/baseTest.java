package com.aadi.base;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriverService;

/**
 * @author Carlos Durand Silva
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.aadi.base",
        strict = true,
        tags = "@WebServicePet")


public class baseTest {

    public static String ANSI_GREEN = "\u001B[32m";
    public static final String AADI_WELCOME =
            "-------------------------------------------------------------------------------------|\n" +
                    "-------------------------------------------------------------------------------------|\n" +
                    " .________.   .________.   .______.       .____.        \n" +
                    " |   __   |   |   __   |   |  .___ \\      |    |      \n" +
                    " |  |  |  |   |  |  |  |   |  |   \\ \\     |    |     \n" +
                    " |  |__|  |   |  |__|  |   |  |    | |    |    |   \n" +
                    " |  .__.  |   |  .__.  |   |  |___/ /     |    |    \n" +
                    " |__|  |__|   |__|  |__|   |_______/      |____|        \n" +
                    "                                                                       \n" +
                    "-------------------------------------------------------------------------------------|\n" +
                    "-------------------------------------------------------------------------------------|\n";


    @BeforeClass
    public static void messages() {
        System.out.println(ANSI_GREEN + AADI_WELCOME + ANSI_GREEN);
    }

    @AfterClass
    public static void message() {
        System.out.println(ANSI_GREEN + AADI_WELCOME + ANSI_GREEN);
    }

}
