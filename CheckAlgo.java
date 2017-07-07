package Guvi;
import java.util.Scanner;
public class CheckAlgo {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String A=s.next();
			String B=s.next();
			int flag=0;
		int l1=A.length();
		int l2=B.length();
			for(int i=0;i<l1-2;i++)
			{
						String s1=A.substring(i,i+2);
						if(B.contains(s1))
						{
							System.out.println("true");
							break;
						}
						else
						{
							System.out.println("not true");
						}
			}

		}
			
		}

