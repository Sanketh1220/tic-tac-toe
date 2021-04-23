/***********************************************
 * Purpose : Program is written for creating a Tic Tac Toe Game
 *
 * @author Sanketh Chigurupalli
 * @version 1.0
 * @since 23-04-2021
 *
 ***********************************************/

package com.tictactoe;
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

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        showBoard();
    }
}
