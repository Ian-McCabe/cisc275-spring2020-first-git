
public class Animal {
	private String name; 
	private int legs; 
	
	public void setName(String n) {
		this.name = n; 
	}
	
	public void setLegs(int l) {
		this.legs = l; 
	}
	
	public int getLegs() {
		return legs; 
	}
	
	public String toString() {
		return name + " " + legs; 
	}
}
