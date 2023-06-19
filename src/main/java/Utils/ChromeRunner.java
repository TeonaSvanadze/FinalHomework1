package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ChromeRunner {
   public static WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void openChrome(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://postalon.com/");
    }
    @AfterMethod
    public void closeChrome(){
        driver.close();
    }
}
