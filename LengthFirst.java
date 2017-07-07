package Guvi;
import java.util.Scanner;
public class LengthFirst {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s11=s1;
		String s2=s.nextLine();
		String s22=s2;
		String m2="";
		int p=s.nextInt();
		int k=s.nextInt();
		if(s1.length()!=s2.length())
		{
		int m=s1.length();
		int n=s2.length();
		if(m>n)
		{
			String m1=s1.substring(0,1);
		 m2=m1+s2;
		}
		else
		{
			String m1=s2.substring(0,1);
			 m2=m1+s1;
		}
		}
		else
		{
			char ch[]=s11.toCharArray();
			char ch1[]=s22.toCharArray();
			char a=s11.charAt(0);
			char b=s22.charAt(0);
			int m=(int)a;
			int n=(int)b;
			if(m>n)
			{
				String m1=s1.substring(0,1);
			 m2=m1+s2;
			}
			else
			{
				String m1=s2.substring(0,1);
				 m2=m1+s1;
			}	
		}
		int a[]=new int[100];
		int b[]=new int[100];
		int z=p;
		int rev=0;
		int i=0;
		int count=0;
		while(p!=0)
		{
			int rem=p%10;
			a[i]=rem;
			rev=rev*10+rem;
			p/=10;
			i++;
		}
		int l=a[k-1];
        
        int revr=0;
        i=0;
        while(rev!=0)
		{
			int rem=rev%10;
			b[i]=rem;
			revr=revr*10+rem;
			rev/=10;
			i++;
			count++;
		}
        int g=b[k-1];
        System.out.println(m2+g+l);
	}

}
