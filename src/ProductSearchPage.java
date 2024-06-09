import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage {
    // Locate the search field using its ID.
    @FindBy(id = "autoComplete")
    private WebElement searchField;

    // Locate the search button using its ID.
    @FindBy(id = "menuSearch")
    private WebElement searchButton;

    // Locate the submit search button using its ID (same ID as search button, check if correct or if there should be two elements).
    @FindBy(id = "menuSearch")
    private WebElement submitSearchButton;

    // Constructor to initialize WebDriver and PageFactory.
    public ProductSearchPage(WebDriver driver) {
        // Initialize WebElements defined with @FindBy annotations.
        PageFactory.initElements(driver, this);
    }

    // Method to click the search button.
    public void clickSearchButton() {
        searchButton.click();
    }
   
    // Method to enter the search query in the search field.
    public void enterSearchQuery(String query) {
        searchField.sendKeys(query);
    }

    // Method to click the submit search button.
    public void submitSearchButton() {
        submitSearchButton.click();
    }
}
