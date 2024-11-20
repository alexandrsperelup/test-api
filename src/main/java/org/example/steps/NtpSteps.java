package org.example.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.example.client.RestClient;
import org.junit.jupiter.api.Assertions;

public class NtpSteps {
    private final RestClient restClient;

    public NtpSteps(String baseUrl) {
        this.restClient = RestClient.create(baseUrl);
    }

    @Step
    public void verifyResponseContainsCountry(String endpoint, String expectedCountry) {
        Response response = restClient.get(endpoint);
        String actualCountry = response.jsonPath().getString("country");
        Assertions.assertEquals(expectedCountry, actualCountry,
                "Expected country does not match actual country for: " + endpoint);
    }
}
