package Session5E4;

public class Test {
	public static void main(String[] args) {
	System.out.println("Will create two Car objects");

	
	Car c1 = new Car();
	Car	c2 = new Car(120, 2500, 22000, 4000, 2021, 260, 2, 1.9, 2.3, 4, 12 ); 
	
	System.out.println("\nWill now clone the two Car objects");		
	Car c3 = c1.clone(), c4 = c2.clone();
	

	System.out.println("\nDisplaying information of the cars");
	System.out.println("==================================");

	
	
	System.out.println("Here is the information of c1:");	
	System.out.println(c1);
	System.out.println();
	
	System.out.println("Here is the information of c3, which is a clone of c1:");	
	System.out.println(c3);
	System.out.println();
		
	System.out.println("Here is the information of c2:");	
	System.out.println(c2);
	System.out.println();
	
	System.out.println("Here is the information of c4, which is a clone of c2:");	
	System.out.println(c4);
	System.out.println();
		

	}
}
