package Guvi;
import java.util.Scanner;
public class Transulate {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
		    String a=sc.next();
			String b=a.toLowerCase();
			String s1="";
			 for(int i=0;i<b.length();i++)
			    {
				    int a1=(int)b.charAt(i);
				    a1=a1-96;
				    String s=Integer.toString(a1);
				    s1=s1+s;
		}System.out.println(s1);
		}


		}
