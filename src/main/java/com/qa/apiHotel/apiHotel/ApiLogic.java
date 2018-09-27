package com.qa.apiHotel.apiHotel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ApiLogic
{
	public void PostTo()
	{
		// First set the url for the request
		RestAssured.baseURI = Constants.URL;
		
		// Then need to make a request to the url
		RequestSpecification request = RestAssured.given();
		
		// Then need to set up the request and set the data type
		// Set the content type and set it to be json
		request.header("Content-Type","application/json");
		
		// Then need to create a json object to store the data into
		JSONObject jsonobj = new JSONObject();
		
		// Now put random stuff in there
		jsonobj.put("city", "Some City");
		
		
		// Then place the json object into the body
		request.body(jsonobj.toString());
		
		// now to make a response from the request
		Response response = request.post("/");
		
	}
	
	public void Delete()
	{
		// First set the url for the request
		RestAssured.baseURI = Constants.URL;
				
		// Then need to make a request to the url
		RequestSpecification request = RestAssured.given();
				
		// Then need to set up the request and set the data type
		// Set the content type and set it to be json
		request.header("Content-Type","application/json");
				
		// now to make a response from the request
		Response response = request.delete("/2");
		
	}
	
	public void NestedStuff() throws ParseException
	{
		// First set the url for the request
		RestAssured.baseURI = Constants.URL2;
				
		// Then need to make a request to the url
		RequestSpecification request = RestAssured.given();
				
		// Then need to set up the request and set the data type
		// Set the content type and set it to be json
		request.header("Content-Type","application/json");
		request.header("userId", "11111111");
		JSONObject main = new JSONObject();
		
		JSONArray array = new JSONArray();
		JSONObject address = new JSONObject();
		
		main.put("id", 2);
		main.put("firstName", "ASDFAAasas");
		main.put("lastName", "lastname");
		main.put("middleName", "string");
		main.put("dateofbirth", "20154505");
		main.put("gender", "M");
		address.put("id",2);
		address.put("line1", "line1");
		address.put("line2","line2");
		address.put("city", "somecity");
		address.put("state","somestate");
		address.put("zip","somezip");
		array.add(address);
		main.put("addresses",array);
		
		request.body(main.toString());
		
		
		System.out.println(main.toString());
		// now to make a response from the request
		Response response = request.put("");
		JSONParser parser = new JSONParser();
		JSONObject objec = (JSONObject)parser.parse(response.body().asString());
		
		
		
		for (Object key : objec.keySet()) {
	        //based on you key types
	        String keyStr = (String)key;
	        Object keyvalue = objec.get(keyStr);

	        //Print key and value
	        System.out.println("key: "+ keyStr + " value: " + keyvalue);

	        //for nested objects iteration if required
	        if (keyvalue instanceof JSONObject)
	            System.out.println(((JSONObject)keyvalue));

		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}
	public void NestedStuffRead()
	{
		// First set the url for the request
		RestAssured.baseURI = Constants.URL2;
						
		// Then need to make a request to the url
		RequestSpecification request = RestAssured.given();
						
		// Then need to set up the request and set the data type
		// Set the content type and set it to be json
		request.header("Content-Type","application/json");
		Response response = request.get("/");
	}

}
