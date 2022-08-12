package javaProjects;
import java.util.Scanner;

/* 
 * Guesser Game-program will ask the guesser to guess a number and ask the players to guess the number which guessed by guesser
 * Guessing number should between 1 and 10
 * Players should guess between 1 and 10
 * 4 Players are part of this game 
 * Players are given name as player 1 till player player 4 by passing parameter to method*/

class Guesser{
	
	int guesserNum;
	
	public int guessNumber(){

		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guessor kindly guess the number between 1 to 10: ");
		guesserNum=scan.nextInt();
		
		if(guesserNum > 0 && guesserNum <= 10) {
			break ;
		} else
			continue ;
		}
		return guesserNum;
	}
	
}

class Player {
	
	int playerGuessNum;
	
	public int guessNumber(int a) {
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("player "+ a +" kindly guess the number between 1 to 10: ");
		playerGuessNum=scan.nextInt(); 
		
		if(playerGuessNum > 0 && playerGuessNum <= 10) {
			break;
		} else
			continue;
		}
		return playerGuessNum;
	}
}

class umpire {
	int numFromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	int numfromPlayer4;
	
	public void collectNumFromGuessor() {
		Guesser guess = new Guesser();	
		numFromGuesser = guess.guessNumber();
	
	}
	
	public void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		numfromPlayer1 = p1.guessNumber(1);
		numfromPlayer2 = p2.guessNumber(2);
		numfromPlayer3 = p3.guessNumber(3);
		numfromPlayer4 = p4.guessNumber(4);
		}
	
	public void compare() {
		
		if(numFromGuesser ==numfromPlayer1) {
			
			if(numFromGuesser ==numfromPlayer2 && numFromGuesser ==numfromPlayer3  && numFromGuesser ==numfromPlayer4) {
				System.out.println("All four players guessed correctly");
			}else if(numFromGuesser ==numfromPlayer2 && numFromGuesser ==numfromPlayer3) {
				System.out.println("players 1,2 and 3 guessed correctly");	
			}else if(numFromGuesser ==numfromPlayer2) {
				System.out.println("Player 1 and player 2 guessed correctly");	
			}else if(numFromGuesser ==numfromPlayer3) {
				System.out.println("Player 1 and player 3 guessed correctly"); 
			} else if (numFromGuesser ==numfromPlayer4) {
					System.out.println("Player 1 and player 4 guessed correctly");
		    }
			else
			System.out.println("Player 1 won the game");
		}
		else if(numFromGuesser ==numfromPlayer2){
			      if(numFromGuesser ==numfromPlayer3) {
				      System.out.println("Player 2 and 3 won the game");
			      }else if (numFromGuesser ==numfromPlayer4) {
					System.out.println("Player 2 and player 4 guessed correctly");
		    } else
			System.out.println("Player 2 won the game");
		}
		else if(numFromGuesser ==numfromPlayer3){
			 if(numFromGuesser ==numfromPlayer4) {
			      System.out.println("Player 3 and 4 won the game");
		      } else
			System.out.println("Player 3 won the game");
		}
		else if(numFromGuesser ==numfromPlayer4){
			System.out.println("Player 4 won the game");
		}
		else
		{
			System.out.println("Game lost try again");
		}

	} 
}

public class guesserGame {
	public static void main(String args[]) {
		umpire u = new umpire();
		u.collectNumFromGuessor();
		u.collectNumFromPlayer();
		u.compare();

	}

}
