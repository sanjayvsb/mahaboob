package Guvi;

import java.util.Arrays;

public class PosorNeg {
		public static void main(String[] args) {
        int array1[]= {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
		    System.out.println("Array 1 :");
		    Arrays.sort(array1);
		    for (int positive: array1) {
		        if (positive >= -1)
		            System.out.println("Positive numbers :" + positive+ "\t");
		        }
		        System.out.println();
		        System.out.println("Array 2 :");

		        for (int negative: array1) {
		            if (negative >= -1) {

		            }else{ System.out.println("Negative numbers :" +negative);
		            }
		        } 
		        System.out.println();

		        for (int i = 0; i < array1.length -1; i++) { 
		             if (array1[i + 1 ] == array1[i]) {
		                 System.out.println("Duplicate element found :" + array1[i]);
		                 i = i + 1;
		             }          
		        }
		    }           
		}

