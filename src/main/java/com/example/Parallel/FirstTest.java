package com.example.Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstTest {
        @Test
        public void TestGoogle() throws Exception {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            String baseUrl = "https://www.google.com/";
            String expectedTitle = "Neusoft";
            String actualTitle = "";
            driver.get(baseUrl);
            driver.findElement(By.name("q")).sendKeys("Neusoft", Keys.ENTER);
            System.out.println(driver.getTitle());
            Thread.sleep(500);
            driver.quit();

        }
    }

