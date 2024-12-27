package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured. *;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;





public class PostPutGet {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		//post
		String response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(Payload.addAddress()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.52 (Ubuntu)")
		.extract().response().asString();

		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String PathId=js.getString("place_id");
				System.out.println("PathId="+PathId);;
				
				String newAddress="1505,Wakad pune";
				given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
			    .body("{\r\n"
			    		+ "\"place_id\":\""+PathId+"\",\r\n"
			    		+ "\"address\":\""+newAddress+"\",\r\n"
			    		+ "\"key\":\"qaclick123\"\r\n"
			    		+ "}\r\n"
			    		+ "")
			    .when().put("maps/api/place/update/json")
				.then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));		
				//Get
				String getRespoance=given().log().all().queryParam("key","qaclick123").queryParam( "place_id", PathId)
				.when().get("maps/api/place/get/json")
				.then().assertThat().statusCode(200)
				.extract().response().asString();
				
				JsonPath js1=new JsonPath(getRespoance);
				String updatedaddress=js1.getString("address");
				System.out.println(updatedaddress);
				Assert.assertEquals(newAddress,updatedaddress); 
	}

}
