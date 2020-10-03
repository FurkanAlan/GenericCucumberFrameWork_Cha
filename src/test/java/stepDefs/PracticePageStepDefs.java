package stepDefs;

import PageFactory.HomePage;
import PageFactory.PracticePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class PracticePageStepDefs {

    PracticePage practicePage;
    WebDriver driver;

    public PracticePageStepDefs(WebDriver driver) {
        this.driver = driver;
    }

    @Then("^I am on practice page$")
    public void home_page(){
        practicePage = new PracticePage(driver);
    }

    @Then("I select BMW radio button")
    public void i_select_BMW_radio_button() {
        practicePage.selectRaido();
    }

    @Then("^I select (\\w+) from dropdown$")
    public void i_select_Honda_from_dropdown(String carType) {
        practicePage.selectDropDown(carType);
    }

}
