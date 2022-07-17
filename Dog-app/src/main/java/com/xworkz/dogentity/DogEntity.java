package com.xworkz.dogentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "dog")
public class DogEntity {

	@Id
	@Column(name = "dog_id")
	@GenericGenerator(name = "x", strategy = "increment")
	@GeneratedValue(generator = "x")
	private int id;
	@Column(name = "dog_name")
	private String name;
	@Column(name = "dog_color")
	private String color;
	@Column(name = "dog_weight")
	private double weight;

	public DogEntity() {
		super();
	}

	public DogEntity(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "DogEntity [id=" + id + ", name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

}
