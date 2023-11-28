package techproed.tests.day19_anotocians;

import org.testng.annotations.*;

public class C01_Notasyonlar {

@BeforeSuite
    public void beforeSuit(){

    System.out.println("Herseyden önce 1 defa BeforeSuit Çalısır");

}


    @AfterSuite
    public void afterSuit(){

        System.out.println("Herseyden sonra 1 defa AfterSuit Çalısır");

    }

   @BeforeTest
   public void beforeTest(){

       System.out.println("Testlerden önce   BeforeTest 1 defa  Çalısır");

   }




    @AfterTest
    public void afterTest(){

        System.out.println("Testlerden sonra   AfterTest 1 defa  Çalısır");

    }


    @BeforeClass

    public void beforeClass(){

        System.out.println("Her classtan önce   BeforeClas 1 defa  Çalısır");

    }

     @AfterClass
     public void afterClass(){

         System.out.println("Her classtan sonra   AfterClas 1 defa  Çalısır");

     }





    @BeforeMethod
    public void setUp() {
        System.out.println("BeforeMethod notasyonuna sahip olan method her test methodundan once 1 kez calisir");

    }

    @AfterMethod
    public void tearDown() {
        System.out.println("AfterMethod notasyonuna sahip olan method her test methodundan sonra 1 kez calisir");
    }


    @Test
    public void test01() {
        System.out.println("test01 methodu calisti");
    }
    @Test
    public void test02() {
        System.out.println("test02 methodu calisti");
    }
    @Test
    public void test03() {
        System.out.println("test03 methodu calisti");
    }

    /*
    Junit te  @BeforeClass ve  @AfterClass annotationina sahip methodhlar static olmak zorundaydi
    Test NG bu zorunlulugu kaldirdi
     */







}
