package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonStepDefs {


    WebDriver driver;

    //constructor
    public CommonStepDefs(WebDriver driver) {
        this.driver = driver;
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




}
