package Guvi;
import java.util.*;
public class ArrayAdd {
	public static void main(String[] args) {
	@SuppressWarnings("resource")

	Scanner sc=new Scanner(System.in);

	System.out.println("enter the size of array");

	int n=sc.nextInt();

	System.out.println("enter the elements of array");

	int[]s=new int[n];

	for(int i=0;i<n;i++) 
	{
		s[i]=sc.nextInt();
	}

	for(int i=0;i<n;i++) 
	{

	for(int j=0;j<n;j++) 
	{
			
		System.out.println("select the target elements");
			s[i]=sc.nextInt();
			s[j]=sc.nextInt();
			int target=s[i]+s[j];
		System.out.println(target-1);
		
	}

	}

	}
}
