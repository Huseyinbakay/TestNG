package techproed.tests.day_25_xlmFiles_paralel_testing;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_ParalelTesting {


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));
        Driver.closeDriver();
    }

    @Test
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));
        Driver.closeDriver();
    }





}
