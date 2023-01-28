package day07;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class C02_AcceptAlertTest extends TestBase {

    @Test
    public void acceptAlertTest() throws InterruptedException {

         driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//        1. butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//        uyarıdaki OK butonuna tıklayın
        Thread.sleep(5000);
        driver
                .switchTo()//degistir
                .alert()//alerte degistir
                .accept();//OK secenegine tiklanir
        Thread.sleep(5000);
        //        ve result mesajının
//       “You successfully clicked an alert” oldugunu test edin.
        //button[@onclick='jsAlert()']
        String actualMsg = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedMsg = "You successfully clicked an alert";
        Assert.assertEquals(expectedMsg,actualMsg);

    }
}