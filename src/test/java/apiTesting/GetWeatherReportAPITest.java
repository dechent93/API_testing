package apiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetWeatherReportAPITest {
	
	@Test
	public void getSpecificCityWeather() {
		
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city"; //Specifying base URI
		
		RequestSpecification httpRequest = RestAssured.given();	//Request Object
		
		Response response = httpRequest.request(Method.GET, "/Dallas");	//Detailed Response Object
		
		String responseBody = response.getBody().asString();	//print the response in console window
		System.out.println(responseBody);
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(200, statusCode);		
		
		
		
		
	}

}
