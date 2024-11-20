package org.example.client;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class BaseRestClient {
    private final String baseUrl;

    public BaseRestClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Response get(String endpoint) {
        return given()
                .header("Content-Type", "application/json")
                .when()
                .get(baseUrl + endpoint)
                .then()
                .extract()
                .response();
    }

    public Response post(String endpoint, Object body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(baseUrl + endpoint)
                .then()
                .extract()
                .response();
    }

    public Response put(String endpoint, Object body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(baseUrl + endpoint)
                .then()
                .extract()
                .response();
    }

    public Response delete(String endpoint) {
        return given()
                .header("Content-Type", "application/json")
                .when()
                .delete(baseUrl + endpoint)
                .then()
                .extract()
                .response();
    }
}
