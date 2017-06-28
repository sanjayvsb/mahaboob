package oddoreven;
import java.util.Scanner;
public class Oddoreven 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter any number");
		if(n%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
}
}