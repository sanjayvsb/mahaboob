package program;
import java.util.Scanner;
public class AmstrongNo 
{
	public static void main(String[] args)
	{
	int arm=0,a,b,c,d,no; 
	Scanner sc=new Scanner(System.in);
	no=sc.nextInt();
	d=no;
	System.out.println("Enter any num :");
	while(no>0)
	{
	a=no%10;
	no=no/10;
	arm=arm+a*a*a;
	}
	if(arm==d)
	{
	System.out.println("Armstrong :");
	}
	else
	{
	System.out.println("not Armstrong");
	}
	}
	}

