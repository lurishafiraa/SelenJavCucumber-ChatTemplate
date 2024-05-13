package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static utilities.BrowserDriver.driver;

public class LoginPage {

    public static String input_username = "sign_in_text_input_email";
    public static String input_password = "sign_in_text_input_password";
    public static String button_login = "sign_in_button_sign_in";

    public static void access_login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qonek-uat.web.app/");
        Thread.sleep(2000);

        driver.findElement(By.id(input_username)).sendKeys("autotest@gmail.com");
        driver.findElement(By.id(input_password)).sendKeys("DevPassword401!");
        driver.findElement(By.id(button_login)).click();
        Thread.sleep(2000);
    }

}
