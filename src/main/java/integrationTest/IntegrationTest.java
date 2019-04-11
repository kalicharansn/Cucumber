package integrationTest;

import cucumber.api.java.en.*;

public class IntegrationTest {
	
	@Given("^user opens chrome browser and enters url$")
	public void user_opens_chrome_browser_and_enters_url() throws Throwable {

		System.out.println("URL entered is a valid one");
		
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		
		System.out.println(username+password);
		System.out.println(password+username);

	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {

		System.out.println("login button clicked");

	}

	@Then("^User lands in home page$")
	public void user_lands_in_home_page() throws Throwable {

		System.out.println("landed in home page ");
	}


}
