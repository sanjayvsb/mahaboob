package Guvi;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

public class RemoveDup {
	  public static void main(String[] args) {
		    char [] a = s.toCharArray();
		    int len =a.length; 
		    for (int i=0;i<len;i++)
		    {
		        for (int j = i+1; j<len;j++)
		        {
		            if(a[i]==a[j])
		            {
		                int test =j;
		                for(int k=j+1; k<len ; k++)
		                {
		                    a[test] = a[k];
		                    test++;
		                }
		                len--;
		                j--;
		            }
		        }
		    }
		    System.out.println(String.copyValueOf(a).substring(0,len));
		}

		public static void main1(String[] args) {
			DuplicateName d=new DuplicateName();
			d.remove("ssarritthhaa");

		}
	    }
