package Guvi;
import java.util.Scanner;
public class SnakeGame 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();	
		  for(int i=1;i<=n;i++)
		  {
		   if(i==1||i==n)
		   {
		    for(int j=1;j<=n;j++)
		    {
		      System.out.print("* ");
		    }
		   }
		   else
		   {
		    for(int z=1;z<=n;z++)
		    {
		      if(z==1||z==n)
		      {
		       System.out.print("* ");
		      }
		      else
		      {
		       System.out.print("  ");
		      }
		    }
		    
		   }
		   System.out.println();
		  }
	}

}
