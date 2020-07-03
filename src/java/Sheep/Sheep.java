package Sheep;

import java.io.Serializable;

public class Sheep implements Serializable, Cloneable {
	public transient boolean notHungry = false;
	private final String name;
	private final String color;
	private int age;
	private int weight;
	private Wool wool;

	public Sheep(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Sheep(String name, String color, Wool wool) {
		this.name = name;
		this.color = color;
		this.wool = wool;
	}

	public void setWool(Wool wool) {
		this.wool = wool;
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

	public Wool getWool() {
		return wool;
	}

	@Override
	public String toString() {
		return "Sheep{" +
				"notHungry=" + notHungry +
				", name='" + name + '\'' +
				", color='" + color + '\'' +
				", age=" + age +
				", weight=" + weight +
				", wool=" + wool +
				'}';
	}



	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Sheep sheep = (Sheep) o;

		if (notHungry != sheep.notHungry) return false;
		if (age != sheep.age) return false;
		if (weight != sheep.weight) return false;
		if (name != null ? !name.equals(sheep.name) : sheep.name != null) return false;
		if (color != null ? !color.equals(sheep.color) : sheep.color != null) return false;
		return wool != null ? wool.equals(sheep.wool) : sheep.wool == null;
	}

	@Override
	public int hashCode() {
		int result = (notHungry ? 1 : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (color != null ? color.hashCode() : 0);
		result = 31 * result + age;
		result = 31 * result + weight;
		result = 31 * result + (wool != null ? wool.hashCode() : 0);
		return result;
	}

	@Override
	public java.lang.Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	public Sheep cloneDeep() throws CloneNotSupportedException {
		Sheep sheep = (Sheep) super.clone();
		Wool wool = (Wool) this.getWool().clone();
		sheep.setWool(wool);
		return sheep;
	}
}
