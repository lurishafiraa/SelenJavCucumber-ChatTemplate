package pages;

import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;

public class EditBubbleChatPage extends LoadExistingTemplatePage {

    public static String update_bubble_chat = "//*[@id=\"bublechat_reusable_quillinput_addnewtemplate_buble_btn_0\"]/div/div[1]";
    public static String save_updated_template = "addnewtemplate_buble_btn_createtemplate";

    public static void update_existing_bubble_chat() throws InterruptedException {
        driver.findElement(By.id(new_template_button)).click();
        driver.findElement(By.id(load_existing_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(load_existing_template)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(update_bubble_chat)).clear();
        driver.findElement(By.xpath(update_bubble_chat)).sendKeys("Promo terbaru tahun 2024");
        driver.findElement(By.id(save_updated_template)).click();
    }
}
