package Guvi;
import java.util.Scanner;
public class SpecialChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
		int b[]=new int[100];
		int count=0;
		String str=s.nextLine();
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				s1+=str.charAt(i);
			}
		}
		int m=Integer.parseInt(s1);
		int m1=m;
		int i=0;
		while(m!=0)
		{
			int rem=m%10;
			a[i]=rem;
			m/=10;
			i++;
			count++;
		}
		int max=-1111;
		for(i=0;i<count;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		int sum=0;
		for(i=0;i<count;i++)
		{
			int add=a[i]*max;
			sum=sum+add;
		}
		int sum1=0;
		while(sum!=0)
		{
			int rem=sum%10;
			sum1=sum1+rem;
			sum/=10;
		}
		int sum2=0;
		while(sum1!=0)
		{
			int rem=sum1%10;
			sum2=sum2+rem;
			sum1/=10;
		}
		int sum3=0;
		while(sum2!=0)
		{
			int rem=sum2%10;
			sum3=sum3+rem;
			sum2/=10;
			
		}
		b[0]=sum3;
		System.out.println("sum3  "+sum3);
		
		int min=9999;
		for(i=0;i<count;i++)
		{
		if(a[i]<min)
		{
			min=a[i];
		}
		}
		int n1=1;
		for(i=0;i<count;i++)
		{
			int add=a[i]+min;
			n1=n1*add;
		}
		
		int n2=0;
		while(n1!=0)
		{
			int rem=n1%10;
			n2=n2+rem;
			n1/=10;
		}
		int n3=0;
		while(n2!=0)
		{
			int rem=n2%10;
			n3=n3+rem;
			n2/=10;
		}
		b[1]=n3;
		System.out.println("sum4 "+n3);
		int min1=9879;
		for( i=0;i<2;i++)
		{
			if(b[i]<min1)
			{
				min1=b[i];
			}
		}
		int ans=min1*min1;
		System.out.println(ans);
		
	}
	
}
