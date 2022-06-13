package com.serchlocation27.dto;
//we create this class because json object content will be copied in this calss.
//json object from other application 
//this calss object variable and json object variable should be same
//if not copying od data will not happend
public class Location {
	private Long id;
	private String name;
	private String codes;
	private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodes() {
		return codes;
	}
	public void setCode(String codes) {
		this.codes = codes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
