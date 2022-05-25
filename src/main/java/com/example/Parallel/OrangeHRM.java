package com.example.Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class OrangeHRM {
        WebDriver driver;

        @BeforeTest
        public void InitialiseBrowser() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @AfterTest
        public void Teardown() {
            driver.quit();
        }

        @Test
        public void LaunchApp() {
            driver.get("https://opensource-demo.orangehrmlive.com/");
        }

        @Test
        public void EnterLoginDetails() throws Exception {
            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
            driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
            Thread.sleep(1000);
        }

        @Test
        public void NaviagateToMyInfo() {
            driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        }

        @Test
        public void VerifyMyInfo() {
            boolean actualValue = driver.findElement(By.id("employee-details")).isDisplayed();
            assertTrue(actualValue);
        }

        @Test
        public void VerifyLogin() {
            WebElement element = driver.findElement(By.id("welcome"));
            assertTrue(element.isDisplayed());
            System.out.println(element.isDisplayed());
            System.out.println(element.getText().startsWith("Welcome"));
        }
    }
