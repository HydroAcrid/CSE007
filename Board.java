/*
Kevin Dotel
11/6/21
CSE 7: HW 8 
This is my TicTacToe board program. 
*/
import java.util.*;
import java.util.Scanner;
public class Board {

    //This is the 2d array that represents the board 
    private String [] [] gameboard = new String [3] [3];
    public Board() {
        int spaces = 1;
        for(int row = 0; row < gameboard.length; row++) {
            for(int col = 0; col < gameboard[row].length; col++) {
                gameboard[row][col] = "" + (spaces++);

            }
        }
    }

    //This prints the tic tac toe board 
    public void printBoard() {
        for (int row = 0; row < gameboard.length; row++) {
            for(int col = 0; col < gameboard[row].length; col++) {
                System.out.print(gameboard[row][col] + " ");
            }
            System.out.println();
        }
    }

    //Precondition: A scanner input is passed into this method in order to check spaces and input validation
    //Postcondition: The input is recognized and then a "X" or an "O" is placed on the Tic Tac Toe board
    public String checkSpace(Scanner myScanner) {
        System.out.println("We are in checkSpace");
        //check if they gave a number 1-9 
        //letter is an error
        boolean buggin = false;
        String intValue = "5";
        
        //Input validation for 0-9
        do {
            int input = 0;
            if(!myScanner.hasNextInt()) {
                System.out.println("You did not enter an integer value. Input an integer between 1-9");
                myScanner.nextLine();
            }
            else {
                input = myScanner.nextInt();
                if(!(input > 0 && input <= 9)) {
                    System.out.println("You did not enter a valid selection. Please input a number between 1 and 9 .");
                    myScanner.nextLine();
                }
                else {
                    intValue = String.valueOf(input);  //Compares value to index on gameboard in order detect whether there is an X or an O there
                    if(intValue.equals(String.valueOf(1))) {
                        if(!(intValue.equals(gameboard[0][0]))) {
                            System.out.println("Invalid selection.");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else if(intValue.equals(String.valueOf(2))) {
                        if(!(intValue.equals(gameboard[0][1]))) {
                            System.out.println("Invalid selection");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else if(intValue.equals(String.valueOf(3))) {
                        if(!(intValue.equals(gameboard[0][2]))) {
                            System.out.println("Invalid selection");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else if(intValue.equals(String.valueOf(4))) {
                        if(!(intValue.equals(gameboard[1][0]))) {
                            System.out.println("Invalid selection");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else if(intValue.equals(String.valueOf(5))) {
                        if(!(intValue.equals(gameboard[1][1]))) {
                            System.out.println("Invalid selection");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else if(intValue.equals(String.valueOf(6))) {
                        if(!(intValue.equals(gameboard[1][2]))) {
                            System.out.println("Invalid selection");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else if(intValue.equals(String.valueOf(7))) {
                        if(!(intValue.equals(gameboard[2][0]))) {
                            System.out.println("Invalid selection");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else if(intValue.equals(String.valueOf(8))) {
                        if(!(intValue.equals(gameboard[2][1]))) {
                            System.out.println("Invalid selection");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else if(intValue.equals(String.valueOf(9))) {
                        if(!(intValue.equals(gameboard[2][2]))) {
                            System.out.println("Invalid selection");
                            myScanner.nextLine();
                        }
                        else {
                            buggin = true;
                        }
                    }
                    else {
                        buggin = true;
                    }

                    //buggin = true;
                }
                
            }

            intValue = String.valueOf(input);
            System.out.println("intvalue is: " + intValue);


        }while(!buggin);

        //check the number that they gave to see if there is an X or O in the position
        //if number == 1 then you look at position board [0][0] and see if there is a 1 (.equals(1)) and if there is tell the user to pick another position
        //if number ==2 then you look at position board [0][1]
        return intValue;
    }

    //Precondition: This method does not require an input to be called. It checks the board to see if there are any wins on the Tic Tac Toe board.
    //Postcondition: If there were no wins on the board, the program continues to run. If a win is detected, the program ends. 
    public boolean checkWin() {
        System.out.println("We are in checkWin");
        
            if(gameboard[0][0].equals(gameboard[1][1]) && gameboard[0][0].equals(gameboard[2][2])) { //locates if the gameboard indexs all have X or O 
                System.out.println("Top left to bottom right diagonal win!");
                if(gameboard[0][0].equals("X")) {  //if else statment to detect whether or not X or O won
                    System.out.println("X has won!");
                }
                else {
                    System.out.println("O has won!");
                }
                return true;
            }
            else if(gameboard[0][2].equals(gameboard[1][1]) && gameboard[0][2].equals(gameboard[2][0])) {
                System.out.println("Top right to bottom left diagonal win!");
                if(gameboard[0][2].equals("X")) {
                    System.out.println("X has won!");
                }
                else {
                    System.out.println("O has won!");
                }
                return true;
            }
            else if(gameboard[0][0].equals(gameboard[1][0]) && gameboard[0][0].equals(gameboard[2][0])) {
                System.out.println("1st column win!");
                if(gameboard[0][0].equals("X")) {
                    System.out.println("X has won!");
                }
                else {
                    System.out.println("O has won!");
                }
                return true;
            }
            else if(gameboard[0][1].equals(gameboard[1][1]) && gameboard[0][1].equals(gameboard[2][1])) {
                System.out.println("2nd column win!");
                if(gameboard[0][1].equals("X")) {
                    System.out.println("X has won!");
                }
                else {
                    System.out.println("O has won!");
                }
                return true;
            }
            else if(gameboard[0][2].equals(gameboard[1][2]) && gameboard[0][2].equals(gameboard[2][2])) {
                System.out.println("3rd column win!");
                if(gameboard[0][2].equals("X")) {
                    System.out.println("X has won!");
                }
                else {
                    System.out.println("O has won!");
                }
                return true;
            }
            else if(gameboard[0][0].equals(gameboard[0][1]) && gameboard[0][0].equals(gameboard[0][2])) {
                System.out.println("1st row win!");
                if(gameboard[0][0].equals("X")) {
                    System.out.println("X has won!");
                }
                else {
                    System.out.println("O has won!");
                }
                return true;
            }
            else if(gameboard[1][0].equals(gameboard[1][1]) && gameboard[1][0].equals(gameboard[1][2])) {
                System.out.println("2nd row win!");
                if(gameboard[1][0].equals("X")) {
                    System.out.println("X has won!");
                }
                else {
                    System.out.println("O has won!");
                }
                return true;
            }
            else if(gameboard[2][0].equals(gameboard[2][1]) && gameboard[2][0].equals(gameboard[2][2])) {
                System.out.println("3rd row win!");
                if(gameboard[2][0].equals("X")) {
                    System.out.println("X has won!");
                }
                else {
                    System.out.println("O has won!");
                }
                return true;
            }
            else {
            return false;
            }
            //check if the symbol in each row and column are the same 
            //check if the symbol is diagonally the same board[0][0] and board[1][1] and board[2][2]
            //check if the same symbol is in each column board[0][0] and board[1][0] and board[2][0]
            //check if the same symbol is in each row board[0][0] and board [0][1] and board[0][2]
    }

    //Precondition: This code grabs position and playercode from play.java in order to decide where an X or an O will be placed.
    //Postcondition: By connecting position with the index of the gameboard, an X or and O is placed. Whether its an X or O is decided on playercode.
    public void changePosition(String position, String playerCode) {
        System.out.println("We are in changePosition");
        
        if(position.equals(String.valueOf(1))) {
            gameboard[0][0] = playerCode;
        }
        else if(position.equals(String.valueOf(2))) {
            gameboard[0][1] = playerCode;
        }
        else if(position.equals(String.valueOf(3))) {
            gameboard[0][2] = playerCode;
        }
        else if(position.equals(String.valueOf(4))) {
            gameboard[1][0] = playerCode;
        }
        else if(position.equals(String.valueOf(5))) { 
            gameboard[1][1] = playerCode;
        }
        else if(position.equals(String.valueOf(6))) {
            gameboard[1][2] = playerCode;
        }
        else if(position.equals(String.valueOf(7))) {
            gameboard[2][0] = playerCode;
        }
        else if(position.equals(String.valueOf(8))) {
            gameboard[2][1] = playerCode;
        }
        else if(position.equals(String.valueOf(9))) {
            gameboard[2][2] = playerCode;
        }
        else {
            System.out.println("this happened");
        }

        
        //if number == 1 then you look at position board [0][0] 
        //place playerCode into board [0][0]
        //if number == 4 place the playerCode in board [1][0]
        //if number == 3 place the playerCode in board [0][2]
    }
    
   
}
