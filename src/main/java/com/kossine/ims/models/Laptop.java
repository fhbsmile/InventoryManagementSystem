package com.kossine.ims.models;

import java.time.LocalDate;

public class Laptop extends Inventory {
	private int id;
	private String laptopTag;
	private String modelNum;
	private String serialNum;
	private String brand;
	private String batterySerialNum;
	private String processor;
	private String ram;
	private String hdd;
	private String supplier;
	private boolean vt;
	private boolean wifi;
	private LocalDate dop;
	private boolean warranty;
	private String where;

	public Laptop() {
		super("Laptop", Laptop.class);
	}

	// change constructor parameter later
	public Laptop(String laptopTag, String serialNum, String supplier) {
		this();
		setLaptopTag(laptopTag);
		setSerialNum(serialNum);
		setSupplier(supplier);
		modelNum = brand = batterySerialNum = processor = hdd = ram = "";
		vt = wifi = warranty = false;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLaptopTag() {
		return laptopTag;
	}

	public void setLaptopTag(String laptopTag) {
		this.laptopTag = laptopTag;
	}

	public String getModelNum() {
		return modelNum;
	}

	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBatterySerialNum() {
		return batterySerialNum;
	}

	public void setBatterySerialNum(String batterySerialNum) {
		this.batterySerialNum = batterySerialNum;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public boolean getVt() {
		return vt;
	}

	public void setVt(boolean vt) {
		this.vt = vt;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public LocalDate getDop() {
		return dop;
	}

	public void setDop(LocalDate dop) {
		this.dop = dop;
	}

	public boolean isWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", laptopTag=" + laptopTag + ", modelNum=" + modelNum + ", serialNum=" + serialNum
				+ ", brand=" + brand + ", batterySerialNum=" + batterySerialNum + ", processor=" + processor + ", ram="
				+ ram + ", hdd=" + hdd + ", supplier=" + supplier + ", vt=" + vt + ", wifi=" + wifi + ", dop=" + dop
				+ ", warranty=" + warranty + ", where=" + where + "]";
	}

	

}