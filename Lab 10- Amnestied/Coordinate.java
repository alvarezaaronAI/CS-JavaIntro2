package GUIMap;

public class Coordinate {
	private int row,col;
	private char blank;
	public Coordinate(int rowIn, int colIn, char blankIn) {
		super();
		this.row = rowIn;
		this.col = colIn;
		this.blank = blankIn;
	}
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
	@Override
	public String toString() {
		return "<Coordinate row " + row + " col " + col + " is a " + blank + ">";
	}
	
}
