package day09;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class C02_WindowHandle3 extends TestBase {
    @Test
    public void newWindowHandleTest() {
        // 1. Open the https://techproeducation.com/ page and test that the title is "Techpro Education"
        driver.get("https://techproeducation.com/");
        String techproTitle = driver.getTitle();
        Assert.assertTrue(driver.getTitle().contains("Techpro Education"));

        waitFor(3);

        // 2. Open a new window with https://www.amazon.com/ and test that the title is "Amazon"
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.amazon.com/','_blank');");
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        String amazonTitle = driver.getTitle();
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        waitFor(3);

        // 3. Open a new window with https://www.linkedin.com/feed/ and test that the title is "LinkedIn"
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.linkedin.com/feed/','_blank');");
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
        String linkedInTitle = driver.getTitle();
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));

    }
}