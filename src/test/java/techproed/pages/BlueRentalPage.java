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




    @FindBy(name = "password")
    public WebElement password;


 @FindBy(xpath = "//*[contains( text(), 'User with email'  )]")
    public WebElement alertNegative;

}
