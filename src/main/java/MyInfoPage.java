import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage extends BasePage{

    @FindBy(name= "firstName")
    WebElement firstName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
    WebElement date;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
    WebElement saveButton;

    public  MyInfoPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void EnterName (String name){
        firstName.sendKeys(name);
    }
    public void DateInput(String dateOf){
        date.sendKeys(dateOf);

    }
    public void Save(){
        saveButton.submit();
    }
}

