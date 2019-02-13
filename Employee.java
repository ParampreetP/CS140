package assignment01;

public class Employee {

	private Company company;
	private double salary;
	private Person person;

	public Employee(Company acompany, double asalary, Person aperson) {
		company = acompany;
		salary = asalary;
		person = aperson;
		person.getHistory()[2] = this;
	}

	public Company getCompany() {
		return company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Person getPerson() {
		return person;
	}
}
