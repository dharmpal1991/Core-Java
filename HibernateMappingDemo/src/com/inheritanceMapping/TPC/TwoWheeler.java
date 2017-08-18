package com.inheritanceMapping.TPC;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TCP_TWO_WHEELER")
@DiscriminatorValue("Bike")
public class TwoWheeler extends Vehicle{
	

	@Column(name = "Bike")
	private String bikeName;

	public String getBikeName() {
		return bikeName;
	}

	public TwoWheeler(String vehicleName, String bikeName) {
		super(vehicleName);
		this.bikeName = bikeName;
	}
}
