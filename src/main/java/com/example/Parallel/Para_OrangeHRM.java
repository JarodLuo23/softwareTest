package com.example.Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Para_OrangeHRM {
        WebDriver driver;
        @Parameters("browserName")
        @BeforeTest
        public void InitialiseBrowser(String browserName) {

            switch (browserName.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.err.println("Broswer Name is invaild");
                    break;
            }
            driver.manage().window().maximize();
        }

        @Parameters("sleepTime")
        @AfterTest
        public void Teardown(String sleepTime) throws InterruptedException {
            System.out.println(sleepTime);
            Thread.sleep(Long.valueOf(sleepTime));
            driver.quit();
        }
        @Parameters("url")

        @Test
        public void LaunchApp(String url) {
//        driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.get(url);
        }
        @Parameters({"username","password"})
        @Test
        public void EnterLoginDetails(String username,String password) throws Exception {
            driver.findElement(By.id("txtUsername")).sendKeys(username);
            driver.findElement(By.id("txtPassword")).sendKeys(password);
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
