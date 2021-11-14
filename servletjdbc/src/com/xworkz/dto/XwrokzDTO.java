package com.xworkz.dto;

public class XwrokzDTO {

	private String name;
	private String yop;
	private String education;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public XwrokzDTO() {
		
	}
	public XwrokzDTO(String name, String yop, String education, String type) {
		super();
		this.name = name;
		this.yop = yop;
		this.education = education;
		this.type = type;
	}
	
	
	
}
