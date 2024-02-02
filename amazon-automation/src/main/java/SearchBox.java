import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("twotabsearchtextbox");
    By submitButton = By.id("nav-search-submit-button");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(submitButton);
    }
}
