Feature: To have a working CRUD RestAssured Application
  As a user
  I want to Create a hotel, remove a hotel and then update a hotel


Scenario: Add a hotel using the post request
  Given that the hotel details are provided
  When hotel details are entered into the json object 
  Then the response should return valid status code