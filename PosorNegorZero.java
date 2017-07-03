package posornegorzero;
import java.util.Scanner;
public class PosorNegorZero 
{
public static void main(String[] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("enter the number");
	if(n>1)
	{
		System.out.println("enter positive number");
	}
	else if(n<1)
	{
		System.out.println("enter negative number");
	}
	else
	{
		System.out.println("enter zero");
	}
}
}
