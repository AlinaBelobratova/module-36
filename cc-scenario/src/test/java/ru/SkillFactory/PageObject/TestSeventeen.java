package ru.SkillFactory.PageObject;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
public class TestSeventeen {
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
    public void test17() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,600)");
        js.executeScript("window.scrollTo(0,3800)");
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-next-btn")).click();
        driver.findElement(By.id("mentors-next-btn")).click();
        {
            WebElement element = driver.findElement(By.id("mentors-next-btn"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("mentors-next-btn")).click();
    }
}