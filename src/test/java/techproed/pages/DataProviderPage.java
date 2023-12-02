package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataProviderPage {

    public DataProviderPage() {

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(id = "result")
   public WebElement verifiyMessage;


    @FindBy(id = "age")
    public WebElement ageSearchBox;






}
