package program;
import java.util.Scanner;
public class CharacterVowel {
public static void main(String[] args){
	char c;
	Scanner scanner;
	Scanner sc=new Scanner(System.in);
	c=sc.next().charAt(0);
	System.out.println("enter the character");
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.println("vowel");
	}
	else
	{
		System.out.println("consonant");
	}
}
}
