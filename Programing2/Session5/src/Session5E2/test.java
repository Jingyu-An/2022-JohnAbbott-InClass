package Session5E2;

public class test {
	public static void main(String[] args) {
		
		int x;
		Car c1 = new Car(4, 17500.99, 1988);
		Car c2 = new Car(5, 7654.25, 2017);
		Car c3 = new Car(4, 9723.44, 2019);
		
		Book b1 = new Book(458);
		Book b2 = new Book(712);
		Book b3 = new Book(519);
		
		x = c1.smallerBy(c2);
		if(x > 0)
			System.out.println("c1 is smaller/older than c2 by " + x + " years.");
		else
			System.out.println("c1 is not smaller/older than c2; or it was not able to comapre them!");
		
		x = c3.smallerBy(c2);
		if(x > 0)
			System.out.println("c3 is smaller/older than c2 by " + x + " years.");
		else
			System.out.println("c3 is not smaller/older than c2; or it was not able to compare them!");
		
		x = b2.largerBy(b1);
		if(x > 0)
			System.out.println("b2 is larger than b1 by " + x + " pages.");
		else
			System.out.println("b2 is not larger/bigger than b1; or it was not able to compare them!");
		
		x = b1.smallerBy(b3);
		if(x > 0)
			System.out.println("b1 is smaller than b3 by " + x + " pages.");
		else
			System.out.println("b1 is not smaller than b3; or it was not able to compare them!");
		
		
		x = b1.smallerBy(c3);
		if(x > 0)
			System.out.println("b1 is smaller than c3 by " + x + " pages.");
		else
			System.out.println("b1 is not smaller than c3; or it was not able  to compare them!");
		
	}

}
