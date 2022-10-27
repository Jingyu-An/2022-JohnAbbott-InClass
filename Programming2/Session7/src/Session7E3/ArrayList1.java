package Session7E3;

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
		
		//Car c;
		
		ArrayList<Car> MyArrayList = new ArrayList<Car>(10);
	
		ArrayList<Integer> myArrayList2  = new ArrayList<Integer>();
		
		MyArrayList.add(c1);
		MyArrayList.add(c2);
		MyArrayList.add(c3);
		MyArrayList.add(c4);
		
		
		for(i=0 ; i < MyArrayList.size();i++) {
			System.out.println(	MyArrayList.get(i));
			
		}
		//for each loop 
		for(Car c : MyArrayList) {
			System.out.println(c);
		}
		
		Object[] myArray =  MyArrayList.toArray();
		
		System.out.println("============================");
		
		for(i = 0 ; i < myArray.length ; i++) {
			System.out.println(myArray[i]);
		}
		
		
	}

}





