package program;
import java.io.*;
public class ArrayofN {
	  private static final int MAX = 100000;
	  static void printpairs(int arr[],int sum)
	  {
	   
	    boolean[] binmap = new boolean[MAX];
	    
	    for (int i=0; i<arr.length; ++i)
	    {
	      int[] arr2 = null;
		int temp = sum-arr2[i];
	      if (temp>=0 && binmap[temp])
	      {
	        System.out.println("Pair with given sum " +
	        sum + " is (" + arr2[i] +
	        ", "+temp+")");
	      }
	      binmap[arr2[i]] = true;
	    }
	  }
	  public static void main (String[] args)
	  {
	    int A[] = {1, 4, 45, 6, 10, 8};
	    int n = 16;
	    printpairs(A,n);
	  }
	}

