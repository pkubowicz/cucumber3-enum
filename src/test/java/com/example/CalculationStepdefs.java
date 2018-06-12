package com.example;

import cucumber.api.java.en.When;

public class CalculationStepdefs {

    @When("([\\S]+) is calculated")
    public void splitInfoPfShiftIsSelected(CalculationType calculationType) {
        System.out.println("Doing " + calculationType);
    }
}
