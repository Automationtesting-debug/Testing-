import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import groovyjarjarantlr4.v4.codegen.model.Action;

public class SeleniumTechnicalTest {
	  public static void main(String[] args) {
	        // Intitiolize broswer
		   System.setProperty("webderiver.chrome.drive","/Users/DELL/eclipse-workspace/Driver/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        SoftAssert softAssert= new SoftAssert ();
	        try {
	            // Step 1: open  URL
	            driver.get("https://www.questionpro.com/t/AK7ptZqw5N");
	            driver.manage().window().maximize();

	            // Step 2: create radio button list and  give response to other answer options. 

	            List<WebElement> radioButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("control-label"))); // Replace with the actual 'name' of the question element
	          
	            for (WebElement radio : radioButtons) {
	            	System.out.println(radio.getText());
	                if (radio.getText().equalsIgnoreCase("option 2")) { 
	                    radio.click();
	                    
                    break;
	                }
	            }
                 //proceed to next page
	            driver.findElement(By.id("SurveySubmitButtonElement")).click();
	            // Step 3: Verify validation message for both text boxes, give response and go to next question. 
	            WebElement textBox1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='t_558420301']"))); 
	            WebElement textBox2 = driver.findElement(By.id("558420303ID")); // Replace with the actual 'id'
	            WebElement nextButton = driver.findElement(By.id("SurveySubmitButtonElement")); 
	            // Trigger validation by clicking Next without entering data
	            nextButton.click();
	            String  ExpectedMassege="Text response is required";
	            WebElement validationMessagefortextBox1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("errorSpan_103875159"))); 
	            WebElement validationMessagefortextBox2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("errorSpan_103875160"))); 
	            System.out.println("Validation Message: " + validationMessagefortextBox1.getText());
	            System.out.println("Validation Message: " + validationMessagefortextBox2.getText());
	         softAssert.assertEquals(ExpectedMassege, validationMessagefortextBox1);
	         softAssert.assertEquals(ExpectedMassege, validationMessagefortextBox2);
	            // Enter responses and go to the next question
	            textBox1.sendKeys("xyz");
	            textBox2.sendKeys("abc");
	            nextButton.click();
	            // Step 4: Candidate needs to select value from each of the dropdown
	            List<WebElement> dropdowns = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".btn-group.bootstrap-select.form-select.single-select"))); // Replace with the actual class name
	         int[] val= {1,2,3};
	         
	            for (int i = 0; i <dropdowns.size(); i++) {
	            	int j=i+1;
	                dropdowns.get(i).click();
	                
	                List<WebElement> options = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("li[data-original-index='"+j+"']"))); // Replace 'value' dynamically or statically
	               for(WebElement option:options) {
	            	   String opt=option.getText();
	           
	            	   if(option.getText().trim().equals(String.valueOf(val[i]))) {
	            		 	 option.click() ;          		  
	            	   }
	           }
	            }
	            driver.findElement(By.id("SurveySubmitButtonElement")).click();
	            // Step 5: Categorize cards as per specified category
	            
	            
	            List<WebElement> cards = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("li[class='controls control-selection ui-sortable-handle']"))); // Replace with the actual class name
	        
	            WebElement fruitscolumn = driver.findElement(By.id("2306")); // Replace with the actual 'id'
	            WebElement vegetablescolumn = driver.findElement(By.id("2307")); 
               Actions act= new Actions(driver); 
//               List<String> fruits = List.of("apples");
//               List<String> vegetables = List.of("lettuce", "spinach", "broccoli");
             
	            for (WebElement card : cards) {
	            	String item =card.getText().toLowerCase();
	            	System.out.println(item);
	               if (item.contains("apples")) {
                    // Move fruit to the fruits column
	            	   //act.dragAndDrop(card, fruitscolumn).perform();
	            	   moveElementWithJavaScript(driver,card,fruitscolumn);
	               }
	               
	             else if (item.contains("lettuce")) {
                    // Move vegetable to the vegetables column
                    act.moveToElement(card).clickAndHold().moveToElement(vegetablescolumn).release().build().perform();
	            }
	            }
	            driver.findElement(By.id("SurveySubmitButtonElement")).click();
	            // Step 6: Use the radio button list that we created while answering the first question and collect responses for this question. 
	            List<WebElement> matrixRadioButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("matrixQuestionName"))); // Replace with the actual 'name'
	            for (WebElement radio : matrixRadioButtons) {
	                if (radio.getAttribute("value").equals("PreferredValue")) { // Replace with the desired value
	                    radio.click();
	                }
	            }
	            driver.findElement(By.id("SurveySubmitButtonElement")).click();
	            // Step 7: Verify Thank You massage
	            WebElement thankYouText = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finishText"))); // Replace 'h1' with the actual tag or locator
	            if (thankYouText.getText().contains("Thank you for completing this survey.")) {
	                System.out.println("Survey completed successfully and Thank You message verified.");
	            } else {
	                System.out.println("Thank You message not found!");
	            }
	        
	  
	        } 
	         catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	  private static void moveElementWithJavaScript(WebDriver driver, WebElement source, WebElement target) {
	        String script = """
	            const source = arguments[0];
	            const target = arguments[1];
	            const offsetX = target.getBoundingClientRect().left - source.getBoundingClientRect().left;
	            const offsetY = target.getBoundingClientRect().top - source.getBoundingClientRect().top;
	            source.dispatchEvent(new DragEvent('dragstart', { bubbles: true }));
	            target.dispatchEvent(new DragEvent('dragover', { bubbles: true, clientX: offsetX, clientY: offsetY }));
	            target.dispatchEvent(new DragEvent('drop', { bubbles: true }));
	            source.dispatchEvent(new DragEvent('dragend', { bubbles: true }));
	        """;
	        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript(script, source, target);
	    }
	}



