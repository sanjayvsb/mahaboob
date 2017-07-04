package program;

public class PrimenoIntervals {
	  public static void main(String[] args) {
	        int i;
	        int j;
	        int Prime;
	        int n;
	        System.out.println("All Prime Numbers Between 1 to 100");
	  for (i = 1; i <= 10; i++) {
	            Prime = 0;
	            for (j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                  Prime = 1;
	                    break;
	                }
	            }
	 
	            if (Prime == 0)
	                System.out.print(i + " ");
	        }
	 
	    }
	}

