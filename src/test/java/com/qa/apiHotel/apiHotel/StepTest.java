package com.qa.apiHotel.apiHotel;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepTest 
{
	RequestSpecification request;
	JSONObject jsonobj;
	Response response;
	@Test
	public void RunTest() throws ParseException
	{
		ApiLogic logic = new ApiLogic();
		logic.NestedStuff();
	}
//	@Given("^that the hotel details are provided$")
//	public void that_the_hotel_details_are_provided() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// First set the url for the request
//		RestAssured.baseURI = Constants.URL;
//				
//		// Then need to make a request to the url
//		request = RestAssured.given();
//				
//		// Then need to set up the request and set the data type
//		// Set the content type and set it to be json
//		request.header("Content-Type","application/json");
//	}
//
//	@When("^hotel details are entered into the json object$")
//	public void hotel_details_are_entered_into_the_json_object() throws Throwable {
//		// Then need to create a json object to store the data into
//		jsonobj = new JSONObject();
//				
//		// Now put random stuff in there
//		jsonobj.put("city", "sdasdasdasdasdasdas");
//		jsonobj.put("description", "This is a test of the put method");
//		
//		jsonobj.put("name", "Royal Manchester");
//		jsonobj.put("id", 7);
//		jsonobj.put("rating", 10);
//				
//				
//		
//	}
//
//	@Then("^the response should return valid status code$")
//	public void the_response_should_return_valid_status_code() throws Throwable {
//		//RequestSpecification request = RestAssured.given();
//
//		//request.header("Content-Type", "application/json");
//
//		request.body(jsonobj.toString());
//		Response response = request.put("/7");
//
//		System.out.println(response.getStatusCode());
//		System.out.println(response.asString());
//	}


}
