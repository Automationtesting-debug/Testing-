package apiAutomation;




import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class SumPrices {
	@Test
	public static void verify() {
		
		JsonPath js=new JsonPath(Payload.respoance());
		//1. Print No of courses returned by API
		int count=js.getInt("courses.size()");	
		int PurchaseAmount=js.getInt("dashboard.purchaseAmount");
		//6. Verify if Sum of all Course prices matches with PurchaseAmount
		int sum=0;
	for(int i=0;i<count;i++) {
		String Course=js.get("courses.title["+i+"]");
		
		int price=js.getInt("courses.price["+i+"]");
		int noOfCopies=js.getInt("courses.copies["+i+"]");	
		int ammount=price*noOfCopies;
		sum=sum+ammount;
	}
	int SumOfAllCoursePrices =sum;
	System.out.println("Sum of all Course prices ="+SumOfAllCoursePrices);
	Assert.assertEquals(PurchaseAmount, SumOfAllCoursePrices);
		
	}

}
