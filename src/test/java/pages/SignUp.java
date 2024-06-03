package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static utilities.BrowserDriver.driver;

public class SignUp {

    public static String user_new_xpath = "//*[@id=\"signin2\"]";
    public static String input_username_id = "sign-username";
    public static String input_password_id = "sign-password";
    public static String button_signup_xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";

    public static void user_new_xpath() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/index.html");
        Thread.sleep(2000);



    }


}
