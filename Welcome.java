package Guvi;
import java.util.Scanner;
public class Welcome {
		public static void main(String arg[]){

		String str1;
		Scanner ff=new Scanner(System.in);
	str1=ff.nextLine();
	String str=str1.toUpperCase();
	String aa=str.substring(str.length()-1);
	String bb=str.substring(0,2);
	String cc=str.substring(2,str.length()-1);
	System.out.println(cc);
		String str0=aa.toLowerCase();
		System.out.println(str0);

				String str2=bb.toLowerCase();
				System.out.println(str2);

		String out=str2+cc+str0;
		System.out.println(out);
		}
}
