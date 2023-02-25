import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAZ {
        public static void main(String[] args) {

                System.setProperty("webDriver.chrome.driver", "/Users/anvaryesmagambetov/Desktop/Selenium/chromedriver_mac_arm64");

                WebDriver driver = new ChromeDriver();

                driver.get("http://www.google.com");
                driver.quit();

        }
}


