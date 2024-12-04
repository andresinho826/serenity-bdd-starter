package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target SECTION_PRODUCTS = Target.the("Product sections in main page")
            .located(By.cssSelector("a[href='/products']"));
    public static final Target SECTION_LOGIN = Target.the("Login sections in main page")
            .located(By.cssSelector("a[href='/login']"));
}
