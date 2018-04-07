package com.iSoftware.cloneable.deepClone;

public class storeClone implements Cloneable {

	String storeName;
	productClone Product;
	addressClone Address;

	public storeClone(String storeName, productClone Product, addressClone Address) {
		this.storeName = storeName;
		this.Product = Product;
		this.Address = Address;

	}

	public String toString() {
		return "Store Name: " + this.storeName + "Product: " + this.Product + "Address: " + this.Address;
	}

	protected Object clone() throws CloneNotSupportedException {
		storeClone deepcloned = (storeClone) super.clone();
		deepcloned.Product = (productClone) deepcloned.Product.clone();
		deepcloned.Address = (addressClone) deepcloned.Address.clone();
		return deepcloned;
	}
}
