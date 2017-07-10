package Guvi;
public class CharRemove {
	public static void main(String[] args) {	
	String str="malaygalam";
	int m=0;	
	for(int i=0;i<str.length();i++)
	{
		String str1=str.substring(0,i);
		String str2=str.substring(i+1);
		String dupstr=str1+str2;
		StringBuffer s=new StringBuffer(dupstr);
		s.reverse();
		
		if(s.toString().equals(dupstr))
		{
			System.out.println("the string is palindrome when "+str.charAt(i+1)+" is removed");
            m=1;
			break;
		}
	}
	if(m==0)
	{
		System.out.println("the given string is not a palindrome while removing any single character");
	}
	}
}

