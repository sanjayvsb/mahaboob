package Guvi;
import java.util.*;
public class SmallestNum {
		public static void main (String[] args) {
		    int sum=0,pro=1,max=1;
		    String s=null;
			Scanner in=new Scanner(System.in);
			String inp=in.nextLine();
		    int size=inp.length();
		    if(size==2)
		    {
		        s="99";
		    }else if(size==3)
		    {
		        s="999";
		    }else if(size==4)
		    {
		        s="9999";
		    }else if(size==5)
		    {
		        s="99999";
		    }
		    else if(size==6)
		    {
		        s="999999";
		    }
		    else
		    {
		        s="9999999";
		    }
		    if(s.equals(inp))
		    System.out.println("Not possible");
		    else
		    System.out.println(s);
		}
}
