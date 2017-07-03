package program;
import java.util.Scanner;
public class Character {
public static void main(String[] args){
	char ch;
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(0);
	System.out.println("enter a character:");
	if(ch>='a'&&ch<='z')
	{
		System.out.println("alphabet");
	}
	else
	{
		System.out.println("not alphabet");
	}
}
}
