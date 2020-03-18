
public class IceCream extends DessertItem{
	String name;
	int cost;
	
	public static void main(String[] args) {
		
	}	
	
	public IceCream(String name) {
		this(name, 0);
	}
	
	public IceCream(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public int getCost() {
		int cost;
		cost = this.cost;
		return cost;
	}

}
