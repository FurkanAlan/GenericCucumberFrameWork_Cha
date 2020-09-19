package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//    WebDriver homePageDriver;

    public HomePage(WebDriver driver) {
//        homePageDriver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//img[@alt=\"Let's Kode It\"]")
    public static WebElement homeImg;

    //a[@href='/pages/practice']
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Practice')]")
    public static WebElement practiceBtn;

    @FindBy(how = How.XPATH, using = "//a[@href='/sign_in']")
    public static WebElement enrolNow;

    public void clickPractice(){
        practiceBtn.click();
    }


    public void validateHomeScr(String expSrc){
        String actualSrc = homeImg.getAttribute("src");
        assert(actualSrc.equals(expSrc));
//https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=height:120/https://www.filepicker
// .io/api/file/WSundQ6BT6u2OZe2kcNA 2x
    }

    public void isEnrollNowDisplayed(){
        enrolNow.isDisplayed();
    }
}
