package com.iSoftware.cloneable.deepClone;

public class manufactureClone implements Cloneable {

	String manufacturerName;
	addressClone manufacturerAddress;

	public manufactureClone(String manufacturerName, addressClone manufacturerAddress) {
		this.manufacturerName = manufacturerName;
		this.manufacturerAddress = manufacturerAddress;

	}

	public String toString() {
		return "Manufacturer Name: " + this.manufacturerName + "Manufacturer Address: " + this.manufacturerAddress;
	}

	protected Object clone() throws CloneNotSupportedException {
		manufactureClone deepCloned = (manufactureClone) super.clone();
		deepCloned.manufacturerAddress = (addressClone) deepCloned.manufacturerAddress.clone();

		return deepCloned;
	}
}
