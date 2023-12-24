package com.juaracoding;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

public class PeLoginTest {
    //valid login
    @Given("user enter url web")
    public void user_enter_url_web(){

    }

    @When("user enter username")
    public void user_enter_username(){

    }

    @And("user enter password")
    public void user_enter_password(){

    }

    @And("user click login button")
    public void user_click_login_button(){

    }
    @Then("user successfully login redirect to main page")
    public void user_successfully_login_redirect_to_main_page(){

    }

    //login invalid username
    @When("user enter wrong username")
    public void user_enter_wrong_username(){

    }
    @Then("user unsuccessfully login")
    public void user_unsuccessfully_login(){

    }

    //login invalid password
    @And("user enter wrong password")
    public void user_enter_wrong_password(){

    }

}
