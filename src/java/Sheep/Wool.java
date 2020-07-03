package Sheep;

public class Wool implements Cloneable {
	String type;

	public Wool(String type)  {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Wool wool = (Wool) o;

		return type != null ? type.equals(wool.type) : wool.type == null;
	}

	@Override
	public int hashCode() {
		return type != null ? type.hashCode() : 0;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
