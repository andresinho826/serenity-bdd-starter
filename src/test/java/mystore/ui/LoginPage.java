package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    /*
    NOTA: We need to create previously an account with our user to get login
     */
    public static final Target EMAIL = Target.the("Email input")
            .located(By.cssSelector("[data-qa='login-email']"));
    public static final Target PASSWORD = Target.the("Password input")
            .located(By.cssSelector("[data-qa='login-password']"));
    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button")
            .located(By.cssSelector("[data-qa='login-button']"));

}
