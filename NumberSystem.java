package Guvi;
import java.util.Scanner;
public class NumberSystem {
	public static int series(int n){
		if(n==1){
			return 3;
		}else if(n==2){
			return 4;
		}else{
			int l;
			if(n%2==0){
				l=4;
			}else{
				l=3;
			}
			return 10*series((n-1)/2)+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(series(num));
	}
}
