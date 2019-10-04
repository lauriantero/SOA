package com.SOA.demo3.scooterApp.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Scooter {


	private long id;
	private String model;
	private String color;
	private Date manufactured;

	public Scooter() {
		
	}
	
	public Scooter(long id, String model, String color) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.manufactured = new Date();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String brand) {
		this.color = brand;
	}
	public Date getManufactured() {
		return manufactured;
	}
	public void setManufactured(Date manufactured) {
		this.manufactured = manufactured;
	}
}
