package Guvi;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Pangram {
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner sc=new Scanner(System.in);
			int count=0;
			char[] letters=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			String input=sc.nextLine();
			
			if(input.length()<26)
			{
				System.out.println("not a pangram");
			}
			else
			{
				input=input.toLowerCase();
				for(int i=0;i<26;i++)
				{
					for(int j=0;j<input.length();j++)
					{
						if(letters[i]==input.charAt(j))
						{
							count++;
							break;
						}
					}
				}
				if(count<26)
					System.out.println("not a pangram");
				else
					System.out.println("its a pangram");
			}
		}
	}	

