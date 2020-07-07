package Pair;

import Sheep.Sheep;

public class Pair<T, V> {
	private final T val1;
	private final V val2;

	public Pair(T val1, V val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public T getVal1() {
		return val1;
	}

	public V getVal2() {
		return val2;
	}


	@Override
	public int hashCode() {
		int rez = val1 != null ? val1.hashCode() : 0;
		rez = 31 * rez + (val2 != null ? val2.hashCode() : 0);
		return rez;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (this.getClass() != o.getClass()) return false;
		Pair pair = (Pair) o;
		if (val1 != null ? !val1.equals(pair.val1) : pair.val1 == null) return false;
		return (val2 != null ? val2.equals(pair.val2) : pair.val2 == null);

	}

	@Override
	public String toString() {
		return "Pair{" +
				"val1=" + val1 +
				", val2=" + val2 +
				'}';
	}

	static <T, V> Pair<T, V> creatorOfPairs(T val1, V val2) {
		Pair<T, V> pair = new Pair<>(val1, val2);
		return pair;
	}

	public static void main(String[] args) {
		Sheep sheep = new Sheep("fom", "black");
		Pair p = creatorOfPairs("String", sheep);
		if (p.equals(new Pair("String", sheep))){
			System.out.println("test1-true");
		}
	}
}
