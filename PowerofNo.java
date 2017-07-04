package program;
import java.util.Scanner;
public class PowerofNo {
	 public static void main(String arg[])	
	  {
	    int n=2;
	    int p=5;
	    int result=1;
	    Scanner sc=new Scanner(System.in);
	    result=sc.nextInt();
	  if(n>=0&&p==0)
	     {
	        result=1;
	     }
	    else if(n==0&&p>=1)
	      { 
	         result=0;
	      }
	    else
	     {
	         for(int i=1;i<=p;i++)
		 {
	            result=result*n;
	 	 }	    
	     }
	    System.out.println(n+"^"+p+"="+result);
		
	  }
	}

