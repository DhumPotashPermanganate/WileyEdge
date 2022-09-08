import java.util.Scanner;

public class DemoClass {
	
	static int forloop(int range)
	{
		int sum=0;
		for(int i=1; i<=range; i++)s
		{
			sum+= i;
		}
		return sum;
	}
	
	static int whileloop(int range)
	{
		int product= 1;
		int i=2;
		while(i<range)
		{
			product*=i;
			i++;
		}
		return product;
	}
	
	static int dowhileloop(int range)
	{
		int sum= 0;
		int i=1;
		do
		{
			if(i%2 != 0)
			{
				i++;
				continue;
			}
			else
			{
				sum+=i;
			}
				
			i++;
		}
		while(i<range);
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Sum of elements using For Loop\n"+
							"2. Product of elements using While Loop\n"+
							"3. Sum of all odd elements using Do-While Loop");
		System.out.println("Enter your option: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Sum of elements using For Loop: "+ forloop(10)); break;
		case 2: System.out.println("Product of elements using While Loop: "+ whileloop(10)); break;
		case 3: System.out.println("Sum of all odd elements using Do-While Loop: "+ dowhileloop(10)); break;
		default: System.out.println("Wrong Option Entered!");
		}
		
	}
	
	
	
	

}
