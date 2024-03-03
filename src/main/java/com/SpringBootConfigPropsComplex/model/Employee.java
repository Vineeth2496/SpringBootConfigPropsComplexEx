package com.SpringBootConfigPropsComplex.model;

import java.util.Map;
import java.util.Set;

import lombok.Data;
@Data
public class Employee {
	private Integer eid;
	private String ename;
	private Double esal;
	
	private Set<String> projs;
	private Map<String, Double> modules;
	
	private Address addr;

}
