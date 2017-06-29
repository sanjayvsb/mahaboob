package evenorodd;
import java.util.Scanner;
public class EvenorOdd {
public static void main(String[] args){
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("enter the number:");
	if(n%2==0){
		System.out.println("the number is even");
	}
	else{
		System.out.println("the number is odd");
	}
}
}
