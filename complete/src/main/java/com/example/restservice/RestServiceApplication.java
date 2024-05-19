package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.datatheorem.ApiProtectServletFilter;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Bean
	FilterRegistrationBean<ApiProtectServletFilter> apiProtectFilterRegistrationBean() {
		// registers api protect filter
		FilterRegistrationBean<ApiProtectServletFilter> apiProtectFilterRegistrationBean = new FilterRegistrationBean<>();
		apiProtectFilterRegistrationBean.addUrlPatterns("*");
		apiProtectFilterRegistrationBean.setFilter(new ApiProtectServletFilter());
		return apiProtectFilterRegistrationBean;
	}

}
