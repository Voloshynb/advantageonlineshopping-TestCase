import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set the system property for the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver",  
        "~\\documents\\For-Testing\\chromedriver\\chromedriver");

        // Initialize a new instance of ChromeDriver.
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window.
        driver.manage().window().maximize();

        // Navigate to the Advantage Online Shopping website.
        driver.get("https://www.advantageonlineshopping.com/#/");

        // Instantiate relevant page objects.
        LoginPage loginPage = new LoginPage(driver);
        ProductSearchPage searchPage = new ProductSearchPage(driver);
        ProductDetailPage detailPage = new ProductDetailPage(driver);

        // Execute test case steps.

        // Login Test Page
        loginPage.loginPageAccess(); // Access the login page.
        loginPage.enterUsername("your_username"); // Enter the username.
        try {
            Thread.sleep(2000); // Wait for 2 seconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.enterPassword("your_password"); // Enter the password.
        loginPage.clickLoginButton(); // Click the login button.
        try {
            Thread.sleep(5000); // Wait for 5 seconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://www.advantageonlineshopping.com/#/"); // Reload the homepage.

        // Search for a product.
        searchPage.clickSearchButton(); // Click the search button.
        searchPage.enterSearchQuery("laptop"); // Enter the search query "laptop".
        try {
            Thread.sleep(5000); // Wait for 5 seconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchPage.submitSearchButton(); // Submit the search form.
        
        try {
            Thread.sleep(5000); // Wait for 5 seconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://www.advantageonlineshopping.com/#/"); // Reload the homepage.

        // Select a product and add it to the cart.
        detailPage.clickSearchButton(); // Click the search button again
        detailPage.clickSearchButton(); // Click the search button again
        detailPage.enterSearchQuery("laptop"); // Enter the search query "laptop" again.
        try {
            Thread.sleep(5000); // Wait for 5 seconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        detailPage.submitSearchButton(); // Submit the search form.
        detailPage.product(); // Select the product from the search results.
        detailPage.increaseQuantity(); // Increase the quantity of the product.
        detailPage.clickAddToCartButton(); // Click the button to add the product to the cart.

        // Close the browser.
        driver.quit();
    }
}
