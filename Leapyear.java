package program;
import java.util.Scanner;
public class Leapyear {
public static void main(String[] args){
	int year;
	Scanner sc=new Scanner(System.in);
	year=sc.nextInt();
	System.out.println("enter year:");
	if((year%4==0)&&(year%100!=0))
	{
		System.out.println("this is a leapyear");
	}
	else if(year%100==0)
	{
		System.out.println("this is not a leapyear");
	}
	else if(year%400==0)
	{
		System.out.println("this is a leapyear");
	}
	else
	{
		System.out.println("this is not a leapyear");
	}
}
}
