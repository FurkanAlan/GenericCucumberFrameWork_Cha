import PageFactory.PracticePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://letskodeit.teachable.com/p/practice");

        PracticePage practicePage = new PracticePage(driver);

        
        WebElement webElement = driver.findElement(By.id("bmwradio"));
        webElement.click();

        WebElement drpDown = driver.findElement(By.id("carselect"));
        Select sel = new Select(drpDown);
        sel.selectByValue("honda");

        WebElement multiSel = driver.findElement(By.id("multiple-select-example"));
        Select sel2 = new Select(multiSel);
        sel2.selectByValue("apple");
        sel2.selectByValue("peach");

        WebElement benzCheck = driver.findElement(By.id("benzcheck"));
        benzCheck.click();

        WebElement enterNm = driver.findElement(By.name("enter-name"));
        enterNm.sendKeys("alan");

        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        alertBtn.click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
        String actText = "Hello alan, share this practice page and share your knowledge";

//        if (alertText=){}

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
