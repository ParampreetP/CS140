package assignment01;

public class UniversityStudent {

	private University university;
	private Person person;

	public UniversityStudent(University auniversity, Person aperson) {
		university = auniversity;
		person = aperson;
		person.getHistory()[1] = this;
	}

	public Employee getAJob(Company comp, double startingSalary) {
		return new Employee(comp, startingSalary, this.person);
	}

	public University getUniversity() {
		return university;
	}

	public Person getPerson() {
		return person;
	}

}
