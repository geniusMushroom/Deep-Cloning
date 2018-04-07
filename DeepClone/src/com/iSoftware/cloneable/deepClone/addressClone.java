package com.iSoftware.cloneable.deepClone;

public class addressClone implements Cloneable {

	String City;
	String State;
	String Country;

	public addressClone(String City, String State, String Country) {
		this.City = City;
		this.State = State;
		this.Country = Country;

	}

	public String toString() {
		return "Manufacture City: " + this.City + "Manufacture State: " + this.State + "Manufacture Country: "
				+ this.Country;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
