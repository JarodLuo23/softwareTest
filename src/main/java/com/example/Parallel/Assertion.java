package com.example.Parallel;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class Assertion {
    @Test
    public void TestGoogle() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.google.com/";
        String expectedTitle = "Neusoft";
        String actualTitle = "";
        driver.get(baseUrl);
        driver.findElement(By.name("q")).sendKeys("Neusoftttt", Keys.ENTER);
        actualTitle = driver.getTitle();
        assertEquals(actualTitle,expectedTitle,"Title is mismatched");
        driver.quit();
    }
    @Test
    public void TestGoogle2() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.google.com/";
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.name("q")).sendKeys("Neusoft", Keys.ENTER);
        Thread.sleep(5000);

        SoftAssert softAssert=new SoftAssert();
        //Title assertion
        String actualTitle = driver.getTitle();
        String expectedTitle = "Neusoft";
        softAssert.assertEquals(actualTitle,expectedTitle,"Title is mismatched");

        //URL Assertion
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.neusoft.com/cn/";
        softAssert.assertNotEquals(actualTitle,expectedTitle,"URL is mismatched");

        //Test Assertion
        String actualText = driver.findElement(By.name("q")).getAttribute("value");
        String expectedText = "";
        softAssert.assertEquals(actualTitle,expectedTitle,"Username text is mismatched");
        driver.quit();
        softAssert.assertAll();
    }
}
