package apiAutomation;

import java.lang.reflect.Array;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class ComplexNestedResponce {
	public static void main(String[] args) {
		JsonPath js=new JsonPath(Payload.respoance());
		//1. Print No of courses returned by API
		int count=js.getInt("courses.size()");	
System.out.println("Number of course="+count);
//2.Print Purchase Amount
int PurchaseAmount=js.getInt("dashboard.purchaseAmount");
System.out.println("Purchase Amount="+PurchaseAmount);
//3. Print Title of the first course
String firstCourse=js.get("courses.title[0]");
System.out.println("Title of the first course="+firstCourse);
//4.Print All course titles and their respective Prices
for(int i=0;i<count;i++) {
	String Course=js.get("courses.title["+i+"]");
	int price=js.getInt("courses.price["+i+"]") ;
			
	System.out.println("Course title and Price:"+Course+"-"+price);
}
//5. Print no of copies sold by RPA Course
System.out.print("No of copies sold by RPA Course:");
for(int i=0;i<count;i++) {
	String Course=js.get("courses.title["+i+"]");
	if(Course.equalsIgnoreCase("RPA")) {
		int noOfCopies=js.getInt("courses.copies["+i+"]");
		System.out.println(noOfCopies);	
		break;
	}

	}
//6. Verify if Sum of all Course prices matches with PurchaseAmount
	int sum=0;
for(int i=0;i<count;i++) {
	String Course=js.get("courses.title["+i+"]");
	
	int price=js.getInt("courses.price["+i+"]") ;
	int noOfCopies=js.getInt("courses.copies["+i+"]");	
	int ammount=price*noOfCopies;
	sum=sum+ammount;
	
}
int SumOfAllCoursePrices =sum;
System.out.println("Sum of all Course prices ="+SumOfAllCoursePrices);
Assert.assertEquals(PurchaseAmount, SumOfAllCoursePrices);



	}



	}


