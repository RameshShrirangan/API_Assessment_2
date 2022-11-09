package assessmentchaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends RestAssuredBase {
    @Test(dependsOnMethods = "assessmentchaining.PutIncidentWithFile.put")
	public void delete() {
    	
    	Response response = RestAssured.given().header("Authorization","Bearer rajyFbQJmMES0mc1_8t6F1hkYOGszUZCzEj0_IbKUAlS8IgJaMuEG4iXo-FldqMcVmZzmYJniOTwZwNBFo0kzA")
    			.delete("/incident/"+sys_id);
   
    	System.out.println(response.getStatusCode());
    	
  

	}

}
