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
import java.util.Set;
public class TestSixteen {
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
    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }
    @Test
    public void test16() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,1500)");
        js.executeScript("window.scrollTo(0,4186)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".swiper-slide-active span")).click();
        vars.put("win1986", waitForWindow(2000));
        driver.switchTo().window(vars.get("win1986").toString());
    }
}