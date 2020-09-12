package stepDefs;

import PageFactory.PracticePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericStepDef {
    WebDriver driver;
    PracticePage practicePage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        practicePage = new PracticePage(driver);

    }

    @Given("^I wait (\\w+) milliseconds$")
    public void i_wait_for(long waitTime) {
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //^$ start and end step
    //"([^"]*)"  string icin kullanilan ifade
    @Given("^I navigate to \"([^\"]*)\" url$")
    public void i_navigate_to_url(String string) {
        driver.get(string);
        System.out.println("The window title: " + driver.getTitle());
    }

    @When("^I click on Practice$")
    public void i_click_on_Practice() {
        practicePage.clickPractice();
    }


    @Then("I select BMW radio button")
    public void i_select_BMW_radio_button() {
        practicePage.selectRaido();
    }

    @Then("^I select (\\w+) from dropdown$")
    public void i_select_Honda_from_dropdown(String carType) {
        practicePage.selectDropDown(carType);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

