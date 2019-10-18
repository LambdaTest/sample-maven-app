package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //ChromeOptions capabilities = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "77");
        capabilities.setCapability("platformName", "Windows 10");
        //capabilities.setCapability("build", "Selenium Test");
        //capabilities.setCapability("name", browser + "  " + version + "  " + platform + "   " + fixedIp);
        capabilities.setCapability("network", true);
        capabilities.setCapability("visual", true);
        capabilities.setCapability("video", true);
        capabilities.setCapability("console", true);
        //capabilities.setCapability("fixedIP", fixedIp);
        //capabilities.setCapability("timezone", timezone);
        //capabilities.setCapability("fixedPort", fixedPort);
        //capabilities.setCapability("resolution", resolution);
        capabilities.setCapability("tunnel", true);
        //capabilities.setCapability("geoLocation", geoLocation);
        //capabilities.setCapability("selenium_version", "4.0.0-alpha-2");
        //apabilities.setCapability("chrome.driver","78.0");
        capabilities.setCapability("w3c", true);

        String url = System.getenv("HUB_URL");
        System.err.println(url);
        url = System.getProperty("HUB_URL");
        System.err.println(url);
        //driver = new RemoteWebDriver(new URL(url), capabilities);
        //System.err.println(driver);

        System.err.println("sleeping for some time " + new java.util.Date());
        try { Thread.sleep(20 * 1000); } catch(Exception e) {}
        System.err.println("waking up after some time " + new java.util.Date());
        System.err.println("Hello, World!");
        assertTrue( true );
    }
}
