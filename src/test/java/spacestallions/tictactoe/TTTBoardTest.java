package spacestallions.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TTTBoardTest
{
	@Test
	public void testNewBoard() {
		TTTBoard board = new TTTBoard();
		char[][] testBoard1 = {{'X','\0','\0'},{'\0','\0','\0'},{'\0','\0','\0'}};
		assertEquals(testBoard1, board.takeTurn('X', 0, 0));
		char[][] testBoard2 = {{'X','\0','\0'},{'Y','\0','\0'},{'\0','\0','\0'}};
		assertEquals(testBoard2, board.takeTurn('Y',1,0));
	}

	@Test 
	public void testGetNextPlayer() {
		TTTBoard board = new TTTBoard();
		assertEquals('X', board.getNextPlayer());
		char[][] testBoard1 = {{'X','\0','\0'},{'\0','\0','\0'},{'\0','\0','\0'}};
		assertEquals(testBoard1, board.takeTurn('X', 0, 0));
		assertEquals('Y', board.getNextPlayer());
	}

	@Test
	public void testWrongPlayer() {
		TTTBoard board = new TTTBoard();
		char[][] testBoard1 = {{'X','\0','\0'},{'\0','\0','\0'},{'\0','\0','\0'}};
		assertEquals(testBoard1, board.takeTurn('X', 0, 0));
		assertEquals(testBoard1, board.takeTurn('X', 1, 0));
	}
}