package org.example.tests;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.example.BaseTest;
import org.example.helpers.DataHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class DomainTests extends BaseTest {

    private static List<String> endpoints() throws Exception {
        return DataHelper.getEndpoints("ntpUkraine");
    }

    @ParameterizedTest(name = "Test with parameter {0}")
    @Description("Verify that response contains expected country")
    @MethodSource("endpoints")
    @AllureId("TS-01")
    public void testEndpoints(String endpoint) {
        ntpSteps.verifyResponseContainsCountry(endpoint, "Ukraine");
    }
}
