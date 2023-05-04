package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(how= How.NAME, using="userName")
    WebElement username;

    @FindBy(how=How.NAME, using="password")
    WebElement pass;

    @FindBy(how=How.NAME, using="submit")
    WebElement submit;

    @FindBy(how=How.LINK_TEXT, using="Flights")
    WebElement flights;

    public LoginPage(WebDriver d) {
        driver = d;
        //this.driver = driver;
        PageFactory.initElements(d, this); // additional method
    }

    public void typeUserName(String un)
    {
        username.sendKeys(un);
    }


    public void typePassword(String pasw)
    {
        pass.sendKeys(pasw);
    }

    public void clickSubmit()
    {
        submit.click();
    }

    public void clickFlights()
    {
        flights.click();
    }

}


