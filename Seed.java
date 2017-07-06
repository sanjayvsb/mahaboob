package Guvi;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Seed {
		public static void main (String[] args) throws java.lang.Exception
		{
		
			int n;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int temp;
			int a=n;
			int m=1;
			while(n!=0)
			{
				temp=n%10;
				if(temp==0)
				{
					System.out.println("Cannot find seed value as it contains zero");
					break;
				}
				m=m*temp;
				n=n/10;
			}
			a=a*m;
			System.out.println(a);
			
		}
	}

