package program;

public class ReverseNo {
public static void main(String[] args){
	int number=2526;
	int reversednumber=0;
	int temp=0;
	while(number>0){
		reversednumber=reversednumber*10+temp;
		number=number/10;
	}
	System.out.println("reversed number is:"+reversednumber);
}
}
