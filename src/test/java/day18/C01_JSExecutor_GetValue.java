package day18;

import Utilities.TestBase;
import org.junit.Test;


public class C01_JSExecutor_GetValue extends TestBase {

    //      1)getValueTest metotu olustur
//  2)https://www.priceline.com/ a git
//            3)Tarih kısmındaki Yazili metinleri al ve yazdır
    @Test
    public void getValueTest(){
        driver.get("https://www.priceline.com/");
        getValueByJS("hotelDates");
    }
}



//Openai

/*
* Sure, here's an example of using JavaScriptExecutor to retrieve the text from the "hotelDates" element using a CSS selector:

typescript
Copy code
public class C01_JSExecutor_GetValue extends TestBase {

    @Test
    public void getValueTest(){
        driver.get("https://www.priceline.com/");
        String hotelDatesText = (String) ((JavascriptExecutor)driver)
                                .executeScript("return document.querySelector('#hotelDates').textContent;");
        System.out.println(hotelDatesText);
    }
}
And here is your TestBase utilities added to the code

typescript
Copy code
public class C01_JSExecutor_GetValue extends TestBase {

    @Test
    public void getValueTest(){
        driver.get(baseUrl);
        String hotelDatesText = (String) ((JavascriptExecutor)driver)
                                .executeScript("return document.querySelector('#hotelDates').textContent;");
        System.out.println(hotelDatesText);
    }
    @BeforeMethod
    public void setUp() {
        initialize();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
Here initialize(); method will initiate the driver and baseUrl is the URL that you want to navigate.
driver.quit(); will close the browser after the test method is executed.




*
*
* */