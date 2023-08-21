package com.grid.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    static WebDriver driver = null;
    public static WebDriver getChromeDriverForSauce(){
        try {
        ChromeOptions chromeOptions = new ChromeOptions();
            driver = new RemoteWebDriver(new URL("https://oauth-y.deger-55a74:f1032f38-6bfa-4d13-bd19-6013f161526b@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;
    }

    public static WebDriver getFirefoxDriver(){
        try {
            FirefoxOptions options = new FirefoxOptions();
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;
    }
}
