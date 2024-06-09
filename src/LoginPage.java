import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    // Locate the login button on the homepage using its ID.
    @FindBy(id = "menuUser")
    private WebElement loginPageAccess;

    // Locate the username input field using its XPath.
    @FindBy(xpath = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")
    private WebElement usernameInput;

    // Locate the password input field using its XPath.
    @FindBy(xpath = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")
    private WebElement passwordInput;

    // Locate the sign-in button using its ID.
    @FindBy(id = "sign_in_btn")
    private WebElement loginButton;

    // Constructor to initialize WebDriver and PageFactory.
    public LoginPage(WebDriver driver) {
        // Initialize WebElements defined with @FindBy annotations.
        PageFactory.initElements(driver, this);
    }

    // Method to click the login page access button.
    public void loginPageAccess() {
        loginPageAccess.click();
    }

    // Method to enter the username in the username input field.
    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    // Method to enter the password in the password input field.
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    // Method to click the login button.
    public void clickLoginButton() {
        loginButton.click();
    }
}
