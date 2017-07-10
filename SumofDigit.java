package Guvi;
import java.io.InputStream;
import java.util.Scanner;
public class SumofDigit {
		public static void main(String[] args) {
		int a;
		a=Integer.parseInt(args[0]);
		int sum1;
		int[] f = null;
		int d;
		int len=0;
		int c;
		int sum=0;
		while(a>0)
		{
		c=a%10;
		a=a/10;
		sum=sum+c;
		}
		sum1=sum;
		while(sum>0)
		{
			sum=sum/10;
			++len;
		}
		while(sum>0)
		{
		d=sum%10;
		sum=sum/10;
		for(int i=0;i<len;i++){
			f[i]=sum;
		}
			

		}
		if(sum!=0){
			System.out.println("palindrome");}
			else
			{
				System.out.println("not palindrome");
			}
		}
}
