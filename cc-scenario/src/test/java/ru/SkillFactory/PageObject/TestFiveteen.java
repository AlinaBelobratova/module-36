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
public class TestFiveteen {
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
    public void test15() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,996)");
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
    }
}