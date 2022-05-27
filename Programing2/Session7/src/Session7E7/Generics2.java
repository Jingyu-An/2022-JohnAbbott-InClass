package Session7E7;

import java.util.Scanner;

public class Generics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String familyName1, familyName2;
		Long id1, id2;		
		Integer creationYear1, creationYear2, creationYear3; 
		Car c1 = new Car(5, 10000, 2);
		Car c2 = new Car(5, 10000, 2);
		Car c3 = new Car(5, 10000, 2);
		
		Scanner kb = new Scanner(System.in);
		
//		System.out.println("give me familyname and Id");
//		familyName1 = kb.next();
//		id1 = kb.nextLong();
//		
//		Gen2<Long ,String> stud1 = new Gen2<>(id1 , familyName1);
//		
//		System.out.println("give me familyname and Id");
//		familyName2 = kb.next();
//		id2 = kb.nextLong();
//		
//		Gen2<Long ,String> stud2 = new Gen2<>(id2 , familyName2);
//		
//		
//		if(stud1.equals(stud2)) {
//			System.out.println("they are equals");
//		}else {
//			System.out.println("they are Not equals");
//		}
//		
		
		//play with cars
		
		System.out.println("Give me the years 3 cars?");
		
		creationYear1 = kb.nextInt();
		creationYear2 = kb.nextInt();
		creationYear3 = kb.nextInt();
		
		
		Gen2<Car , Integer> mycar1 = new Gen2<>(c1 , creationYear1);
		Gen2<Car , Integer> mycar2 = new Gen2<>(c2 , creationYear2);
		Gen2<Car , Integer> mycar3 = new Gen2<>(c3 , creationYear3);
		
		if(mycar1.equals(mycar2)) {
			System.out.println("they are equals");
		}else {
			System.out.println("they are Not equals");
		}
		
		if(mycar1.equals(mycar3)) {
			System.out.println("they are equals");
		}else {
			System.out.println("they are Not equals");
		}
		
		if(mycar3.equals(mycar2)) {
			System.out.println("they are equals");
		}else {
			System.out.println("they are Not equals");
		}
		
	}

}


class Gen2< T , S>{
	
	private T x ; 
	private S y;
	
	
	public Gen2() {
		x = null;
		y = null;
	}
	
	public Gen2(T v1 , S v2) {
		x = v1;
		y = v2;
	}
	
	public void setX(T x) {
		this.x = x;
	}
	
	public T getX() {
		return x;
	}
	
	public void setY(S y) {
		this.y = y;
	}
	
	public S gety() {
		return y;
	}
	
	public String toString() {
		return(x.toString() +  "     "   +y.toString());
	}
	
	public boolean equals(Object obj) {
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		else {
			Gen2<T , S> g1 = (Gen2<T , S>) obj;
			
				
				if(x.equals(g1.x) && y.equals(g1.y))
					return true;
				else 
					return false;
			
			
		}
	}
	
	
}
