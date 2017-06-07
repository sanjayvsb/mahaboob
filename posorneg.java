package posorneg;
import java.util.Scanner;
public class posorneg {
	public static void main(String[] args)
	{
int n;
Scanner s = new Scanner(System.in);
System.out.print("enter the number you want to check:");
n = s.nextInt();
if(n > 0)
{
	System.out.println("the given number "+n+" is positive");
}
else
{
	System.out.println("the given number "+n+" is negative");
}
}
}