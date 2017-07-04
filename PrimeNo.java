package program;
import java.util.Scanner;
public class PrimeNo 
{
public static void main(String[] args)
{
	int num;
	int i;
	int prime=0;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	System.out.println("enter the number");
	for(i=2;i<=(num/2);i++){
		if(num%i==0){
			prime=1;
			break;
		}
	}
	if(prime==0)
	{
		System.out.println("prime number"+num);
	}
	else
	{
		System.out.println("not prime number"+num);
	}
}
}
