/***********************************************
 * Purpose : Program is written for creating a Tic Tac Toe Game
 *
 * @author Sanketh Chigurupalli
 * @version 1.0
 * @since 23-04-2021
 *
 ***********************************************/

package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    /*
     * UC - 1
     * prints the board
     */
     static void showBoard() {
        System.out.println("    |   |    ");
        System.out.println("*" + "[ ]" + "|" + "[ ]" + "|" + "[ ]" + "*");
        System.out.println("----|---|----");
        System.out.println("*" + "[ ]" + "|" + "[ ]" + "|" + "[ ]" + "*");
        System.out.println("----|---|----");
        System.out.println("*" + "[ ]" + "|" + "[ ]" + "|" + "[ ]" + "*");
        System.out.println("    |   |    ");
    }

    /*
     * UC - 2
     * Determines computer choice and user choice
     */
    static String playerChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Choice Mark 'X' or 'O' : ");
        String userInput = input.next();
        System.out.println("Player choice = " + userInput);
        if(userInput.equals("X")){
            String compChoice = "O";
            System.out.println("Computer Choice = " + compChoice);
            return compChoice;
        } else {
            String compChoice = "X";
            System.out.println("Computer Choice = " + compChoice);
            return compChoice;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        playerChoice();
        showBoard();
    }
}
