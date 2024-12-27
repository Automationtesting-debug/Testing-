package apiAutomation;

import io.restassured.RestAssured;
import static io.restassured.RestAssured .*;
import static org.hamcrest.Matchers .*;
public class PostAPI {
	public static void main(String[] args) {
	
		// given -all input details
		//when- submit API>>recourse and http method
		//then -validate the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
       given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
	       .body("{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Trisha house\",\r\n"
			+ "  \"phone_number\": \"(+91) 9657409143\",\r\n"
			+ "  \"address\": \"1504, Sentosa Pride, Punawale 09\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"English\"\r\n"
			+ "}")
	.when().post("maps/api/place/add/json")
	.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
	       .header("Server","Apache/2.4.52 (Ubuntu)");
	}
}    
