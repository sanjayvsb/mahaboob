package program;
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
 {
    int n=0;
    int m=0;
    int a=0;
    int x;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = n;
    System.out.print("Enter any number:");
    while(n > 0)
{
    	x = n % 10;
    	a = a * 10 + x;
    	n = n / 10;
}
    if(a == m)
    {
    	System.out.println("Given number is Palindrome"+m);
    	}
    else
    {
    	System.out.println("Given number is Not Palindrome"+m);
    	}
    }
}

