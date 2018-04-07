package com.iSoftware.cloneable.deepClone;

public class productClone implements Cloneable {

	String productName;
	Double productPrice;
	manufactureClone Manufacture;

	public productClone(String productName, Double productPrice, manufactureClone Manufacture) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.Manufacture = Manufacture;

	}

	public String toString() {
		return "Product Name: " + this.productName + "Price of Product: " + this.productPrice + "Product Manufacturer: "
				+ this.Manufacture;
	}

	protected Object clone() throws CloneNotSupportedException {
		productClone deepCloned = (productClone) super.clone();
		deepCloned.Manufacture = (manufactureClone) deepCloned.Manufacture.clone();
		return deepCloned;
	}
}
