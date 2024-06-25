package ru.SkillFactory.PageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class TestNine {
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
    public void test9() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1051, 815));
        js.executeScript("window.scrollTo(0,600)");
        js.executeScript("window.scrollTo(0,1315.199951171875)");
        js.executeScript("window.scrollTo(0,2653.60009765625)");
        {
            WebElement element = driver.findElement(By.linkText("Участвовать"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.linkText("Участвовать")).click();
        vars.put("win2736", waitForWindow(2000));
        vars.put("root", driver.getWindowHandle());
        driver.switchTo().window(vars.get("win2736").toString());
        driver.switchTo().window(vars.get("root").toString());
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.switchTo().window(vars.get("win2736").toString());
    }
}