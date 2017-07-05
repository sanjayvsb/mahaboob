package program;
import java.util.Scanner;
public class HcforGcd {
public static void main(String[] args){
	int n1;
	int n2;
	int r;
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	while(n2!=0){
		r=n1%n2;
		n1=n2;
		n2=r;
	}
	System.out.println("Gcd="+n1);
}
}
