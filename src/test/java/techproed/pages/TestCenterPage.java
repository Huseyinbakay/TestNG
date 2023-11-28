package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestCenterPage {


    public TestCenterPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "exampleInputEmail1")
   public WebElement userName;


    @FindBy(id = "exampleInputPassword1")
    public WebElement password;



    @FindBy(tagName = "button")
    public WebElement summitButton;


    @FindBy(xpath = "//a[@class='btn btn-dark']")
    public WebElement logOut;





}
