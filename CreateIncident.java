package assessmentputschemavalidation;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateIncident extends RestAssuredBase {
    @Test
	public void create() {

    	Response response = RestAssured.given().contentType("application/json")
    			.header("Authorization","Bearer rajyFbQJmMES0mc1_8t6F1hkYOGszUZCzEj0_IbKUAlS8IgJaMuEG4iXo-FldqMcVmZzmYJniOTwZwNBFo0kzA")
    			.when().post("/incident");
    	response.prettyPrint();
    JsonPath path = response.jsonPath();
    sys_id = path.get("result.sys_id");
    System.out.println("The Extracted sys_ID is"+sys_id);
    	System.out.println(response.getStatusCode());
    	response.then().assertThat().statusCode(201);
    	
	}

}
