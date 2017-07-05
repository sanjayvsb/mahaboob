package program;
import java.util.*;
public class ArraySwap {
		public static void main(String[] args) {
			int a=10,b=20,c=30;
			a=a+b+c;
			b=(a-b-c);
			c=(a-b-c);
			a=(a-b-c);
			System.out.println("the swap is"+(a));
			System.out.println("the swap is"+(b));
			System.out.println("the swap is"+(c));
		}
	}

