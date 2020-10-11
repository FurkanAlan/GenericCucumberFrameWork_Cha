package stepDefs;

import PageFactory.HomePage;
import PageFactory.PracticePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    WebDriver driver;


    @Before
    public void setup() {


    }


    @After
    public void tearDown() {
        driver.quit();
    }
}

