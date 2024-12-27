package apiAutomation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static  io.restassured.RestAssured .*;

public class LibraryAPI {
	
	
@Test
public void PostAPI() {


	RestAssured.baseURI="http://216.10.245.166";
	String  responce=given().
	header("Content-Type","application/json").
	body(Payload.AddBook("abcd","1234")).
	when().
	post("/Library/Addbook.php").
	then().assertThat().statusCode(200).
	extract().response().asString();
	JsonPath js=new JsonPath(responce);
     String id=js.get("ID");
	   System.out.println(id);
	   //deleteBOok


	}




}









