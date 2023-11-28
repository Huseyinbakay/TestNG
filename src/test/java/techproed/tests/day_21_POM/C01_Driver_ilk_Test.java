package techproed.tests.day_21_POM;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_Driver_ilk_Test {


    @Test
    public void test01() {

        Driver.getDriver().get("https://google.com");
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://facebook.com");


    }

    @Test
    public void test02() {




    }
}
