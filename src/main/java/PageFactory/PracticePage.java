package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
    //constructor
    public PracticePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    WebDriver driver;

    @FindBy(how = How.ID, using = "bmwradio")
    public static WebElement bmwRadio;

    @FindBy(how = How.ID, using = "carselect")
    public static WebElement dropDn;

    @FindBy(how = How.ID, using = "multiple-select-example")
    public static WebElement multiSel;

    @FindBy(how = How.ID, using = "benzcheck")
    public static WebElement checkBox;

    @FindBy(how = How.ID, using = "enter-name")
    public static WebElement enterNm;

    @FindBy(how = How.ID, using = "alertBtn")
    public static WebElement alertbtn;


}
