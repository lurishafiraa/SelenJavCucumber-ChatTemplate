package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static pages.AddChatTemplatePage.access_chat_template_menu;
import static pages.EditBubbleChatPage.save_updated_template;
import static pages.EditBubbleChatPage.update_bubble_chat;
import static pages.LoadExistingTemplatePage.*;
import static utilities.BrowserDriver.driver;

public class LoadExistingTemplateStep {
    @Given("User has created chat template")
    public void user_has_created_chat_template() {
        access_chat_template_menu();
    }
    @When("User click button New Template")
    public void user_click_button_new_template() {
        driver.findElement(By.id(new_template_button)).click();
    }
    @When("User click button Load Existing")
    public void user_click_button_load_existing() throws InterruptedException {
        driver.findElement(By.id(load_existing_button)).click();
        Thread.sleep(2000);
    }
    @When("User click existing template option")
    public void user_click_existing_template_option() throws InterruptedException {
        driver.findElement(By.xpath(load_existing_template)).click();
        Thread.sleep(2000);
    }
    @When("User edit the form bubble chat {int}")
    public void user_edit_the_form_bubble_chat(Integer int1) {
        driver.findElement(By.xpath(update_bubble_chat)).clear();
        driver.findElement(By.xpath(update_bubble_chat)).sendKeys("Promo terbaru tahun 2024");

    }
    @When("User click button Edit Template")
    public void user_click_button_edit_template() {
        driver.findElement(By.id(save_updated_template)).click();
    }
    @Then("The pop-up was closed")
    public void the_pop_up_was_closed() {
        access_chat_template_menu();
    }
}
