import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeftMenuPage extends BasePage{

    @FindBy(linkText = "My Info")
    WebElement menulist;


    public LeftMenuPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Meni (){
        menulist.click();
    }
}
