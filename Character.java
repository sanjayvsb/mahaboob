package character;
import java.util.Scanner;
public class Character {
public static void main(String[] args){
	char ch;
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(0);
	System.out.println("enter the character");
	if(ch>='a' && ch<='z'){
		System.out.println(ch+"is alphabet");
	}
	else{
		System.out.println(ch+"is not alphabet");
	}
}
}
