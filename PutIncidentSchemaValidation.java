package assessmentputschemavalidation;


import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class PutIncidentSchemaValidation extends RestAssuredBase {
    @Test(dependsOnMethods = "assessmentputschemavalidation.CreateIncident.create")
	public void put() {
    	Response response = RestAssured.given().contentType("application/json")
    			.header("Authorization","Bearer rajyFbQJmMES0mc1_8t6F1hkYOGszUZCzEj0_IbKUAlS8IgJaMuEG4iXo-FldqMcVmZzmYJniOTwZwNBFo0kzA")
    			.when().body(("{\r\n"
    	    			+ "    \"short_description\": \"Updated via Gopi\",\r\n"
    	    			+ "    \"description\": \"Description updated via Gopi\"\r\n"
    	    			+ "}")).put("/incident/"+sys_id);
    	response.prettyPrint();
    	
    	File fileName= new File("./src/main/resources/ValidateSchema.json");
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(fileName));
    	System.out.println(response.getStatusCode());
    	
	}

}
