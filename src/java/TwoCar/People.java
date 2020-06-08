package TwoCar;

public class People {
	private String name;
	private int age;

	public People(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return (nam >> age/10) * 31;
	}

	@Override
	public String toString() {
		return "{People: " +
				"name=" + name +
				", age=" + age + "}";
	}


}
