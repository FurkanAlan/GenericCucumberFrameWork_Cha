package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericStepDef {
    //^$ start and end step
    //"([^"]*)"  string icin kullanilan ifade
    @Given("^I navigate to \"([^\"]*)\" url$")
    public void i_navigate_to_url(String string) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(string);
        System.out.println("The window titele: "+driver.getTitle());
    }

    @When("I click on Practice")
    public void i_click_on_Practice() {
    }

    @Then("I select BMW radio button")
    public void i_select_BMW_radio_button() {
    }

    @Then("I select Honda from dropdown")
    public void i_select_Honda_from_dropdown() {
    }
}
