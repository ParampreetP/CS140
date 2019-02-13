package assignment01;

public class Driver {

	public static void main(String[] args) {

		Person person1 = new Person("Amy May ", 1, 8, 1991);
		Person person2 = new Person("Paul Smith", 3, 5, 1994);
		Person person3 = new Person("Fred Allan", 3, 9, 1993);
		Person person4 = new Person("Frank Tom", 5, 6, 1988);

		Highschool highschool1 = new Highschool("John Jay");
		Highschool highschool2 = new Highschool("ketcham");
		Highschool highschool3 = new Highschool("Arlington");
		Highschool highschool4 = new Highschool("Beacon");
		
		Highschoolstudent highschoolstudent1 = new Highschoolstudent(person1, highschool1);
		Highschoolstudent highschoolstudent2 = new Highschoolstudent(person2, highschool2);
		Highschoolstudent highschoolstudent3 = new Highschoolstudent(person3, highschool3);
		
		University university1 = new University("Harvard","Cambridge, MA");
		University university2 = new University("Yale","New Haven, CT");

		
		UniversityStudent universityStudent1 = highschoolstudent1.goToUniversity(university1);
		UniversityStudent universityStudent2 = highschoolstudent1.goToUniversity(university2);
		
		
		
		Company company1 = new Company("Apple", "Cupertino, CA");
		Employee employee1 = universityStudent1.getAJob(company1, 140000);
		
		
		
		
		System.out.println("---------------------");
		person1.printHistory();
		System.out.println("---------------------");
		person2.printHistory();
		System.out.println("---------------------");
		person3.printHistory();
		System.out.println("---------------------");
		person4.printHistory();
		
	
		
	}
}
