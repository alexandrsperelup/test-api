package org.example.tests;
import org.example.BaseTest;
import org.example.helpers.DataHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class DomainTests extends BaseTest {

    static List<String> endpoints() throws Exception {
        return DataHelper.getEndpoints("ntpUkraine");
    }

    @ParameterizedTest
    @MethodSource("endpoints")
    void testEndpoints(String endpoint) {
        ntpSteps.verifyResponseContainsCountry(endpoint, "Ukraine");
    }
}
