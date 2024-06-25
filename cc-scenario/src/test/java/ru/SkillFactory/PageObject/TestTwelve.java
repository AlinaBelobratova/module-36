package ru.SkillFactory.PageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
public class TestTwelve {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test12() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,696)");
        js.executeScript("window.scrollTo(0,1800)");
        js.executeScript("window.scrollTo(0,4100)");
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Aleksandra Semashko");
        driver.findElement(By.name("email")).sendKeys("shurasemashko94@gmail.com");
        driver.findElement(By.id("input_1676828667932")).click();
        driver.findElement(By.id("input_1676828667932")).sendKeys("(911) 367-93-52");
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(8) > .t-submit")).click();
        driver.findElement(By.cssSelector(".t-form-success-popup__close-icon")).click();
    }
}