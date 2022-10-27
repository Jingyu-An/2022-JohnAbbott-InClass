package Session7E5;

import java.util.ArrayList;

import Session7E3.Car;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		Car c1 = new Car(4, 12000, 5); 
		Car c2 = new Car(2, 23000, 2);
		Car c3 = new Car(2, 28000, 4);
		Car c4 = new Car(); 
		
		c1.equals(c4);
		//Car c;
		
		ArrayList<Car> A1 = new ArrayList<Car>();
		ArrayList<String> A2 = new ArrayList<String>();
		
		if(A1.equals(A2)) {
			System.out.println("a1 and a2 they are equal");
		}else {
			System.out.println("they are NOT equal");
		}
		//A1 [ c1,c2,c3,c4]
		A1.add(c1);
		A1.add(c2);
		A1.add(c3);
		A1.add(c4);
	
		ArrayList<Car> A3 = new ArrayList<Car>();
		//A2 [c1,c2 c3 , c4]
		A3.add(c1);
		A3.add(c2);
		A3.add(c3);
		A3.add(c4);
		
		
		
		if(A1.equals(A3)) {
			System.out.println("a1 and a3 they are equal");
		}else {
			System.out.println("a1 and a3 they are NOT equal");
		}
		
		Car c5 = new Car(c4);
		
		A3.set(3, c5);
		//A3 [ c1, c2, c3, c5]
		
		if(A1.equals(A3)) {
			System.out.println("a1 and a3 they are equal");
		}else {
			System.out.println("a1 and a3 they are NOT equal");
		}
		
		
		
		
		//printArrayList(A1);
		
		
	}
	
	public static void printArrayList(ArrayList<Car> a) {
		
		for(Car c : a) {
			System.out.println(c);
		}
	}

}





