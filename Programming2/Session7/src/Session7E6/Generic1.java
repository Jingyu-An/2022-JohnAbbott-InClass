package Session7E6;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "this is String";
		Integer i = 10;
		Double d = 12.5;
		
		GenricClass<String> gc1 = new GenricClass<String>(s);
		GenricClass<Integer> gc2 = new GenricClass<Integer>(i);
		GenricClass<Double> gc3 = new GenricClass<Double>(d);
		
		
		gc1.showInfo();
		
		gc2.showInfo();
		
		gc3.showInfo();
		
		
		gc1.setX("what evere");
		gc2.setX(10000);
		gc3.setX(12.876544);
		
		gc1.showInfo();
		
		gc2.showInfo();
		
		gc3.showInfo();
		
		
		
	}

}

class GenricClass< T > {
	
	private T x;
	
	public GenricClass(T y) {
		x = y ;
	}
	
	public void setX(T y) {
		x = y ;
	}
	
	public T getx() {
		return x;
	}
	
	public void showInfo() {
		System.out.println("Here is the x " + x);
	}
	
}


