package restAssuredProject;
import org.testng.annotations.Test;
import org.json.JSONObject; // ✅ make sure this is imported



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class posRequest {
	
	@Test
	public void createReq() {
		JSONObject map=new JSONObject();
		map.put("id", "1");
		map.put("title", "new title");
		map.put("name", "xx");
		map.put("email", "test@gmail.com");
		
		given()
		.header("Content-Type","application/json")
		.body(map.toString())
		
		.when()
		.post("http://localhost:3000/student")
		
		.then()
		.statusCode(201)
		.log().all();
		
		
		
		
	}

}
