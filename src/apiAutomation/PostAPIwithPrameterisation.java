package apiAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PostAPIwithPrameterisation {
	
	@Test(dataProvider="BooksData")

	public void PostAPI(String bookname,String id) {

		RestAssured.baseURI="http://216.10.245.166";

		String  responce=
        given().header("Content-Type","application/json")
		       .body(Payload.AddBook(bookname,id))
        .when().post("/Library/Addbook.php")
        .then().assertThat().statusCode(200)
		       .extract().response().asString();
		JsonPath js=new JsonPath(responce);
		   String bookid=js.get("ID");
		   System.out.println(bookid);
		   
	}
@DataProvider(name="BooksData")
public Object[][] getData() {	
return 	new Object[][] {{"rsg","123"},{"rss","345"},{"tss","101"},{"sas","143"}};
}
}
