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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Sheep sheep = (Sheep) o;

		if (notHungry != sheep.notHungry) return false;
		if (age != sheep.age) return false;
		if (weight != sheep.weight) return false;
		if (name != null ? !name.equals(sheep.name) : sheep.name != null) return false;
		return color != null ? color.equals(sheep.color) : sheep.color == null;
	}

	@Override
	public int hashCode() {
		int result = (notHungry ? 1 : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (color != null ? color.hashCode() : 0);
		result = 31 * result + age;
		result = 31 * result + weight;
		return result;
	}
}
