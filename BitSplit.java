package Guvi;
import java.util.Scanner;
public class BitSplit {
		public static void main(String[] args) {
			int size = 2;     
		     generateTable(0, size, new int[size]);
		     private static void generateTable(int index, int size1, int[] current) {
		         if (index == size1) {
		             for (int a = 0; a < size1; a++) {
		                 System.out.print(current[a] + " ");
		             }
		             System.out.println();
		         } else {
		             for (int a = 0; a < 2; a++) {
		                 current[index] = a;
		                 generateTable(index + 1, size1, current);
		             }
		         }
		 }
		}

	

