package com.xworkz.trainentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.HttpServlet;

@Entity
@Table(name = "trainDet")
public class TrainEntity{
	@Id
	@Column(name = "trainName")
	String trainName;
	@Column(name = "trainColor")
	String trainColor;
	@Column(name = "trainSpeed")
	int trainSpeed;
	@Column(name = "trainCompartments")
	String trainCompartments;

	public TrainEntity() {
	}

	public TrainEntity(String trainName, String trainColor, int trainSpeed, String trainCompartments) {
		super();
		this.trainName = trainName;
		this.trainColor = trainColor;
		this.trainSpeed = trainSpeed;
		this.trainCompartments = trainCompartments;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainColor() {
		return trainColor;
	}

	public void setTrainColor(String trainColor) {
		this.trainColor = trainColor;
	}

	public int getTrainSpeed() {
		return trainSpeed;
	}

	public void setTrainSpeed(int trainSpeed) {
		this.trainSpeed = trainSpeed;
	}

	public String getTrainCompartments() {
		return trainCompartments;
	}

	public void setTrainCompartments(String trainCompartments) {
		this.trainCompartments = trainCompartments;
	}

}
