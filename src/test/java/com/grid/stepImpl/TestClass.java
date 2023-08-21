package com.grid.stepImpl;

import com.grid.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class TestClass {

    @Test
    public void test1() throws InterruptedException, MalformedURLException {
        WebDriver driver = DriverFactory.getChromeDriverForSauce();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium Grid", Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }

}
