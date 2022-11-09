package assessmentoauth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteWithOauth {
    @Test
	public void delete() {
    	
    	RestAssured.baseURI="https://dev120775.service-now.com/api/now/table";
    	Response response = RestAssured.given().header("Authorization","Bearer rajyFbQJmMES0mc1_8t6F1hkYOGszUZCzEj0_IbKUAlS8IgJaMuEG4iXo-FldqMcVmZzmYJniOTwZwNBFo0kzA")
    			.delete("/incident/c88b1ca597071110aba1318c1253afd6");
   
    	System.out.println(response.getStatusCode());
    	
  

	}

}
