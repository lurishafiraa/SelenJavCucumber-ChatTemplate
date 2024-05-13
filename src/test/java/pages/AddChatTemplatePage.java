package pages;

import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;


public class AddChatTemplatePage {

    public static String chat_template_menu = "pointer NavigationMenu_MenuItem NavMenuActive";
    public static String no_template_page_xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]";
    public static String create_new_template_xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[3]/button/p";
    public static String popup_new_template_xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]";
    public static String form_template_name = "addnewtemplatechat_textinput_templatename";
    public static String bubble_chat_1 = "//*[@id=\"bublechat_reusable_quillinput_addnewtemplate_buble_btn_1\"]/div/div[1]/div";
    public static String add_new_bubble_chat = "addnewtemplate_buble_btn_addbublechat";
    public static String attach_bubble_chat_2 = "bublechat_reusable_quilltoolbar_selectfile_addnewtemplate_buble_btn_3";
    public static String attach_image_bubble2 = "bublechat_reusable_btn_selectimage_addnewtemplate_buble_btn_3";
    public static String bubble_chat_2 = "//*[@id=\"bublechat_reusable_quillinput_addnewtemplate_buble_btn_3\"]/div/div[1]";
    public static String clear_default_hotkey = "//*[@id=\"inputlabel_textinput_hotkey\"]";
    public static String save_new_template = "addnewtemplate_buble_btn_createtemplate";


    public static void access_chat_template_menu() {
        driver.findElement(By.className(chat_template_menu)).click();
    }

    public static void validation_no_template_page() {
        driver.findElement(By.xpath(no_template_page_xpath)).isDisplayed();
    }

    public static void popup_new_template() throws InterruptedException {
        driver.findElement(By.xpath(popup_new_template_xpath)).isDisplayed();
        Thread.sleep(2000);
    }

    public static void create_new_template() throws InterruptedException {
        driver.findElement(By.xpath(create_new_template_xpath)).click();
        driver.findElement(By.id(form_template_name)).sendKeys("Promo produk");
        driver.findElement(By.xpath(bubble_chat_1)).sendKeys("Promo produk terbaru tahun ini");
        driver.findElement(By.id(add_new_bubble_chat)).click();
        driver.findElement(By.id(attach_bubble_chat_2)).click();
        driver.findElement(By.id(attach_image_bubble2)).click();
        //choose image
        Thread.sleep(20000);
        driver.findElement(By.xpath(bubble_chat_2)).sendKeys("Produk 1, potongan harga 20ribu");
        driver.findElement(By.xpath(clear_default_hotkey)).clear();
        driver.findElement(By.xpath(clear_default_hotkey)).sendKeys("Promo2024");
        driver.findElement(By.id(save_new_template)).click();

    }

}
