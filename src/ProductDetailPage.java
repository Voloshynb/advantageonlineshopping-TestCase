import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    // Locate the search field using its ID.
    @FindBy(id = "autoComplete")
    private WebElement searchField;

    // Locate the search button using its ID.
    @FindBy(id = "menuSearch")
    private WebElement searchButton;

    // Locate the submit search button using its ID (same ID as search button, check if correct or if there should be two elements).
    @FindBy(id = "menuSearch")
    private WebElement submitSearchButton;

    // Locate the product using its XPath.
    @FindBy(xpath  = "//*[@id=\"7\"]")
    private WebElement product;

    // Locate the button to increase the quantity of the product using its XPath.
    @FindBy(xpath = "//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]")
    private WebElement increaseQuantityButton;

    // Locate the button to add the product to the cart using its XPath.
    @FindBy(xpath = "//*[@id=\"productProperties\"]/div[4]/button")
    private WebElement addToCartButton;

    // Constructor to initialize WebDriver and PageFactory.
    public ProductDetailPage(WebDriver driver) {
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

    // Method to select the product.
    public void product() {
        product.click();
    }

    // Method to increase the quantity of the selected product.
    public void increaseQuantity() {
        increaseQuantityButton.click();
    }

    // Method to click the add to cart button.
    public void clickAddToCartButton() {
        addToCartButton.click();
    }
}
