package com.wipro.tutorial.at.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.tutorial.at.pages.WithdrawPage;

@Component
public class WithdrawSteps extends AbstractSteps{

    @Autowired
    private WithdrawPage withdrawPage;

    @When("User select his $cpfNumber")
    public void userSelectCPF(@Named("cpfNumber") String cpfValue ) {
        withdrawPage.withdrawSelectCpf(cpfValue);
    }

    @When("User fills the amount input with value $amount")
    public void userFillsAmount(@Named("amount") String amountValue ) {
        withdrawPage.withdrawAmount(amountValue);
    }

    @When("User clicks on withdraw button")
    public void clickWithdrawButton() {
        withdrawPage.clickWithdrawButton();
    }

    @Then("The return message for withdraw is $message")
    public void assertCreateAccountReturnMessage(@Named("message") String message) {
        Assert.assertEquals(message, withdrawPage.getReturnMsg());
    }
}
