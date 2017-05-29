package com.wipro.tutorial.at.steps.lifecycle;

import org.jbehave.core.annotations.AfterStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AccountLifeCycle {

	@Autowired
	private RestTemplate restTemplate;
	
	@AfterStory()	
	public void tearDownScenario() {
		restTemplate.delete("http://localhost:8080/samplebank/api/accounts/all");		
		System.out.println("#### ACCOUNTS DELETED ###");		
	}
}
