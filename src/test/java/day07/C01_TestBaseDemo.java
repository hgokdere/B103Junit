package day07;

import Utilities.TestBase;
import org.junit.Test;

public class C01_TestBaseDemo extends TestBase {

    @Test
    public void test1(){

        driver.get("https://techproeducation.com/");
        String pageTtile= driver.getTitle();
        System.out.println("pageTtile = " + pageTtile);


    }
}
