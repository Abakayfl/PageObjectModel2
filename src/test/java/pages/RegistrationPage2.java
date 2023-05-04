package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {

    WebDriver driver;

    @FindBy(how= How.LINK_TEXT, using="REGISTER")
    WebElement RegLink;
    @FindBy(how=How.NAME, using="firstName")
    WebElement FirstName;
    @FindBy(name="lastName")
    WebElement LastName;
    @FindBy(name="phone")
    WebElement phone;
    @FindBy(name="userName")
    WebElement email;
    @FindBy(name="address1")
    WebElement address1;
    @FindBy(name="city")
    WebElement city;
    @FindBy(name="postalCode")
    WebElement postalCode;
    @FindBy(name="country")
    WebElement country;
    @FindBy(name="email")
    WebElement username;
    @FindBy(name="password")
    WebElement password;
    @FindBy(name="confirmPassword")
    WebElement confirmpassword;
    @FindBy(name="submit")
    WebElement registerBtn;
    @FindBy(linkText = "sign-in")
    WebElement signinLink;

    public RegistrationPage2(WebDriver d)
    {
        driver = d;
        //this.driver = driver;
        PageFactory.initElements(d, this); // additional method
    }

    public void clickRegLink()
    {
        RegLink.click();
    }
    public void setFirstName(String fname)
    {
        FirstName.sendKeys(fname);
    }
    public void setLastName(String lname)
    {
        LastName.sendKeys(lname);
    }
    public void setPhone(String ph)
    {
        phone.sendKeys(ph);
    }
    public void setEmail(String eml)
    {
        email.sendKeys(eml);
    }
    public void setAddress1(String addr1)
    {
        address1.sendKeys(addr1);
    }
    public void setCity(String ci)
    {
        city.sendKeys(ci);
    }
    public void setState(String st)
    {
        city.sendKeys(st);
    }
    public void setPostalCode(String pc)
    {
        postalCode.sendKeys(pc);
    }
    public void setCountry(String cntr)
    {
        country.sendKeys(cntr);
    }
    public void setUsername(String un)
    {
        username.sendKeys(un);
    }
    public void setPassword(String p)
    {
        password.sendKeys(p);
    }
    public void setConfirmPassword(String cp)
    {
        confirmpassword.sendKeys(cp);
    }
    public void clickRegBtn()
    {
        registerBtn.click();
    }
    public void clickSigninLink(){ signinLink.click();}

    public static class RegistrationPage {

        WebDriver driver;

        By RegLink = By.linkText("REGISTER");
        By FirstName = By.name("firstName");
        By LastName = By.name("lastName");
        By phone = By.name("phone");
        By email = By.name("userName");
        By address1 = By.name("address1");
        By city = By.name("city");
        By postalCode = By.name("postalCode");
        By country = By.name("country");
        By username = By.name("email");
        By password = By.name("password");
        By confirmpassword = By.name("confirmPassword");
        By registerBtn = By.name("submit");
        By signinLink = By.partialLinkText("sign");

        RegistrationPage(WebDriver d)
        {
        driver = d;

        //this.driver = driver;
        }

        public void clickRegLink()
        {
        driver.findElement(RegLink).click();
        }
        public void setFirstName(String fname)
        {
            driver.findElement(FirstName).sendKeys(fname);
        }
        public void setLastName(String lname)
        {
            driver.findElement(LastName).sendKeys(lname);
        }
        public void setPhone(String ph)
        {
            driver.findElement(phone).sendKeys(ph);
        }
        public void setEmail(String eml)
        {
            driver.findElement(email).sendKeys(eml);
        }
        public void setAddress1(String addr1)
        {
            driver.findElement(address1).sendKeys(addr1);
        }
        public void setCity(String ci)
        {
            driver.findElement(city).sendKeys(ci);
        }
        public void setState(String st)
        {
            driver.findElement(city).sendKeys(st);
        }
        public void setPostalCode(String pc)
        {
            driver.findElement(postalCode).sendKeys(pc);
        }
        public void setCountry(String cntr)
        {
            driver.findElement(country).sendKeys(cntr);
        }
        public void setUsername(String un)
        {
            driver.findElement(username).sendKeys(un);
        }
        public void setPassword(String p)
        {
            driver.findElement(password).sendKeys(p);
        }
        public void setConfirmPassword(String cp)
        {
            driver.findElement(confirmpassword).sendKeys(cp);
        }
        public void clickRegBtn()
        {
            driver.findElement(registerBtn).click();
        }
        public void clickSigninLink(){driver.findElement(signinLink).click();}

    }
}

