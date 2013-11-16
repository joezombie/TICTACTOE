
package spacestallions.tictactoe;

public class TicTacToe
{
	public String greet(){
		return "Welcome to TicTacToe!";
	}
	public static void main (String[] args)
	{
		System.out.println ("Template class");
		TicTacToe str = new TicTacToe();
		System.out.println(str.greet());
	}
}
