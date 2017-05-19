package com.wipro.tutorial.at.configuration;

import org.jbehave.web.selenium.FirefoxWebDriverProvider;
import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.web.selenium.WebDriverScreenshotOnFailure;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan({"com.wipro.tutorial"})
public class ProjectConfiguration {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public WebDriverProvider webDriverProvider() {		
		WebDriverProvider webDriverProvider = new FirefoxWebDriverProvider();		
		return webDriverProvider;
	}
		
	@Bean
	public WebDriverScreenshotOnFailure screenshotOnFailureDriver() {
		return new WebDriverScreenshotOnFailure(webDriverProvider());
	}
	
}
