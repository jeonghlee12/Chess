
public class Board
{
	private char[][] board = new char[8][8];
	
	/**
	 * Takes the piece placement portion of a FEN representation string
	 * and replicates the board.
	 * @param fen The FEN string with only the piece placement information.
	 */
	private void fenstring_to_board(String fen) {
		String[] ranks = fen.split("/");
		for (int i = 0; i < 8; i++) {
			String rank = ranks[i];
			int files = 0;
			for (int j = 0; j < rank.length(); j++) {
				char val = rank.charAt(j);
				
				if (Character.isDigit(val)) {
					int valInt = Character.getNumericValue(val);
					for (int k = 0; k < valInt; k++) {
						board[i][files + k] = 0;
					}
					files = files + valInt;
				}
				else {
					board[i][files++] = val;
				}
			}
		}
	}
	
	public void initializeBoard() {
		fenstring_to_board("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR");
	}
	
	public char[][] getBoard() {
		return board;
	}
	
	public static void main(String[] args) {
		Board b = new Board();
		b.initializeBoard();
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
