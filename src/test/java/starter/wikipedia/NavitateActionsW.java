package starter.wikipedia;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavitateActionsW extends UIInteractions {
    @Step("Navigate to the home page Wikipedia")
    public void toTheWikipediaHomePage(){
        openUrl("https://www.wikipedia.org/");
    }
}
