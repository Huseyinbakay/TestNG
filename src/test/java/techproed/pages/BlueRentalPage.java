package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {
    public BlueRentalPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//a[@role='button']")
    public WebElement login;



    @FindBy(id = "formBasicEmail")
    public WebElement email;


    @FindBy(id = "formBasicPassword")
    public WebElement password;



 @FindBy(xpath = "//*[contains( text(), 'User with email'  )]")
    public WebElement alertNegative;


    @FindBy(id = "dropdown-basic-button")
    public WebElement verifiyLogin;



    @FindBy(xpath = "//*[.='Profile']")
    public WebElement profile;


    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logOut;


    @FindBy(xpath = "//*[.='OK']")
    public WebElement OK;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;


    @FindBy(xpath = "//h1[.='Login']")
    public WebElement inValidLogin;



    @FindBy(xpath ="(//a[@href=\"/\"])[2]" )
    public WebElement home;


    @FindBy(xpath = "//select[@name='car']")
    public WebElement selectCar;


    @FindBy(name = "pickUpLocation")
    public WebElement pickUp;

    @FindBy(name = "dropOfLocation")
    public WebElement dropOf;


    @FindBy(name = "pickUpDate")
    public WebElement pickUpDate;


    @FindBy(name = "pickUpTime")
    public WebElement pickUpTime;

    @FindBy(name = "dropOffDate")
    public WebElement dropOffDate;


    @FindBy(name = "dropOffTime")
    public WebElement dropOffTime;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement reservation;


    @FindBy(xpath = "//*[contains( text(), 'Please first login'  )]")
    public WebElement pleaseLoginAlert;


}
