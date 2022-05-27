package Session7E8;

public class Gen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenClass<Integer> gc1 = new GenClass<>(5);
		
		gc1.helloWorld();
		gc1.fun1();
		gc1.fun2();
		
		GenClass.fun1();
		GenClass.fun2();
		
	}

}


class A{
	
	protected static int v;
	
	public A() {
		v = 10;
	}
	
	public void helloWorld() {
		System.out.println("Hello everyone");
	}

}


class GenClass< T > extends A{
	
	private T x;
	
	public GenClass(T y) {
		x = y;
	}
	
	public static void fun1() {
		System.out.println("hello this is func 1");
	}
	
	public static void fun2() {
		
		System.out.println("this is func 2 my value is " + v);
	}
	
} 
