package sweets; 
  
public class Demo {
	public static void main(String [] args) {
	
	Sweets sweets = new Sweets();
	Sweet sw1 = new Sweet("choco", 10, 10);
	Sweet sw2 = new Sweet("gummy", 15, 20);
	Sweet sw3 = new Sweet("zhuvas", 20,40);

	sweets.add(sw1);
	sweets.add(sw2);
	sweets.add(sw3);
	

	
	System.out.println(sweets.getSweetsWeight());
	
	System.out.println(sweets.getSweetBySugar(10, 20));

	}
}
