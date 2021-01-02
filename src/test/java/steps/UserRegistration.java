package steps;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class UserRegistration extends TestBase {

	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	
	@Given("user in the home page")
	public void user_in_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	

	@When("^I click on register link$")
	public void i_click_on_register_link()  {
		registerObject = new UserRegistrationPage(driver);
	}

	/*@When("^I entered the user data$")
	public void i_entered_the_user_data()  {
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration("Moataz", "Nabil", "moataz@test.com", "12345678");
	}*/

	@When("I entered \"<firstname>\" , \"<lastname>\" , \"<email>\" , \"<password>\"")
	public void i_entered(String firstname, String lastname, String email, String password) {
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(firstname, lastname,email,password);
	}

	@Then("^The registration page displayed successfully$")
	public void the_registration_page_displayed_successfully()  {
		registerObject.userLogout();
	}
}
