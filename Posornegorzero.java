package posornegorzero;
import java.util.Scanner;
public class Posornegorzero
{
public static void main(String[] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number you want to check");
	n=sc.nextInt();
	if(n>0)
	{
		System.out.println("the given number"+n+"is positive");
	}
	else if(n<0)
	{
		System.out.println("the given number"+n+"is negative");
	}
	else
	{
		System.out.println("the given number"+n+"is zero"); 
	}
}
}
