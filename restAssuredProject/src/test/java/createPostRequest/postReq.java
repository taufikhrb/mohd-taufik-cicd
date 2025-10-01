package createPostRequest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class postReq {

    @Test
    public void createReq() {
        // Create object of POJO
        pojoRequest data = new pojoRequest();
        data.setId("101");
        data.setTitle("Hello POJO");
        data.setName("Amreen");
        data.setEmail("amreen@gmail.com");

        // Send POST request
        Response response=
        given()
            .header("Content-Type", "application/json")
            .body(data)   // ✅ directly pass POJO (requires Jackson in classpath)
            
        .when()
            .post("http://localhost:3000/student")
        .then()
            .statusCode(201)
            .log().all()
            .extract().response();
        String id=response.jsonPath().getString("id");
        System.out.println("Created id is "+id);
        
        given()
        .queryParam("id", "id")
        
        .when()
        .get("http://localhost:3000/student")
        
        .then()
        .statusCode(200)
        .log().all();
    }
}
