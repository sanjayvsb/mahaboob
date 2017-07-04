package program;
import java.util.Scanner;
public class NaturalNo {
public static void main(String[] args){
	int x,i=1;
	int sum=0;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	System.out.println("enter the number");
	while(i<=x){
		sum=sum+i;
		i++;
	}
	System.out.println("sum of number is:"+sum);
}
}
