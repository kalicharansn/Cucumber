package integrationTest;

import cucumber.api.java.en.*;

public class IntegrationTest1 {

	@Given("^user opens firefox browser and enters url$")
	public void user_opens_firefox_browser_and_enters_url() throws Throwable {

		System.out.println("firefox in launched");

	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {

		System.out.println(arg1);
		System.out.println(arg2);

	}

	@Then("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {

		System.out.println("login button clicked");

	}

	@Then("^User navigated in home page$")
	public void user_navigated_in_home_page() throws Throwable {

		System.out.println("home page..............");

	}
}
