package TICTACTOE;
import java.util.*;

import static TICTACTOE.TicTacToe.board;

public class HumanPlayer{
    String name;
    char mark;
    HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }
    public void makeMove() {
        Scanner tempScan = new Scanner(System.in);
        int row;
        int col;
        do{
            System.out.println("Enter The Row and Column");
             row = tempScan.nextInt();
             col = tempScan.nextInt();
        } while(!isValid(row, col));

        TicTacToe.placeMark(row, col, mark);
    }
    public boolean isValid(int row, int col) {
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if(board[row][col] == ' ') {
                return true;
            }
        }
        return  false;
    }

}
