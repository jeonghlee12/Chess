
public class Board
{
	private char[][] board = new char[8][8];
	
	
	public Board() {
		
	}
	
	
	private void fen_to_board(String fen) {
		
	}
	
	public void initializeBoard() {
		fen_to_board("");
	}
	
	public char[][] getBoard() {
		return board;
	}
	
	public static void main(String[] args) {
		Board b = new Board();
		char[][] a = b.getBoard();
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
