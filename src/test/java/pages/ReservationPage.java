package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {

    WebDriver driver;

    @FindBy(how= How.XPATH, using="(//input[@value='oneway'])")
    WebElement oneway;

    @FindBy(how= How.LINK_TEXT, using="SIGN-OFF")
    WebElement signOff;

    public ReservationPage(WebDriver d) {
        driver = d;
        //this.driver = driver;
        PageFactory.initElements(d, this); // additional method
    }

    public void clickOneway()
    {
        oneway.click();
    }

    public void selectPassengerNumber()

    {
        WebElement n = driver.findElement(By.name("passCount"));

        Select sl = new Select(n);
        sl.selectByValue("4");
    }

    public void clickSignOff(){
        signOff.click();

    }

}

