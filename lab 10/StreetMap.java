package GUIMap;

import java.util.Arrays;

public class StreetMap {
	private Coordinate[][] streetMap;

	public StreetMap(int size2DArray) {
		this.streetMap = new Coordinate[size2DArray][size2DArray];
	}

	public void printStreetMap(Coordinate[][] size2DArray) {
		for (int row = 0; row < size2DArray.length; row++) {
			for (int col = 0; col < size2DArray[0].length; col++) {
				System.out.print(size2DArray[row][col]);
			}
			System.out.println();
		}
	}

	public Coordinate[][] getStreetMap() {
		return streetMap;
	}

	public void setStreetMap(Coordinate[][] map) {
		this.streetMap = map;
	}
	
	public void addToStreetMap(int rowLocation, int columLocation, Coordinate theObjectYouWantToAdd) {
		for (int row = 0; row < streetMap.length; row++) {
			for (int col = 0; col < streetMap[0].length; col++) {
				if (row == rowLocation && col == columLocation) {
					streetMap[row][col] = theObjectYouWantToAdd;
				}
			}
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " Coord" + "]";
		
	}

}
