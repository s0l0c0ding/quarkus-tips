package dev.solocoding;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .prettyPeek()
          .then()
             .statusCode(200)
             .header("X-Content-Type-Options", "nosniff");
    }

}