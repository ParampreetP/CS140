package exam01;//spring2018 exam

public class Website {
	private String url;
	private double pop; // short for popularity
	
	public Website(String aurl, double apop) {
		this.url = aurl;
		this.pop = apop;
	}
	public double getPop() {
		return pop;
	}
	public String  getUrl() {
		return url;
	}
	@Override
	public String toString() {
		return url + "(" + pop + ")";
		
	}
	public void incPop(double factor) {
		if (factor < 0) {
			throw new IllegalArgumentException("Positive only");
		}
		pop = pop * factor;
		 if (pop>10) {
			 pop = 10;
		 }
	}
}
