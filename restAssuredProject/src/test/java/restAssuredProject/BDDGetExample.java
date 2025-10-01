package restAssuredProject;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class BDDGetExample {

    @Test
    public void testGetPostBDD() {
        given()
        .when()
            .get("http://localhost:3000/student")
        .then()
            .statusCode(200)
            .body("userId", equalTo(1))
            .body("id", equalTo(1));
        	
    }
}
