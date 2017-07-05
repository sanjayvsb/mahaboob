package program;

import java.util.Scanner;

public class LcmofTwoNo {
	public static void main(String[] args){
		int a,b,x,y,t,hcf,lcm;
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
		lcm=(x*y)/hcf;
		System.out.println("Hcf="+hcf);
		System.out.println("\nlcm="+lcm);
}
}
