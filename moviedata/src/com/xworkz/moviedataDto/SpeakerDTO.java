package com.xworkz.moviedataDto;

import java.io.Serializable;
import java.util.Arrays;

public class SpeakerDTO implements Serializable{
	
	private String brandname;
	private String type;
	private boolean magnet;
	private boolean GrapheneQ;
	private double batterylast;
	private boolean wireconnection;
	private boolean bluetoothconnection;
	private boolean highresolution;
	private String[] headphonesbuilt;
	private double headphonecost;
	private String[] batterytype;
	private Integer bluetoothversion;
	private double warranty;
	private double soundquality;
	private String preferredprovider;
	
	public SpeakerDTO() {
		System.out.println("Default Constructor");
	}

	@Override
	public String toString() {
		return "SpeakerDTO [brandname=" + brandname + ", type=" + type + ", magnet=" + magnet + ", GrapheneQ="
				+ GrapheneQ + ", batterylast=" + batterylast + ", wireconnection=" + wireconnection
				+ ", bluetoothconnection=" + bluetoothconnection + ", highresolution=" + highresolution
				+ ", headphonesbuilt=" + Arrays.toString(headphonesbuilt) + ", headphonecost=" + headphonecost
				+ ", batterytype=" + Arrays.toString(batterytype) + ", bluetoothversion=" + bluetoothversion
				+ ", warranty=" + warranty + ", soundquality=" + soundquality + ", preferredprovider="
				+ preferredprovider + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isMagnet() {
		return magnet;
	}

	public void setMagnet(boolean magnet) {
		this.magnet = magnet;
	}

	public boolean isGrapheneQ() {
		return GrapheneQ;
	}

	public void setGrapheneQ(boolean grapheneQ) {
		this.GrapheneQ = grapheneQ;
	}

	public double getBatterylast() {
		return batterylast;
	}

	public void setBatterylast(double batterylast) {
		this.batterylast = batterylast;
	}

	public boolean isWireconnection() {
		return wireconnection;
	}

	public void setWireconnection(boolean wireconnection) {
		this.wireconnection = wireconnection;
	}

	public boolean isBluetoothconnection() {
		return bluetoothconnection;
	}

	public void setBluetoothconnection(boolean bluetoothconnection) {
		this.bluetoothconnection = bluetoothconnection;
	}

	public boolean isHighresolution() {
		return highresolution;
	}

	public void setHighresolution(boolean highresolution) {
		this.highresolution = highresolution;
	}

	public String[] getHeadphonesbuilt() {
		return headphonesbuilt;
	}

	public void setHeadphonesbuilt(String[] headphonesbuilt) {
		this.headphonesbuilt = headphonesbuilt;
	}

	public double getHeadphonecost() {
		return headphonecost;
	}

	public void setHeadphonecost(double headphonecost) {
		this.headphonecost = headphonecost;
	}

	public String[] getBatterytype() {
		return batterytype;
	}

	public void setBatterytype(String[] batterytype) {
		this.batterytype = batterytype;
	}

	public Integer getBluetoothversion() {
		return bluetoothversion;
	}

	public void setBluetoothversion(Integer bluetoothversion) {
		this.bluetoothversion = bluetoothversion;
	}

	public double getWarranty() {
		return warranty;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}

	public double getSoundquality() {
		return soundquality;
	}

	public void setSoundquality(double soundquality) {
		this.soundquality = soundquality;
	}

	public String getPreferredprovider() {
		return preferredprovider;
	}

	public void setPreferredprovider(String preferredprovider) {
		this.preferredprovider = preferredprovider;
	}

	
}
