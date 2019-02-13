package assignment03;

public class ClassRoomTester{
	
	public static void main(String[] args){
		ClassRoom classRoom = new ClassRoom();

		classRoom.addStudent(new Student("5", "Tom", "T"));
		classRoom.addStudent(new Student("3", "Fred", "H"));
		classRoom.addStudent(new Student("4", "Bob", "K"));
		classRoom.addStudent(new Student("1", "Jess", "M"));
		classRoom.addStudent(new Student("2", "Jess", "C"));

		System.out.println("**************Original Class Roster**********");
		System.out.println(classRoom);

		classRoom.dropStudent("3");
		System.out.println("\n*******Dropped Fred from the Roster**********");
		System.out.println(classRoom);

		
		classRoom.sortById();
		System.out.println("\n*******Roster after sorting by Id's**********");
		System.out.println(classRoom);

		for(Student s : classRoom.getRoster()){
			System.out.println("Name: " + s.getName() + "\tId: " + s.getBnumber());
		}

		
		classRoom.sortByName();
		System.out.println("\n*******Roster after sorting by Name**********");
		System.out.println(classRoom);

		for(Student s : classRoom.getRoster()){
			System.out.println("Name: " + s.getName() + "\tId: " + s.getBnumber());
		}
		
	}
}
