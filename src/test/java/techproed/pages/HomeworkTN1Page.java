package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.Properties;

public class HomeworkTN1Page {

    public HomeworkTN1Page() {

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//button")
    public WebElement sigiIn;


    @FindBy(name = "user_login")
    public WebElement userName;


    @FindBy(id = "user_password")
    public WebElement password;



    @FindBy(name = "submit")
    public WebElement singInOnay;


    @FindBy(id = "online-banking")
    public WebElement moreServicesButton;

    @FindBy(name = "submit")
    public WebElement ingInOnay;


    @FindBy(name = "submit")
    public WebElement ngInOnay;


    @FindBy(name = "submit")
    public WebElement InOnay;


    @FindBy(name = "submit")
    public WebElement Innay;





}
