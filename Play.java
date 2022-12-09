/*
Kevin Dotel
11/6/21
CSE 7: HW 8 
This is my TicTacToe board program. 
*/

import java.util.Scanner; 
public class Play {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Board game = new Board();
        game.printBoard();
        boolean noWinner = true; 
        int player = 1;
        String playerCode;
        int plays = 0;  //This is a counter used to detect a tie in the game. It goes up until it reaches 9 as there are only 9 turns in tic tac toe. 

        System.out.println("Welcome to Kevin's Tic Tac Toe Program!");

        while(noWinner && plays != 9) {
            if(player == 1) {
                playerCode = "X";
                System.out.println("Player 1's turn");
                System.out.println("Indicate where to place " + playerCode + " (1-9): ");
                String position = game.checkSpace(myScanner); //get user value 1-9 and no X or O in the user position
                System.out.println("Position value is: " + position);
                game.changePosition(position, playerCode); //put the X on the gameboard where the position
                game.printBoard();
                noWinner = !(game.checkWin());
                
            }
            else {
                playerCode = "O";
                System.out.println("Player 2's turn");
                System.out.println("Indicate where to place " + playerCode + " (1-9): ");
                String position = game.checkSpace(myScanner); //get user value 1-9 and no X or O in the user position
                game.changePosition(position, playerCode); //put the O on the gameboard where the position
                game.printBoard();
                noWinner = !(game.checkWin());
                
            }

            if(player == 1) 
                player = 2;
            else
                player = 1;
            plays++;

            if(plays == 9) {
                System.out.println("Draw! Game over!");
            }
            if(!noWinner) {
                System.out.println("Game over!");
            }
        }
    }
    
}
