package com.mahilearnings.webservices.rest.restfulwebservices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class RestfulWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebservicesApplication.class, args);
	}
	
	@Bean 
	public LocaleResolver localeResolver(){
		AcceptHeaderLocaleResolver session = new AcceptHeaderLocaleResolver();
		session.setDefaultLocale(Locale.US);
		return session;
	}

	/*@Bean
	public ResourceBundleMessageSource bundleMessageSource(){ 
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;	
	}*/ 
}
