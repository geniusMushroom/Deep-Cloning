package com.iSoftware.cloneable.deepClone;

public class cloneableTester {

	public static void main(String[] args) {
		addressClone address = new addressClone(" Bavaria, ", " Munich, ", " Germany, ");
		manufactureClone manufacturer = new manufactureClone(" BMW, ", address);
		productClone product = new productClone(" 535 XI, ", 90000.00, manufacturer);
		storeClone sOriginal = new storeClone(" BMW of South Albany, ", product, address);
		System.out.println(sOriginal);
		try {
			storeClone sAnother = (storeClone) sOriginal.clone();
			sAnother.Product.productName = " Audi A8, ";
			sAnother.Product.productPrice = 85000.00;
			sAnother.Product.Manufacture.manufacturerName = " Audi, ";
			System.out.println(sAnother);
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();

		}

		System.out.println(sOriginal);
	}
}
