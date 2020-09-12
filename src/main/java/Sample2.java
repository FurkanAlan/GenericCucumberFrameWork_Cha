import PageFactory.PracticePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://letskodeit.teachable.com/p/practice");

        PracticePage practicePage = new PracticePage(driver);

        practicePage.selectRaido();
        practicePage.selectDropDown("honda");
        practicePage.multiSelect("apple");
        practicePage.multiSelect("peach");
        practicePage.selectBenz();
        practicePage.enterNm("alan");
        practicePage.clickAlertAndGetAlertText();
        List <WebElement> wes = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th"));
        for(WebElement we : wes){

        }



//
//        Alert alert = driver.switchTo().alert();
//        String alertText = alert.getText();
//        System.out.println(alertText);
//        alert.accept();
//        String actText = "Hello alan, share this practice page and share your knowledge";

//        if (alertText=){}

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }

        driver.quit();
    }
}
