package starter.wikipedia;

import net.serenitybdd.core.pages.PageComponent;

public class SearchResultObteined extends PageComponent {
    public String getTitle(){
        return $("").getText();
    }
}
