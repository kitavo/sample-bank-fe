package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


@PageObject
public class WithdrawPage extends AbstractPage {
    @FindBy(id = "targetAccount")
    private WebElement cpfElement;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy(className = "sb-button")
    private WebElement withdrawBtn;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public WithdrawPage withdrawSelectCpf(String cpfNumber){
        Select cpf = new Select(cpfElement);
        cpf.selectByVisibleText(cpfNumber);

        return this;
    }

    public WithdrawPage withdrawAmount(String inputWithdraw){
        amountInput.sendKeys(inputWithdraw);

        return this;
    }

    public WithdrawPage clickWithdrawButton(){
        withdrawBtn.click();

        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
