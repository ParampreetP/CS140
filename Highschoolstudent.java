package assignment01;

public class Highschoolstudent {

	private Person person;
	private Highschool highschool;

	public Highschoolstudent(Person aperson, Highschool ahighschool) {
		person = aperson;
		highschool = ahighschool;
		person.getHistory()[0] = this;
	}

	public UniversityStudent goToUniversity(University univ) {
		return new UniversityStudent(univ, this.person);
	}

	public Person getPerson() {
		return person;
	}

	public Highschool getHighschool() {
		return highschool;
	}

}
