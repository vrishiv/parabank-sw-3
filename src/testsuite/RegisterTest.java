package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;
//1.verifyThatSigningUpPageDisplay
//* click on the ‘Register’ link
//* Verify the text ‘Signing up is easy!’
public class RegisterTest extends Utility {
    String baseurl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void test1()  {
        clickOnElement(By.xpath( "//*[@id=\"loginPanel\"]/p[2]/a" ));
//        String actualMessage = getTextFromElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a,' Register')]"));
//        String expectedMessage = "Signing up is easy!";
//        Assert.assertEquals("verifying Signing ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        clickOnElement(By.xpath( "//*[@id=\"loginPanel\"]/p[2]/a" ));
        sendTextToElement(By.id("customer.firstName"), "Hitesh");
        sendTextToElement(By.id("customer.lastName"), "Patel");
        sendTextToElement(By.id("customer.address.street"), "walmart");
        sendKeysToElement(By.id("customer.address.city"), "Salford");
        sendKeysToElement(By.id("customer.address.state"), "Lancashire");
        sendKeysToElement(By.id("customer.address.zipCode"), "MA27ND");
        sendKeysToElement(By.id("customer.phoneNumber"), "7575757575");
        sendKeysToElement(By.id("customer.ssn"), "987654");
        sendTextToElement(By.id("customer.username"), "HP@gmail.com");
        sendTextToElement(By.id("customer.password"), "Sp1234");
        sendTextToElement(By.id("repeatedPassword"), "Sp1234");
        clickOnElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
//        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),' //Classname')]"));
//        String expectedMessage = "Your account was created successfully. You are now logged in.";
//        Assert.assertEquals("Your account was created successfully. You are now logged in.", expectedMessage, actualMessage);
    }
}


