package demo;

import java.time.Duration;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;  // WebDriverManager import
import org.openqa.selenium.WebDriver;  // WebDriver import
import org.openqa.selenium.chrome.ChromeDriver;  // ChromeDriver import

public class DemoPagination {

    WebDriver driver;

    @Before
    public void setUp() {
        // Set up WebDriverManager for ChromeDriver
        WebDriverManager.chromedriver().setup();
        
        // Initialize WebDriver
        driver = new ChromeDriver();
        
        // Maximize window
        driver.manage().window().maximize();
    }

    @Test
    public void Pagination() {
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the demo site
        driver.get("https://demo3x.opencartreports.com/admin/");
        
        // Additional test steps can go here...
    }

    
    @Test
    public void Pagination1() {
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the demo site
        driver.get("https://demo3x.opencartreports.com/admin/");
        
        // Additional test steps can go here...
    }
    @After
    public void tearDown() {
        // Close the browser after the test completes
        if (driver != null) {
            driver.quit();
        }
    }
}

