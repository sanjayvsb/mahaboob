package program;
import java.util.Scanner;
public class SumofNum {
	public static void main(String[] args){
	System.out.print("Enter an integer: ");
	Scanner s=null;
	int n = s.nextInt();
	int most = (10 * n) - (n+1);
	int max = (int)( n + Math.random() * most);
	System.out.println("Maximum generated is: "+ max);
	for(int i = 2 ; i < max; i+=2) {
	    int num = max/i;
	    if(num % 2 == 0) {
	        System.out.print("number is "+ num);
	    }    
	}
}
}