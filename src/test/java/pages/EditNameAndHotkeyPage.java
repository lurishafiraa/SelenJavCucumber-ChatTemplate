package pages;

import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;

public class EditNameAndHotkeyPage extends LoadExistingTemplatePage {

    public static String update_template_name = "addnewtemplatechat_textinput_templatename";
    public static String update_template_hotkey = "inputlabel_textinput_hotkey";
    public static String save_updated_template = "addnewtemplate_buble_btn_createtemplate";

    public static void update_existing_name_hotkey() throws InterruptedException {
        driver.findElement(By.id(new_template_button)).click();
        driver.findElement(By.id(load_existing_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(load_existing_template)).click();
        Thread.sleep(2000);
        driver.findElement(By.id(update_template_name)).clear();
        driver.findElement(By.id(update_template_name)).sendKeys("Promo baru 2024");
        driver.findElement(By.id(update_template_hotkey)).clear();
        driver.findElement(By.id(update_template_hotkey)).sendKeys("Promobaru2024");
        driver.findElement(By.id(save_updated_template)).click();

    }
}