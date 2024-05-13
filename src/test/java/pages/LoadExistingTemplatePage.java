package pages;

import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;

public class LoadExistingTemplatePage {

    public static String new_template_button = "chattemplate_btn_createnew";
    public static String load_existing_button = "addnewtemplatechat_btn_loadexisting";
    public static String load_existing_template = "//*[@id=\"long-menu\"]/div[3]/ul/li";

    public static void add_existing_template() throws InterruptedException {
        driver.findElement(By.id(new_template_button)).click();
        driver.findElement(By.id(load_existing_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(load_existing_template)).click();
        Thread.sleep(2000);

    }
}
