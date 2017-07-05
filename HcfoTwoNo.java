package program;
import java.util.Scanner;
public class HcfoTwoNo {
public static void main(String[] args){
	int a,b,x,y,t,hcf;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("enter the two numbers:");
	a=x;
	b=y;
	while(b!=0){
		t=b;
		b=a%b;
		a=t;
	}
	hcf=a;
	System.out.println("Hcf="+hcf);
}
}
