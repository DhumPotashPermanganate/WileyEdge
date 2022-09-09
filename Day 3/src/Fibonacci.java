
public class Fibonacci {
	int first, last;
	
	

	public Fibonacci(int first, int last) {
		this.first = first;
		this.last = last;
	}

	public void calculateFibonacci()
	{
		int x=0;
		int y=1;
		int term = x+y;
		for(int i=1; term<this.last; i++)
		{
			x=y;
			y=term;
			term= x+y;
			if (term >= this.first && term <= this.last)
				System.out.print(term + " ");
		}
	}

	
	public static void main(String[] args)
	{
		Fibonacci obj = new Fibonacci(10, 100);
		obj.calculateFibonacci();
	}
}
