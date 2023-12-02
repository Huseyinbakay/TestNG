package techproed.tests.day_21_POM;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.pages.HomeworkTN1Page;
import techproed.utilities.Driver;

public class HomeworkTN1Kullanımı {

   Actions actions;
    @Test
    public void test01() {

        //1."http://zero.webappsecurity.com/" Adresine gidin başlığın Personal içerdiğini test edin
        Driver.getDriver().get("http://zero.webappsecurity.com/");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Personal"));



   HomeworkTN1Page homeworkTN1=new HomeworkTN1Page();


//2. Sign in butonuna basin
   homeworkTN1.sigiIn.click();




//3. Login kutusuna "username" yazin

        homeworkTN1.userName.sendKeys("username");


//4. Password kutusuna "password" yazin
        homeworkTN1.password.sendKeys("password");


//5. Sign in tusuna basin
        homeworkTN1.singInOnay.click();

        Driver.getDriver().navigate().back();

//6. Online banking menusu icinde Pay Bills sayfasina gidin başlığın Zero içerdiğini test edin
    actions=new Actions(Driver.getDriver());

    actions.scrollToElement(homeworkTN1.moreServicesButton).perform();
    homeworkTN1.moreServicesButton.click();
    softAssert.assertTrue(Driver.getDriver().getTitle().contains("Zero"));

//7. "Purchase Foreign Currency" tusuna basin

//8. "Currency" drop down menusunden Eurozone'u secin
//9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
//10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test
//edin ("Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
//(franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
//(pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
//(krone)","New Zealand (dollar)","Sweden (krona)","Singapore
//(dollar)","Thailand (baht)")


softAssert.assertAll();


    }
}
