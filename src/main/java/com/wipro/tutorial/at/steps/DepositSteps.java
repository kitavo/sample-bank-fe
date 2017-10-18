package com.wipro.tutorial.at.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.tutorial.at.pages.DepositPage;

@Component
public class DepositSteps extends AbstractSteps{

    @Autowired
    private DepositPage depositPage;

    @When("User select his $cpfNumber")
    public void userSelectCPF(@Named("cpfNumber") String cpfValue ) {
        depositPage.depositSelectCpf(cpfValue);
    }

    @When("User fills the amount input with value $amount")
    public void userFillsAmount(@Named("amount") String amountValue ) {
        depositPage.depositAmount(amountValue);
    }

    @When("User clicks on deposit button")
    public void clickDepositButton() {
        depositPage.clickDepositButton();
    }

    @Then("The return message for deposit is $message")
    public void assertCreateAccountReturnMessage(@Named("message") String message) {
        Assert.assertEquals(message, depositPage.getReturnMsg());
    }
}
