package pages;

import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;

public class HotkeyValidationPage extends ActionEditTemplatePage {

    public static  String error_hotkey_validation = "//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[2]/div[1]/div/div/div[1]/div";

    public static void check_hotkey_validation() {
        driver.findElement(By.id(icon_edit_template)).click();
        driver.findElement(By.id(edit_template_hotkey)).clear();
        driver.findElement(By.id(edit_template_hotkey)).sendKeys("Promospencers2024");
        driver.findElement(By.xpath(error_hotkey_validation)).isDisplayed();
        driver.findElement(By.id(save_updated_template)).click();
    }

}
