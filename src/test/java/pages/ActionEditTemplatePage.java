package pages;

import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;

public class ActionEditTemplatePage {

    public static String icon_edit_template = "chattemplate_page_btn_edit";
    public static String edit_template_name = "edittemplatechat_textinput_templatename";
    public static String edit_bubble_chat1 = "bublechat_reusable_quillinput_addnewtemplate_buble_btn_0";
    public static String edit_template_hotkey = "inputlabel_textinput_hotkey";
    public static String save_updated_template = "edittemplatechat_btn_savetemplate";

    public static void click_edit_action() {
        driver.findElement(By.id(icon_edit_template)).click();
        driver.findElement(By.id(edit_template_name)).clear();
        driver.findElement(By.id(edit_template_name)).sendKeys("Promo produk baru spencers");
        driver.findElement(By.id(edit_bubble_chat1)).clear();
        driver.findElement(By.id(edit_bubble_chat1)).sendKeys("Promo produk spencers tahun ini");
        driver.findElement(By.id(edit_template_hotkey)).clear();
        driver.findElement(By.id(edit_template_hotkey)).sendKeys("Promospencers2024");
        driver.findElement(By.id(save_updated_template)).click();

    }
}
