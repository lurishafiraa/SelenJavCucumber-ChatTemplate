package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static pages.AddChatTemplatePage.*;
import static pages.LoginPage.access_login;
import static utilities.BrowserDriver.driver;

public class AddChatTemplateStep {

    @Given("User can login using valid credentials")
    public void user_can_login_using_valid_credentials() throws InterruptedException {
        access_login();
    }
    @Given("User can access Chat Template page")
    public void user_can_access_chat_template_page() throws InterruptedException {
        access_chat_template_menu();
    }
    @When("User click button Create New Template")
    public void user_click_button_create_new_template() {
        driver.findElement(By.xpath(create_new_template_xpath)).click();
    }
    @When("input template name")
    public void input_template_name() {
        driver.findElement(By.id(form_template_name)).sendKeys("Promo produk");
    }
    @When("User input text of bubble chat 1")
    public void user_input_text_of_bubble_chat_1() {
        driver.findElement(By.xpath(bubble_chat_1)).sendKeys("Promo produk terbaru tahun ini");
    }
    @When("User click button Add Bubble Chat")
    public void user_click_button_add_bubble_chat() {
        driver.findElement(By.id(add_new_bubble_chat)).click();
    }
    @When("User click icon attachment")
    public void user_click_icon_attachment() throws InterruptedException {
        driver.findElement(By.id(attach_bubble_chat_2)).click();
        driver.findElement(By.id(attach_image_bubble2)).click();
        //choose image
        Thread.sleep(20000);
    }
    @When("User input text of bubble chat 2")
    public void user_input_text_of_bubble_chat_2() {
        driver.findElement(By.xpath(bubble_chat_2)).sendKeys("Produk 1, potongan harga 20ribu");
    }
    @When("User replace the default template hotkey")
    public void user_replace_the_default_template_hotkey() {
        driver.findElement(By.xpath(clear_default_hotkey)).clear();
        driver.findElement(By.xpath(clear_default_hotkey)).sendKeys("Promo2024");
    }
    @When("User click button Create Template")
    public void user_click_button_create_template() {
        driver.findElement(By.id(save_new_template)).click();
    }
    @Then("The new template success added")
    public void the_new_template_success_added() throws InterruptedException {
        access_chat_template_menu();
    }

}
