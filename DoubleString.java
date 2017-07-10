package Guvi;

public class DoubleString {
	public static void main(String[] args) {
		String s="aabab";
		for(int i=0;i<s.length();i++)
		{
		String str=s.substring(0,i);
		String str1=s.substring(i+1);
		String g=str+str1;
		String d=g.substring(0,g.length()/2);
		String w=g.substring(g.length()/2);
		if(d.equals(w))
		{
			System.out.println("its repeating values"+d+w);
		}
		else
		{
			System.out.println("non repeating");
		}
		
	}
	}
}
