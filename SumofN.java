package program;
import java.util.Scanner;
public class SumofN {
public static void main(String[] args){	
	int sum=0;
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	for(int i=1;i<=number;i++)
	{
		sum=sum+i;
	}
	System.out.println("sum of numbers except given:"+sum);
	scanner.close();
}
}

