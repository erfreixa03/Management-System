package back_end_package;

import java.util.Comparator;
import java.util.List;

public abstract class Person implements Comparable<Person> {
	protected String name;
	protected String email;
	protected String id;
	public static final Comparator<Person> CMP = null;

	public Person(List<String> list) {
		if (list.size() != 3) {
			throw new IllegalArgumentException(
					"List size must be 3.\n" + "Where Indices:\n" + "0 : name" + "1 : email" + "2 : id");
		}
		this.name = list.get(0);
		this.email = list.get(1);
		this.id = list.get(2);
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getID() {
		return this.id;
	}

	@Override
	public int compareTo(Person other) {
		return this.id.compareTo(other.id);
	}

	public static void main(String[] args) {
	}

}
