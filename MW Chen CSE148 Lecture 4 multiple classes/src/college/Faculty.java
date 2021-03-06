package college;

public class Faculty {
	private Name name;
	private String id;
	private double salary;

	private static int idCounter = 0;

	public Faculty(String firstName, String lastName) {
		id = String.valueOf(++idCounter);
		for (int i = 8; i > String.valueOf(idCounter).length(); i--) {
			id = '0' + id;
		}
		this.name = new Name(firstName, lastName);
	}
	
	public Faculty(String firstName, char middleInitial, String lastName) {
		id = String.valueOf(++idCounter);
		for (int i = 8; i > String.valueOf(idCounter).length(); i--) {
			id = '0' + id;
		}
		this.name = new Name(firstName, middleInitial, lastName);
	}
	

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", id=" + id + "]";
	}

}
