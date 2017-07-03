package program;
import java.util.Scanner;
public class LargestNo {
public static void main(String[] args){
	int a;
	int b;
	int c;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	System.out.println("enter the three numbers");
	if(a>=b&&a>=c)
	{
		System.out.println("largest number"+a);
	}
	if(b>=a&&b>=c)
	{
		System.out.println("largest number"+b);
	}
	if(c>=a&&c>=b)
	{
		System.out.println("largest number"+c);
	}
}
}
