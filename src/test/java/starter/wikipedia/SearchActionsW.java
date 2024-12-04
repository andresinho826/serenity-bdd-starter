package starter.wikipedia;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchActionsW extends UIInteractions {
    @Step("Search for '{0}'")
    public void byKeyword(String keyword){
        $("input#searchInput").sendKeys(keyword, Keys.ENTER);
    }
}
