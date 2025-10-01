package restAssuredProject;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class getRequest {
	@Test
	public void getStudentDetail() {
		given().when()
		.get("http://localhost:3000/student/?id=1")
		.then()
		.statusCode(200)
		.log().all()
		.header("Content-Type", "application/json")
		.assertThat().body("[0].name", equalTo("taufik"));
		
		
		
	}
	

}
//http://localhost:3000/student