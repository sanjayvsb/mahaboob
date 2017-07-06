package Guvi;
import java.util.Scanner;
public class Tower {
		public static String main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String str;
	        System.out.println("ENETR YOUR STRING=\n");
	        
	        str=sc.nextLine();
	     if (str.length() <= 1) 
	     {
	         return str;
	     }
	  String mid = str.substring(1, str.length()-1);
	  return str.charAt(str.length()-1) + mid + str.charAt(0);
	       
	}
	}

