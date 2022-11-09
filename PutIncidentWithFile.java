package assessmentchaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutIncidentWithFile extends RestAssuredBase {
    @Test(dependsOnMethods = "assessmentchaining.CreateIncidentWithFile.create")
	public void put() {
    	File fileName= new File("./src/test/resources/updateincident.json");
    	Response response = RestAssured.given().contentType("application/json")
    			.header("Authorization","Bearer rajyFbQJmMES0mc1_8t6F1hkYOGszUZCzEj0_IbKUAlS8IgJaMuEG4iXo-FldqMcVmZzmYJniOTwZwNBFo0kzA")
    			.when().body(fileName).put("/incident/"+sys_id);
    	response.prettyPrint();
 
    	System.out.println(response.getStatusCode());
    	
  

	}

}
