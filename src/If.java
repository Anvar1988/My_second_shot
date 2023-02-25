import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class If {
    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // Bring the driver
        driver.get("https://the-internet.herokuapp.com/"); // driver has methods 1 of them is .get it wil navigate to given url

        /*WebElement checkboxlink = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        Thread.sleep(2000);
        checkboxlink.click();
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
        Thread.sleep(2000);

        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
        Thread.sleep(2000);



        checkbox1.click();
        Thread.sleep(2000);
        checkbox2.click();
        Thread.sleep(2000);
        Select sel = new Select(checkbox1);
        sel.deselectByValue(String.valueOf(checkbox1));
*/
        WebElement ddown = driver.findElement(By.xpath("//a[@href='/dropdown']"));
        Thread.sleep(1500);
        ddown.click();

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        Thread.sleep(1500);

        dropdown.selectByIndex(1);
        Thread.sleep(2000);


        driver.quit();







        //WebElement value1 = driver.findElement(By.xpath("//option[@value='1']"));



        //driver.quit();







    }
}
