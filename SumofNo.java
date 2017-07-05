package program;

public class SumofNo {
	 public static void print_sums(){
	        int sum = 0 ;
	         for(int i = 1 ; i <= 15 ; i++){
	             for(int j = 1 ; j <= i; j++ ){
	                sum = sum + j ;
	             }
	             System.out.println( sum) ;
	             sum = 0 ;
	         }
	    }
	    public static void main(String[] args)
	    {
	        print_sums() ;
	    }
	}
class oddnum
{
	public static void main(String org[])
	{
	int i;
	for(i=15;i<=45;i++){
	if(i%2!=0)
	{
	System.out.println(i);
	}
	}
	}
	}
