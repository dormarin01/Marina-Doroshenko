package sweets;

public class Sweet {
	private String name;
	private int sugarCons;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Sweet [name=" + name + ", sugarCons=" + sugarCons + ", weight=" + weight + "]";
	}
	public int getSugarCons() {
		return sugarCons;
	}
	public void setSugarCons(int sugarCons) {
		this.sugarCons = sugarCons;
	}
	public int getWeight() {
		return weight;
	}
	public Sweet(String name, int sugarCons, int weight) {
		this.name = name;
		this.sugarCons = sugarCons;
		this.weight = weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}	
}
