package com.inheritanceMapping.TPC;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name ="TCP_VEHICLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "VEHICLE_TYPE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue ("Vehicle Company")
public class Vehicle {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_ID")
	private int vechileId;
	
	@Column(name = "VEHICLE_NAME")
	private String vechileName;
	
	public Vehicle(String vehicleName) {
	}
	public int getVechileId() {
		return vechileId;
	}
	public void setVechileId(int vechileId) {
		this.vechileId = vechileId;
	}
	public String getVechileName() {
		return vechileName;
	}
	public void setVechileName(String vechileName) {
		this.vechileName = vechileName;
	}


}
