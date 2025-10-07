package TICTACTOE;

public class HumanPlayer{
    String name;
    char mark;
    HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }
    public void makeMove() {
        System.out.println("");
    }
    public boolean isValid(int row, int col) {
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if(TicTacToe.board[row][col] == ' ') {
                return true;
            }
        }
        return  false;
    }
}
