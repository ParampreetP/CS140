package lab07;

public class Tiger extends Carnivore {
	private String name;

	public String getName() {
		return name;
	}
	public Tiger(String prey, int predatoryLevel, String aname) {
		
		super(predatoryLevel, prey);
		this.name = aname;
	}
	@Override
	public String toString() {
		return "Tigers are a predator of Asia, known for their stripes";
	}
	@Override
	public String getAnimalName() {
		return "tiger";
	}
	@Override
	public void speak() {
		System.out.println("Growl");
	}
	@Override
	public void eat() {
		System.out.println("Tony the Tiger eats " + super.getPrey());
	}
	@Override
	public void move() {
		System.out.println("Tigers move gracefully due to their powerful leg and shoulder muscles.");
	}
	@Override
	public void sleep() {
		System.out.println("Tigers like to sleep in rocky places, grassy areas, or inside caves.");
	}
	@Override
	public String kingdom() {
		return "Animalia";
	}
	@Override
	public String genus() {
		return "Panthera";
	}
	@Override
	public String species() {
		return "P.tigris (tiger)";
	}
	public void prowl() {
		System.out.println("The tiger pounces on a unsuspecting" + super.getPrey()); 
	}
}
