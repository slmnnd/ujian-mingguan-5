package com.juaracoding;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PeCheckoutTest {
    //checkout valid
    @Given("user make sure products in Cart")
    public void user_make_sure_products_in_Cart(){

    }

    @When("user click checkout button")
    public void user_click_checkout_button(){

    }

    @And("user fill the form")
    public void user_fill_the_form(){

    }
    @And("user click continue button")
    public void user_click_continue_button(){

    }
    @Then("user successfully checked out")
    public void user_successfully_checked_out(){

    }

    //checkout invalid without fill the form
    @Given("user open Cart page")
    public void user_open_Cart_page(){

    }
    @Then("user unsuccessfully checked out")
    public void user_unsuccessfully_checked_out(){

    }

}
