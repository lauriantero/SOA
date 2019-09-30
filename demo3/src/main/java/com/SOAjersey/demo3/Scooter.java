package com.SOAjersey.demo3;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Scooter {

	private String scooterId;
	private int batteryLvl;
	
	public String getScooterId() {
		return scooterId;
	}
	public void setScooterId(String scooterId) {
		this.scooterId = scooterId;
	}
	public int getBatteryLvl() {
		return batteryLvl;
	}
	public void setBatteryLvl(int batteryLvl) {
		this.batteryLvl = batteryLvl;
	}
	@Override
	public String toString() {
		return "Scooter [scooterId=" + scooterId + ", batteryLvl=" + batteryLvl + "]";
	}
	
}
