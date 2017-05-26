package com.wipro.tutorial.at.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;

@PageObject
public class HomePage extends AbstractPage {

	@FindBy (id = "sb-username")
	private WebElement welcomeLabel;
	
	public String getUsernameText() {
		String welcomeMsg = welcomeLabel.getText();
		Pattern pattern = Pattern.compile(",\\s*([\\w]+)\\s*\\(");
		
		Matcher matcher = pattern.matcher( welcomeMsg );		
		
		String userName = StringUtils.EMPTY;
		
		if (matcher.find()) {
			userName = matcher.group(1); 
		}
				
		return userName;
	}
}
