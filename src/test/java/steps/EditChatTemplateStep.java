package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static pages.ActionEditTemplatePage.icon_edit_template;
import static pages.ActionEditTemplatePage.save_updated_template;
import static pages.AddChatTemplatePage.access_chat_template_menu;
import static pages.EditBubbleChatPage.update_bubble_chat;
import static pages.EditNameAndHotkeyPage.update_template_hotkey;
import static pages.EditNameAndHotkeyPage.update_template_name;
import static utilities.BrowserDriver.driver;

public class EditChatTemplateStep {
    @Given("User has created chat template")
    public void user_has_created_chat_template() {
        access_chat_template_menu();
    }
    @When("User click icon edit")
    public void user_click_icon_edit() {
        driver.findElement(By.id(icon_edit_template)).click();
    }
    @When("User edit the form of template name")
    public void user_edit_the_form_of_template_name() {
        driver.findElement(By.id(update_template_name)).clear();
        driver.findElement(By.id(update_template_name)).sendKeys("Promo produk baru spencers");
    }
    @When("User edit the form of bubble chat {int}")
    public void user_edit_the_form_of_bubble_chat(Integer int1) {
        driver.findElement(By.xpath(update_bubble_chat)).clear();
        driver.findElement(By.xpath(update_bubble_chat)).sendKeys("Promo produk spencers tahun ini");
    }
    @When("User edit the form of hotkey")
    public void user_edit_the_form_of_hotkey() {
        driver.findElement(By.id(update_template_hotkey)).clear();
        driver.findElement(By.id(update_template_hotkey)).sendKeys("PromoSpencers2024");
    }
    @When("User click button Save Template")
    public void user_click_button_save_template() {
        driver.findElement(By.id(save_updated_template)).click();
    }
    @Then("The pop-up was closed")
    public void the_pop_up_was_closed() {
        access_chat_template_menu();
    }
}
