//package com.example.Parallel;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//public class BasicTest {
//
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","/Users/ljw/Downloads/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        try {
//            ExtentHtmlReporter Reporter = new ExtentHtmlReporter("/Users/ljw/Downloads/MyReport.html");
//// Create Extent Reports and attach Reporter
//            ExtentReports extent = new ExtentReports();
//            extent.attachReporter(Reporter);
//            ExtentTest test1 = extent.createTest("Google Search Test", "this is to test google search");
//            test1.log(Status.INFO, "Starting Test Case");
//            driver.get("https://google.com");
//            String Title= "Google";
//            if (driver.getTitle().equals(Title))
//                test1.pass("Navigated to Google.com");
//            else
//                test1.fail("Something went wrong: " + driver.getTitle() );
//            WebElement searchbar =  driver.findElement(By.name("q"));
//            searchbar.sendKeys("Extent Reports");
//
//            test1.pass("Entered Search content");
//            searchbar.sendKeys(Keys.ENTER);
//            test1.pass("Enter key Pressed");
//            driver.close();
//            test1.pass("Close Browser");
//            extent.flush();// To Print The Report
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
