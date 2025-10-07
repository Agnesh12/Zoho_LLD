package TICTACTOE;

public class TicTacToe {
    static char[][] board;
    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }
   public void initBoard() {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }
    }
    public void displayBoard() {
        System.out.println("------------");
        for(int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for(int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("------------");
        }

    }
    public void placeMark(int row, int col, char mark) {
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = mark;
        }
        else {
            System.out.println("Invalid Position");
        }
    }
    public boolean checkColWin() {
        for(int col = 0; col <= 2; col++) {
            if(board[0][col] != ' ' && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }
        }
        return false;
    }
    public boolean checkRowWin() {
        for(int row = 0; row <= 2; row++) {
            if(board[row][0] != ' ' && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }
        }
        return false;
    }
    public boolean checkDiagonalWin() {
        if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }
}
