# Automated Testing with Selenium

This project demonstrates automated testing of a web application using Selenium WebDriver in Java. The application under test is [Advantage Online Shopping](https://www.advantageonlineshopping.com/#/), and the test cases cover login, product search, and product detail functionalities.

## Prerequisites

Before running the tests, ensure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Selenium WebDriver
- ChromeDriver (or other compatible WebDriver for your browser)
  
## Setup

1. Clone this repository to your local machine.
2. Download and install the ChromeDriver (or WebDriver for your preferred browser).
3. Set the system property for the WebDriver executable in the `Main` class. Example:
   ```java
   System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
   ```

## Running the Tests

To run the automated tests:

1. Open the project in your Java IDE.
2. Navigate to the `Main` class.
3. Run the `main` method.
4. The tests will execute sequentially, performing login, product search, and product detail actions.

## Test Cases

The test cases covered in this project are:

1. **Login Test**: Validates the login functionality.
2. **Product Search Test**: Searches for a product and verifies the search results.
3. **Product Detail Test**: Selects a product, increases its quantity, and adds it to the cart.

## Project Structure

The project consists of the following Java files:

- **LoginPage.java**: Contains methods and locators for the login page.
- **Main.java**: Entry point of the program where WebDriver is initialized, and test cases are executed.
- **ProductSearchPage.java**: Contains methods and locators for the product search page.
- **ProductDetailPage.java**: Contains methods and locators for the product detail page.

## Contributors

- [Voloshynb](https://github.com/Voloshynb)

---
