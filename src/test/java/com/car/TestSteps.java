package com.car;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class TestSteps extends TestCase{
	
	String actionButton;
	
	EmployeeService service = new EmployeeService();
	
	EmployeeBean bean = new EmployeeBean();
	
	

	@Given("^employee \"([^\"]*)\" enter details like \"([^\"]*)\" as srouce, \"([^\"]*)\" as destination and the time is \"([^\"]*)\"$")
	public void employee_enter_details_like_as_srouce_as_destination_and_the_time_is(String name, String source,
			String destination, String time) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//bean = new EmployeeBean();
		bean.setName(name);
		bean.setSource(source);
		bean.setDestination(destination);
		bean.setTime(time);
		
		//throw new PendingException();
		
		
	}

	@Given("^his email is \"([^\"]*)\" and phone is \"([^\"]*)\"$")
	public void his_email_is_and_phone_is(String emailAddress, String phoneNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		bean.setEmailAddress(emailAddress);
		bean.setPhoneNumber(phoneNumber);
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String actionButton) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		this.actionButton = actionButton; 
	}

	@Then("^data get saved and message \"([^\"]*)\" get displayed with \"([^\"]*)\" button$")
	public void data_get_saved_and_message_get_displayed_with_button(String message, String buttonName) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		
		assertEquals(message, service.shareCab(bean));
		
	}

	@Then("^clicking on \"([^\"]*)\" will take him to \"([^\"]*)\" page$")
	public void clicking_on_will_take_him_to_page(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

}
