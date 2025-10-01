package restAssuredProject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetExample {

    @Test
    public void testGetPost() {
        Response res = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");

        System.out.println("Response: " + res.asString());
        System.out.println("Status Code: " + res.getStatusCode());

        Assert.assertEquals(res.getStatusCode(), 200);
    }
}

