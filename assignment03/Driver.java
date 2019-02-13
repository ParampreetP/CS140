package assignment03;

public class Driver {

	public static void main(String[] args) {

		Person person1 = new Person("Amy May ", 1, 8, 1991);
		Person person2 = new Person("Paul Smith", 3, 5, 1994);
		Person person3 = new Person("Fred Allan", 3, 9, 1993);
		Person person4 = new Person("Frank Tom", 5, 6, 1988);
		
		HighSchool highschool1 = new HighSchool("John Jay");
		HighSchool highschool2 = new HighSchool("ketcham");
		HighSchool highschool3 = new HighSchool("Arlington");
		HighSchool highschool4 = new HighSchool("Beacon");
		
		HighSchoolStudent highschoolStudent1 = new HighSchoolStudent(highschool1, person1);
		HighSchoolStudent highschoolStudent2 = new HighSchoolStudent(highschool2, person2);
		HighSchoolStudent highschoolStudent3 = new HighSchoolStudent(highschool3, person3);
		
		University university1 = new University("BU", "Binghamton");
		University university2 = new University("MIT", "Massachusetts Institute of Technology");
		
		UniversityStudent universityStudent1 = highschoolStudent1.goToUniversity(university1);
		UniversityStudent universityStudent2 = highschoolStudent2.goToUniversity(university2);
		
		Company company1 = new Company("I.B.M.", "Armonk");
		Company company2 = new Company("Apple", "Cupertino, CA");
		
		Employee employee1 = universityStudent1.getAJob(company1, 130000);
		
		
		
		
		System.out.println("---------------------");
		person1.printHistory();
		System.out.println("---------------------");
		person2.printHistory();
		System.out.println("---------------------");
		person3.printHistory();
		System.out.println("---------------------");
		person4.printHistory();
		
		highschoolStudent1.changeHighSchool(highschool2);
		universityStudent1.transferUniversity(university2);
		employee1.changeJob(company2);
		person1.printHistory();
		System.out.println("---------------------");
		
		
		
	}

}
