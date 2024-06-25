package ru.SkillFactory.PageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
public class TestTwo {
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
    public void Test2() {
        driver.get("https://skillfactory.ru/courses/testirovanie");
        driver.manage().window().setSize(new Dimension(1552, 849));
        driver.findElement(By.cssSelector(".loaded")).click();
        {
            WebElement element = driver.findElement(By.cssSelector("li:nth-child(4) > .main__nav-item"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
    }
}