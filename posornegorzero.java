package posornegorzero;
import java.util.Scanner;
public class posornegorzero {
	public static void main(String[] args){
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number you want to check");
		n = s.nextInt();
		if(n > 0)
		{
			System.out.println("the given number "+n+" is positive");
		}
		else if(n < 0)
		{
			System.out.println("the given number "+n+" is negative");
		}
		else
		{
			System.out.println("the given number "+n+" is zero");
		}
	}

}
