package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),\"Log In to Let's Kode It\")]")
    public static WebElement signUpHeader;

    @FindBy(how = How.ID, using = "user_name")
    public static WebElement userName;

    @FindBy(how = How.ID, using = "user_email")
    public static WebElement userEmail;

    @FindBy(how = How.ID, using = "user_password")
    public static WebElement userPwd;


    @FindBy(how = How.XPATH, using = "//input[@id='user_password_confirmation']")
    public static WebElement confirmPwd;

    @FindBy(how = How.ID, using = "user_unsubscribe_from_marketing_emails")
    public static WebElement agreeMarketing;

    @FindBy(how = How.ID, using = "user_agreed_to_terms")
    public static WebElement agreeTerms;

    @FindBy(how = How.NAME, using = "commit")
    public static WebElement signUp;

    public void validateHeader() {
        if (signUpHeader.isDisplayed()) {
            System.out.println("Header Displayed");
        } else {
            System.out.println("Sign up not displayed");
            try {
                throw new Exception("Sign up not displayed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void enterUserName(String userNm) {
        userName.sendKeys(userNm);
    }

    public void enterUserEmail(String userEml) {
        userEmail.sendKeys(userEml);
    }

    public void enterUserPass(String userPass) {
        userPwd.sendKeys(userPass);
    }

    public void enterConfirmPass(String confirmPass) {
        confirmPwd.sendKeys(confirmPass);
    }

    public void agreeAll() {
        agreeMarketing.click();
        agreeTerms.click();
    }

    public void verifySignUp(boolean enabled) {
        if (signUp.isEnabled() == enabled) {
            System.out.println("Sign up button is:" + enabled);
        } else {
            System.out.println("Sign up not displayed");
            try {
                throw new Exception("Sign up not displayed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
