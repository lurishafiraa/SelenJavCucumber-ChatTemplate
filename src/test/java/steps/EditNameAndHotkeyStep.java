package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static pages.AddChatTemplatePage.access_chat_template_menu;
import static pages.EditNameAndHotkeyPage.update_template_hotkey;
import static pages.EditNameAndHotkeyPage.update_template_name;
import static pages.LoadExistingTemplatePage.*;
import static utilities.BrowserDriver.driver;

public class EditNameAndHotkeyStep {
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
    @When("User edit the form of template name")
    public void user_edit_the_form_of_template_name() {
        driver.findElement(By.id(update_template_name)).clear();
        driver.findElement(By.id(update_template_name)).sendKeys("Promo baru 2024");
    }
    @When("User edit the form of hotkey")
    public void user_edit_the_form_of_hotkey() {
        driver.findElement(By.id(update_template_hotkey)).clear();
        driver.findElement(By.id(update_template_hotkey)).sendKeys("Promobaru2024");
    }
    @Then("The pop-up was closed")
    public void the_pop_up_was_closed() {
        access_chat_template_menu();
    }
}
