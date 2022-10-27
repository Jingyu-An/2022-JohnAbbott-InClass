package Session7E2;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		Car c1 = new Car(4, 12000, 5); 
		Car c2 = new Car(2, 23000, 2);
		Car c3 = new Car(2, 28000, 4);
		Car c4 = new Car(); 
		Car c5 = new Car(2, 8000, 5); 
		Car c6 = new Car(4, 17000, 2);
		Car c7 = new Car(5, 26000, 6);
		Car c8 = new Car(3 , 10000 , 19);
		
		Car c;
		
		ArrayList<Car> MyArrayList = new ArrayList<Car>(10);
	
		MyArrayList.add(c1);
		MyArrayList.add(c2);
		MyArrayList.add(c3);
		MyArrayList.add(c4);
		MyArrayList.add(c5);
		MyArrayList.add(c6);
		MyArrayList.add(c7);
		
		
		for(i=0 ; i < MyArrayList.size();i++) {
			System.out.println(	MyArrayList.get(i));
			//c = MyArrayList.get(i); //accessing
			//System.out.println();
			//System.out.println(c);
		}
		
		
		System.out.println("the size of my arraylist is  " + MyArrayList.size());
		
		System.out.println();
		
		System.out.println("===================");
		
		if(MyArrayList.contains(c4)) {
			System.out.println("c4 was found"  + MyArrayList.indexOf(c4));
		}
		else {
			System.out.println("c4 is not there");
		}
		
		if(MyArrayList.contains(c8)) {
			System.out.println("c8 was found"  + MyArrayList.indexOf(c8));
		}
		else {
			System.out.println("c8 is not there");
		}
		
		MyArrayList.remove(3);
		
		
		for(i=0 ; i < MyArrayList.size();i++) {
			System.out.println(	MyArrayList.get(i));
		}
		
		MyArrayList.clear();
		
		
		if(MyArrayList.isEmpty()) {
			System.out.println("this array is empty");
		}else {
			System.out.println("this is not empty " );
		}
	}

}





