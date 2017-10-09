package com.students.tests;
import org.testng.annotations.Test;

import com.jayway.restassured.config.RestAssuredConfig;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 

public class StudentGetTests 
{
 
	@Test
	public void GetWeatherDetails()
	{   
		// Specify the base URL to the RESTful web service
		RestAssuredConfig.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
 
		
		RequestSpecification httpRequest = RestAssured.given();
 

		Response response = httpRequest.request(Method.GET, "/Hyderabad");
 
	
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
 
	}
 
}

