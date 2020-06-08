package TwoCar;

public class People {
	String name;
	int age;

	public People(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (this == null) return false;
		if (getClass() != object.getClass()) return false;
		People people = (People) object;
		if (age != people.age) return false;
		return name != null ? name.equals(people.name) : people.name == null;
	}

	@Override
	public int hashCode() {
		int nam = name != null ? name.hashCode() : 0;
		return (nam + age) * 31;
	}

	@Override
	public String toString() {
		return "{People: " +
				"name=" + name +
				", age=" + age + "}";
	}


}
