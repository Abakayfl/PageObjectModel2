package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage2;
import pages.ReservationPage;

@Test
public class RegistrationTest {

    WebDriver driver;

    public void verifyFlightReg(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        pages.RegistrationPage2.RegistrationPage RGPage = new pages.RegistrationPage2.RegistrationPage(driver);
        RegistrationPage2 RGPage = new RegistrationPage2(driver);
        LoginPage LGPAGE = new LoginPage(driver);
        ReservationPage ReserPage = new ReservationPage((driver));

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        RGPage.clickRegLink();
        RGPage.setFirstName("Matt");
        RGPage.setLastName("Akbey");
        RGPage.setPhone("2120123456");
        RGPage.setEmail("matt@gmail.com");
        RGPage.setAddress1("Beyoglu");
        RGPage.setCity("ISTANBUL");
        RGPage.setState("");
        RGPage.setPostalCode("34200");
        RGPage.setCountry("TURKEY");
        RGPage.setUsername("MATT");
        RGPage.setPassword("Matt1");
        RGPage.setConfirmPassword("Matt1");
        RGPage.clickRegBtn();
        RGPage.clickSigninLink();
        LGPAGE.typeUserName("MATT");
        LGPAGE.typePassword("Matt1");
        LGPAGE.clickSubmit();
        LGPAGE.clickFlights();
        ReserPage.clickOneway();
        ReserPage.selectPassengerNumber();
        ReserPage.clickSignOff();

        //Validation

        if(driver.getCurrentUrl().contains("https://demo.guru99.com/test/newtours/index.php"))
        {
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAILED");
        }

        driver.close();

    }
}
