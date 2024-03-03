package com.SpringBootConfigPropsComplex.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.SpringBootConfigPropsComplex.model.Employee;

import lombok.Data;
@Component
@ConfigurationProperties(prefix = "data.app")
@Data
public class DataFetchRunner implements CommandLineRunner {
	
	private Employee emp;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
