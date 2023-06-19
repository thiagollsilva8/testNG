package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class dataDrivenTesting {

/*
Test Scenario:
1. navigate to syntax HRMS
2. login into the website using the following credentials and check for correct errors
3. a.username ="Admin"  , password="12345"  ---> Error Message ="Invalid credentials"
4. b.username= "ABCD"   , password ="Hum@nhrm123" -->Error Message ="Invalid credentials"
5. c.username= ""   ,   password ="Hum@nhrm123"   -->Error Message ="Username cannot be empty"
6. d.username= "Admin" ,password= ""  -->Error Message= "Password cannot be empty"
 */

    @DataProvider(name = "invalidCredentials")
    public Object[][] data() {
        Object[][] loginData = {
                {"Admin", "12345", "Invalid credentials"},
                {"ABCD", "Hum@nhrm123", "Invalid credentials"},
                {"Admin", "", "Password cannot be empty"},
                {"", "Hum@nhrm123", "Username cannot be empty"}
        };
        return loginData;
    }

    public static WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test(dataProvider = "invalidCredentials")
    public void loginWithInvalidCredentials(String user, String password, String expectMsg) {

        // finding the username text box
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

        // send username
        username.sendKeys(user);

        // finding the password field
        WebElement pswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));

        // send password
        pswrd.sendKeys(password);

        // finding the element login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        // click the login
        loginBtn.click();

        // get the element message invalid credentials
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));

        // extract the error message
        String actualMsg = errorMsg.getText();

        // Assert
        Assert.assertEquals(actualMsg, expectMsg);

    }
}
