package week1.day2;

public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		int range=8,FirstNumber =0,SecondNumber =1;
	System.out.println("FirstNumber is"+FirstNumber);
		for (int i=0;i<range;i++) 
		{
			int sum=FirstNumber+SecondNumber;
			FirstNumber=SecondNumber;
			SecondNumber=sum;
			System.out.println(sum);
		}
	}		
		
}		