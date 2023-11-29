package techproed.tests.day_23_ExelTest;

import org.testng.annotations.Test;
import techproed.utilities.ExelRider;

public class C01_ExelTest {


    @Test
    public void test01() {

        String dosyaYolu="src\\test\\java\\techproed\\pages\\resources\\mysmoketestdata (1).xlsx";
        String sayfaAdi="customer_info";

        ExelRider exelRider=new ExelRider(dosyaYolu,sayfaAdi);

        System.out.println(exelRider.getCellData(1, 0));

    }
}
