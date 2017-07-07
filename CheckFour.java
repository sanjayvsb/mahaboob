package Guvi;
import java.io.*;
import java.util.*;
public class CheckFour 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int p1=sc.nextInt();
	int p2=sc.nextInt();
	int q1=sc.nextInt();
	int q2=sc.nextInt();
	int r1=sc.nextInt();
	int r2=sc.nextInt();
	int s1=sc.nextInt();
	int s2=sc.nextInt();
	if(p1==p2 && r1==s1 && r2==q2 && p2==s2)
	{
	System.out.println("Square");
	}
	else
	{
	System.out.println("Not Square");
	}
	}
	}

