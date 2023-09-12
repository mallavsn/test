package restassuredtests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HttpRequests {
	
	@Test
	void getUser() {
		
		given().queryParam("page", "2")
		
		.when()
			.get("https://reqres.in/api/users")
			//.get("https://reqres.in/api/users?page=2")
			
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
		
	}

}
