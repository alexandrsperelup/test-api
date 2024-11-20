package org.example;

import org.example.steps.NtpSteps;
import static org.example.enums.Url.*;

public abstract class BaseTest {
    protected NtpSteps ntpSteps;

    public BaseTest() {
        ntpSteps = new NtpSteps(IPAPI.getUrl());
    }
}
