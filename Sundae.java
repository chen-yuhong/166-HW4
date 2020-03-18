
public class Sundae extends IceCream{
	String iceName;
	String topName;
	int iceCost;
	int topCost;
	
	public static void main(String[] args) {
		
	}	
	
	public Sundae(String iceName) {
		this(iceName, 0, "No Topping", 0);
	}
	
	public Sundae(String iceName, int iceCost, String topName, int topCost) {
		super(iceName, iceCost);
		this.topName = topName;
		this.topCost = topCost;
	}
	
	public int getCost() {
		int cost;
		cost = this.iceCost + this.topCost;
		return cost;
	}

}
