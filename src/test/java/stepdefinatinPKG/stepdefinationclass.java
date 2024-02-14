package stepdefinatinPKG;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagefile.pageClass;

public class stepdefinationclass {
	
	pageClass p=new pageClass();
	
	@Given("user launch a site URL")
	public void user_launch_a_site_url() {
	 p.user_launch_a_site_url();
	}

	@Then("user enter username")
	public void user_enter_username() {
		p.user_enter_username();
	   
	}

	@Then("user enter password")
	public void user_enter_password() {
	    p.user_enter_password();
	}

	@Then("user clicked on login button")
	public void user_clicked_on_login_button() {
		p.user_clicked_on_login_button();
	    
	}

	@Then("user verify sucessful login")
	public void user_verify_sucessful_login() {
		p.user_verify_sucessful_login();
	    
	}

}
