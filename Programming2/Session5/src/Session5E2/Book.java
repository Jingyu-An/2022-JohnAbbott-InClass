package Session5E2;

public class Book implements Comparble {
private int numOfPages;
	
	public Book (int np)
	{
		numOfPages = np;
	}
	
	public int getNumOfPages()
	{
		return numOfPages;
	}
	
	public void setNumOfpages(int np)
	{
		numOfPages = np;
	}
	
	public int smallerBy(Object x)
	{
		
		if(x == null || x.getClass() != this.getClass())
			return -1;
		
		Book b = (Book)x;
		if (this.numOfPages < b.numOfPages)
			return (b.numOfPages - this.numOfPages);
		else 
			return -1;
		
	}
	
	public int largerBy(Object x)
	{
		
		if(x == null || x.getClass() != this.getClass())
			return -1;
		
		Book b = (Book)x;
		if (this.numOfPages > b.numOfPages)
			return (this.numOfPages - b.numOfPages);
		else 
			return -1;
		
	}

}
