package testsuite;
//* Enter valid username
//* Enter valid password
//* Click on ‘LOGIN’ button
//* Verify the ‘Accounts Overview’ text is display
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {
    String baseurl = "https://parabank.parasoft.com/parabank/index.htm";
    @Before
    public void setUp(){openBrowser( baseurl );}
    @Test
    public void logIn(){
        sendTextToElement( By.xpath( "//*[@id=\"loginPanel\"]/form/div[1]/input" ),"HP@gmail.com" );
        sendTextToElement( By.xpath( "//*[@id=\"loginPanel\"]/form/div[2]/input" ),"Sp1234" );
        driver.findElement( By.xpath( "//*[@id=\"loginPanel\"]/form/div[3]/input" ) ).click();
    }
}
