package Lab9;

public class Coordinate {
	/*instances*/
	private int row,col;
	private char blank;
	/*constructor*/
	public Coordinate(int rowIn, int colIn, char blankIn) {
		super();
		this.row = rowIn;
		this.col = colIn;
		this.blank =blankIn;
	}
	/*getters and setters*/
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public char getBlank() {
		return blank;
	}
	public void setBlank(char blank) {
		this.blank = blank;
	}
	
	
	
}
