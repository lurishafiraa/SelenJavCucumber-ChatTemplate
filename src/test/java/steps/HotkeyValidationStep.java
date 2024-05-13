package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static pages.ActionEditTemplatePage.*;
import static pages.AddChatTemplatePage.access_chat_template_menu;
import static pages.EditNameAndHotkeyPage.update_template_hotkey;
import static pages.HotkeyValidationPage.error_hotkey_validation;
import static utilities.BrowserDriver.driver;

public class HotkeyValidationStep {
    @Given("User has created chat template")
    public void user_has_created_chat_template() {
        access_chat_template_menu();
    }
    @When("User click icon edit")
    public void user_click_icon_edit() {
        driver.findElement(By.id(icon_edit_template)).click();
    }
    @When("User edit the form of hotkey")
    public void user_edit_the_form_of_hotkey() {
        driver.findElement(By.id(edit_template_hotkey)).clear();
        driver.findElement(By.id(edit_template_hotkey)).sendKeys("Promospencers2024");

        driver.findElement(By.xpath(error_hotkey_validation)).isDisplayed();
    }
    @When("User click button Save Template")
    public void user_click_button_save_template() {
        driver.findElement(By.id(save_updated_template)).click();
    }
    @Then("Failed to save the updated template")
    public void failed_to_save_the_updated_template() {
        driver.findElement(By.xpath(error_hotkey_validation)).isDisplayed();
    }


}
