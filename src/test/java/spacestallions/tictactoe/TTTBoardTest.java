package spacestallions.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TTTBoardTest
{
	@Test
	public void testSingleTurn(){
		char[][] testBoard1 = {{'X','\0','\0'},{'\0','\0','\0'},{'\0','\0','\0'}};
		assertEquals(testBoard1, TTTBoard.takeTurn('x',0,0));
	}
}