
public class Candy extends DessertItem{
	String name;
	double weight;
	int costPer;
	
	public static void main(String[] args) {
		
	}	
	
	public Candy(String name) {
		this(name, 0, 0);
	}
	
	public Candy(String name, double weight, int costPer) {
		this.name = name;
		this.weight = weight;
		this.costPer = costPer;
	}
	
	public int getCost() {
		int cost;
		cost = (int)Math.round(this.weight * this.costPer * 100);
		return cost;
	}

}
