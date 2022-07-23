package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "bike_table")
@NamedQuery(name = "BikeEntity.findBikeEntity", query = "from BikeEntity where bikeName=:BIKENAME")
public class BikeEntity {

	@Id
	@Column(name = "bike_id")
	@GenericGenerator(name = "x", strategy = "increment")
	@GeneratedValue(generator = "x")
	private int bikeId;

	@Column(name = "bike_name")
	private String bikeName;

	@Column(name = "bike_color")
	private String bikeColor;

	@Column(name = "bike_brand")
	private String bikeBrand;

	@Column(name = "bike_cost")
	private double bikeCost;

	@Column(name = "bike_type")
	private String bikeType;
	

	public BikeEntity() {
		System.out.println("default constructor Invoked");
	}

	public BikeEntity(String bikeName, String bikeColor, String bikeBrand, double bikeCost, String bikeType) {
		super();
		this.bikeName = bikeName;
		this.bikeColor = bikeColor;
		this.bikeBrand = bikeBrand;
		this.bikeCost = bikeCost;
		this.bikeType = bikeType;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeColor() {
		return bikeColor;
	}

	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}

	public String getBikeBrand() {
		return bikeBrand;
	}

	public void setBikeBrand(String bikeBrand) {
		this.bikeBrand = bikeBrand;
	}

	public double getBikeCost() {
		return bikeCost;
	}

	public void setBikeCost(double bikeCost) {
		this.bikeCost = bikeCost;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}


	@Override
	public String toString() {
		return "BikeEntity [bikeId=" + bikeId + ", bikeName=" + bikeName + ", bikeColor=" + bikeColor + ", bikeBrand="
				+ bikeBrand + ", bikeCost=" + bikeCost + ", bikeType=" + bikeType + "]";
	}

}
