package exam01;//spring 2018 exam
import java.util.*;
public class TesterSpring18 {
	public static void main(String[] args) {
		Website website = new Website("binghamton.edu", 1.5);
        website.incPop(2.0);

        System.out.println("Expecting 3.0");
        System.out.println("Answer: " + website.getPop());
        System.out.println("toString: " + website);
        
		
		
		
		List<Website> sites = new ArrayList<>();
		sites.add(new Website("site1", 2));
		sites.add(new Website("site2.com", 1));
		sites.add(new Website("site3.com", 3));
		sites.add(new Website("site4.com", 3));
		sites.add(new Website("site5.com", 4));
		Internet internet = new Internet(sites);
		System.out.println("Every index in array corresponds with webites having i population: ");
		System.out.println("Expected: [1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0]");
		System.out.println("Array:    " + Arrays.toString(internet.profile()));
 }
}
