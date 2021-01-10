package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.config.DriverManagerType.FIREFOX;

public class BaseTest {

    public static WebDriver driver;
    String baseUrl = "https://www.teachaway.com/";
    public WebDriverWait pageWait;
    public String browser = "chrome";

    @BeforeMethod
    public void launchBrowser() throws MalformedURLException {

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.getInstance(CHROME).setup();
            ChromeOptions options = new ChromeOptions();
            // uncomment the line below to run the driver in background
            // options.addArguments("--headless","enable-automation", "--silent", "--ignore-certificate-errors", "--disable-dev-shm-usage", "--disable-gpu");
            this.driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.getInstance(FIREFOX).setup();
            FirefoxOptions options = new FirefoxOptions();
            // uncomment the line below to run the driver in background
            //options.addArguments("--headless", "enable-automation", "--silent", "--ignore-certificate-errors", "--disable-dev-shm-usage", "--disable-gpu");
            this.driver = new FirefoxDriver(options);
        }
        pageWait = new WebDriverWait(this.driver, 30);
        driver.manage().window().maximize();
        driver.get(baseUrl);


    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
