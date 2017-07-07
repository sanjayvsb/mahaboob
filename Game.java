package Guvi;
import java.util.*;
public class Game {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int[] coins=new int[n];
			int player1=0;
			int player2=0;
			for(int i=0;i<n;i++){
				coins[i]=in.nextInt();
			}
			for(int i=0;i<n;i++){
				if(i%2==0)
				player1+=coins[i];
			else
				player2+=coins[i];
			}
			if(player1>player2){
				System.out.println("Player1 is win "+player1);
			}
			else if(player2>player1){
				System.out.println("player2 is win "+player2);
				
			}
			else if(player1==player2){
				System.out.println("match tied");
			}
		}

	}


