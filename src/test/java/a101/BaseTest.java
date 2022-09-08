package a101;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@TestInstance(TestInstance.Lifecycle.PER_METHOD)

public class BaseTest {

    protected static WebDriver driver;
    static A101Practicum a101Practicum;

    @BeforeAll
    public static void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr/");
        a101Practicum = new A101Practicum(driver);
        a101Practicum._println("TEST Basladi.");
        a101Practicum._println("Anasayfa acildi.");
    }

    @AfterAll
    public static void close(){
        driver.quit();
        a101Practicum._println("TEST Bitti.");
    }
    
}
