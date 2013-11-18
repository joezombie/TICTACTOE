package spacestallions.tictactoe;

public class TTTBoard
{
	public char[][] takeTurn(char player, int x, int y) {
		if (nextPlayer == player) {
			board[x][y] = player;
		}
		
		if (nextPlayer == 'X'){
			nextPlayer = 'Y';
		} else {
			nextPlayer = 'X';
		}
		return board;
	}

	public char getNextPlayer() {
		return nextPlayer;
	}
	/*
	TicTacToe board	
	Starting from top left is [0][0] and bottom right is [2][2]
	*/
	private char[][] board = {{'\0','\0','\0'},{'\0','\0','\0'},{'\0','\0','\0'}};
	private char nextPlayer = 'X';
}