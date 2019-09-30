package com.SOAjersey.demo3;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Scooter {

	private int scooterId;
	private int batteryLvl;
	
	public int getScooterId() {
		return scooterId;
	}
	public void setScooterId(int scooterId) {
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
