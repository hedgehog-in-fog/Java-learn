package Sheep;

import java.io.Serializable;

public class Sheep implements Serializable{
	public transient boolean  notHungry = false;
	private final String name;
	private final String color;
	private int age;
	private int weight;

	public Sheep(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public int getWeight() {
		return weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Sheep{" +
				"notHungry=" + notHungry +
				", name='" + name + '\'' +
				", color='" + color + '\'' +
				", age=" + age +
				", weight=" + weight +
				'}';
	}
}
