package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M02_SeleniumWebDriver {

    public static void main(String[] args) {

        // 1. Instantiating the WebDriver interface via Upcasting
        // This launches a new, clean instance of the Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // 2. WebDriver Method: get() - Navigates to a specific URL
            System.out.println("Navigating to Wikipedia...");
            driver.get("https://www.wikipedia.org/");

            // 3. WebDriver Method: getTitle() - Fetches the current page title
            String pageTitle = driver.getTitle();
            System.out.println("The page title is: " + pageTitle);

            // Basic validation
            if (pageTitle.contains("Wikipedia")) {
                System.out.println("Success: Title validation passed.");
            } else {
                System.out.println("Failure: Title does not match.");
            }

        } finally {
            // 4. WebDriver Method: quit() - Closes all browser windows and safely ends the WebDriver session
            // We use a try/finally block to ensure the browser always closes, even if an error occurs!
            System.out.println("Closing the browser session...");
            driver.quit();
        }
    }
}
