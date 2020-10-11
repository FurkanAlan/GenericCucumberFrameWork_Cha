package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import managers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonStepDefs {



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
        Driver.getDriver().get(string);
        System.out.println("The window title: " + Driver.getDriver().getTitle());
    }




}
