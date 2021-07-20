package dev.solocoding;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class GreetingRouteTest {
    
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/reactive")
          .prettyPeek()
          .then()
             .statusCode(200)
             .header("X-Header", "Vertex header");
    }
}
