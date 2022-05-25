package com.example.Parallel.Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class exercise {

    @Test
    public void test() {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://localhost:8080/excercise.html");
            WebElement firstname = driver.findElement(By.name("firstname"));
            firstname.sendKeys("Jarod");
            WebElement middlename = driver.findElement(By.name("middlename"));
            middlename.sendKeys("JUNWEN");
            WebElement lastname = driver.findElement(By.name("lastname"));
            lastname.sendKeys("Luo");
            Select course = new Select(driver.findElement(By.id("course")));
            course.selectByValue("BBA");
//            boolean state = driver.findElement(By.id("female")).isSelected();
//            WebElement gender = driver.findElement(By.name("gender"));
            driver.findElement(By.id("female")).click();
            WebElement phone = driver.findElement(By.name("phone"));
            phone.sendKeys("15012664755");
            WebElement placeholder = driver.findElement(By.name("placeholder"));
            placeholder.sendKeys("Guangdong Neusoft University shishan Town nanhai District Foshan City Guangdong Province");
            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("12345677890@163.com");
            WebElement psw = driver.findElement(By.name("psw"));
            psw.sendKeys("123456");
            WebElement psw_repeat = driver.findElement(By.name("psw-repeat"));
            psw_repeat.sendKeys("123456");
            System.out.println(driver.getTitle());
            Thread.sleep(10000);
            driver.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
