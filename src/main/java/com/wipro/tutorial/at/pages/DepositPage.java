package com.wipro.tutorial.at.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;

@PageObject
public class DepositPage extends AbstractPage{

    @FindBy(id = "targetAccount")
    private WebElement cpfElement;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy(className = "sb-button")
    private WebElement depositBtn;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public DepositPage depositSelectCpf(String cpfNumber){
        Select cpf = new Select(cpfElement);
        cpf.selectByVisibleText(cpfNumber);

        return this;
    }

    public DepositPage depositAmount(String inputDeposit){
        amountInput.sendKeys(inputDeposit);

        return this;
    }

    public DepositPage clickDepositButton(){
        depositBtn.click();

        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
