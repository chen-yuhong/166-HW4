
public class Cookie extends DessertItem{
	String name;
	int numCookies;
	int costPer;
	
	public static void main(String[] args) {
		
	}	
	
	public Cookie(String name) {
		this(name, 0, 0);
	}
	
	public Cookie(String name, int numCookies, int costPer) {
		this.name = name;
		this.numCookies = numCookies;
		this.costPer = costPer;
	}
	
	public int getCost() {
		int cost;
		cost = this.numCookies * this.costPer;
		return cost;
	}

}
