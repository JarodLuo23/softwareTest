package com.example.Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTest1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/ljw/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        try{
            String baseUrl = "https://www.bing.com/";
            String expectedTitle = "Google";
            String actualTitle = "";

            driver.get(baseUrl);

            actualTitle = driver.getTitle();

            Thread.sleep(5000);
            //WebElement username=driver.findElement(By.id("identifierId"));
            //username.sendKeys("jvyas.kota@gmail.com");
            //Thread.sleep(5000);
            if (actualTitle.contentEquals(expectedTitle))
                System.out.println("Test Passed!");
            else
                System.out.println("Test Failed");
        }
        catch (Exception e)
        {
            System.out.println("Sorry: "+ e.getMessage());
        }

        finally
        {
            driver.close();
            System.out.println("Thank You");
        }
    }

}