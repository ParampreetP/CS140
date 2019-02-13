package assignment03;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;



public class Person {
	private String name;
	private LocalDate birthdate;
	private List<Occupation> history = new LinkedList<>();

	public Person(String aName, int day, int month, int year) {
		name = aName;
		birthdate = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void addOccupation(Occupation occ){
		history.add(occ);
	}
	
	public void printHistory() {
		System.out.println("History of " + name);
		for(Occupation oc : history) {
			oc.print();			
		}	
		
			
			

	
	
	}
}
