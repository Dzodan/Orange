import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    ChromeDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void Setup (){
        driver= openBrowser();
        loginPage= new LoginPage(driver);

    }
    @Test
    public void setLoginOnPage() {
        loginPage.Login("Admin", "admin123");
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }
        @Test
        public void noLoginOnPage(){
            loginPage.Login("","");
            Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Test
    public void LoginWithNoValidData() {
        loginPage.Login("admin", "admin");
        Assert.assertEquals(loginPage.error(), "Invalid credentials");

    }


@AfterMethod
public void After(){
    driver.quit();
}
}