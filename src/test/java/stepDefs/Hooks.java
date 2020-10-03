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
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HomePageStepDefs homePageStepDefs = new HomePageStepDefs(driver);
        CommonStepDefs commonStepDefs = new CommonStepDefs(driver);
        PracticePageStepDefs practicePageStepDefs = new PracticePageStepDefs(driver);

    }




    @After
    public void tearDown() {
        driver.quit();
    }
}

