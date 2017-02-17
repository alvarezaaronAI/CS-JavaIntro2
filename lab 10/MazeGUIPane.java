package Application;

import GUIMap.Coordinate;
import GUIMap.StreetMap;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class MazeGUIPane extends BorderPane {
	public final int gameRowSize = 22;
	public final int gameColSize = 22;

	public void guiGame() {
		//create a streetMap
		StreetMap mazeStreetMap = new StreetMap(gameRowSize);
		// Create A Title H Box Layout Children of Main Layout
		HBox titleHLay = new HBox();
		// Create A Label title Children of TitleHLay
		Label title = new Label("Map Of Pamplona");
		titleHLay.getStyleClass().add("title-Fx");
		// add all the children created here to TittleHLay
		titleHLay.setAlignment(Pos.CENTER);
		titleHLay.getChildren().add(title);
		// Create A Button H Box Layout Children of Main Layout
		HBox buttonHLay = new HBox();
		Button buttonRun = new Button("Run");
		buttonRun.setOnAction(e -> {
			// rerunGrid
			buttonReRun();

		});
		// add all the children created here to buttonHLay
		buttonHLay.setAlignment(Pos.CENTER);
		buttonHLay.getChildren().add(buttonRun);
		// Create A Multiplication Table Grid Pane Children of Main Layout
		GridPane mapGP = new GridPane();
		mapGP.setAlignment(Pos.CENTER);
		for (int row = 0; row < gameRowSize; row++) {
			for (int col = 0; col < gameColSize; col++) {
				// create an object
				char block = ' ';
				Coordinate coor = new Coordinate(row, col, block);
				// create a row 0 of nothing
				if (col == 0) {
					Label walls = new Label();
					GridPane.setConstraints(walls, col, row);
					mapGP.getChildren().add(walls);
					walls.getStyleClass().add("sideWalls-Color");
					coor.setBlank('W');
					mazeStreetMap.addToStreetMap(row, col, coor);
				}
				// create walls for the last Col
				if (col == gameColSize - 1) {
					Label walls = new Label();
					GridPane.setConstraints(walls, col, row);
					mapGP.getChildren().add(walls);
					walls.getStyleClass().add("sideWalls-Color");
					coor.setBlank('W');
					mazeStreetMap.addToStreetMap(row, col, coor);
				}
				// create A Start row
				if (row == 0) {
					if (row == 0 && col == 1) {
						Label blockGround = new Label();
						Text text = new Text();
						text.setText("S");
						StackPane twoLabels = new StackPane();
						twoLabels.getChildren().addAll(blockGround, text);
						GridPane.setConstraints(twoLabels, col, row);
						mapGP.getChildren().add(twoLabels);
						blockGround.getStyleClass().add("start-end-ColorG");
						text.getStyleClass().add("start-end-ColorT");
						coor.setBlank('S');
						mazeStreetMap.addToStreetMap(row, col, coor);
						
					} else {
						// this is side walls other then START
						Label walls = new Label();
						GridPane.setConstraints(walls, col, row);
						mapGP.getChildren().add(walls);
						walls.getStyleClass().add("sideWalls-Color");
						coor.setBlank('W');
						mazeStreetMap.addToStreetMap(row, col, coor);
					}
				}
				// create An End row
				if (row == gameRowSize - 1) {
					// this is the end
					if (row == gameRowSize - 1 && col == gameColSize - 2) {
						Label blockGround = new Label();
						Text text = new Text();
						text.setText("E");
						StackPane twoLabels = new StackPane();
						twoLabels.getChildren().addAll(blockGround, text);
						GridPane.setConstraints(twoLabels, col, row);
						mapGP.getChildren().add(twoLabels);
						blockGround.getStyleClass().add("start-end-ColorG");
						text.getStyleClass().add("start-end-ColorT");
						coor.setBlank('E');
						mazeStreetMap.addToStreetMap(row, col, coor);
					} else {
						// these is any other side wall other then the END
						Label walls = new Label();
						GridPane.setConstraints(walls, col, row);
						mapGP.getChildren().add(walls);
						walls.getStyleClass().add("sideWalls-Color");
						coor.setBlank('W');
						mazeStreetMap.addToStreetMap(row, col, coor);

					}
				}
				// create innerBlocks Labels with
				if (row != 0 && col != 0 && row != gameRowSize - 1 && col != gameColSize - 1) {
					int rand = (int) (Math.random() * 5);
					Label innerBlocks = new Label();
					// if its == 4 create a wall
					if (rand == 4) {
						
						GridPane.setConstraints(innerBlocks, col, row);
						mapGP.getChildren().add(innerBlocks);
						innerBlocks.getStyleClass().add("sideWalls-Color");
						coor.setBlank('W');
						mazeStreetMap.addToStreetMap(row, col, coor);
					} else {
						GridPane.setConstraints(innerBlocks, col, row);
						mapGP.getChildren().add(innerBlocks);
						innerBlocks.getStyleClass().add("map-grid-Color");
						coor.setBlank(' ');
						mazeStreetMap.addToStreetMap(row, col, coor);
					}
					final int row1 = row;
					final int col1 = col;
					innerBlocks.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
						Boolean clicked = false;
						@Override
						public void handle(Event event) {
							if (clicked == false) {
								clicked = true;
								if (rand == 4) {
									//updating the COORDINATE AND STREETMAP Char
									coor.setBlank(' ');	
									mazeStreetMap.addToStreetMap(row1, col1, coor);
									mazeStreetMap.toString();
									innerBlocks.getStyleClass().remove("sideWalls-Color");
									innerBlocks.getStyleClass().add("map-grid-Color");

								} else if (rand != 4) {
									coor.setBlank('W');
									mazeStreetMap.addToStreetMap(row1, col1, coor);
									mazeStreetMap.toString();
									innerBlocks.getStyleClass().remove("map-grid-Color");
									innerBlocks.getStyleClass().add("sideWalls-Color");
								}
							}
								else {
									clicked = false;
									if (rand != 4) {
										coor.setBlank(' ');
										mazeStreetMap.addToStreetMap(row1, col1, coor);
										mazeStreetMap.toString();
										innerBlocks.getStyleClass().remove("sideWalls-Color");
										innerBlocks.getStyleClass().add("map-grid-Color");
									} else if (rand == 4) {
										coor.setBlank('W');
										mazeStreetMap.addToStreetMap(row1, col1, coor);
										mazeStreetMap.toString();
										innerBlocks.getStyleClass().remove("map-grid-Color");
										innerBlocks.getStyleClass().add("sideWalls-Color");
									}
								
							}
						}
					});
				}
				// Setting CSS
				// css for Title H Layout
				title.getStyleClass().add("title-Label");
				titleHLay.getStyleClass().add("title-Fx");
				// css For Button
				buttonHLay.getStyleClass().add("button-Fx");
				// css for GridPane
				mapGP.getStyleClass().add("sideWalls-Color");
				// add all the children created previously to BorderPane
				setTop(titleHLay);
				setCenter(mapGP);
				setBottom(buttonHLay);

			}
		}
		//mapGP.setGridLinesVisible(true);
		System.out.println("--------------------------------------------------------");
		System.out.println("This are the new MAP");
		mazeStreetMap.printStreetMap(mazeStreetMap.getStreetMap());
		System.out.println("--------------------------------------------------------");
	}
	
	public int getGameRowSize() {
		return gameRowSize;
	}

	public int getGameColSize() {
		return gameColSize;
	}

	public void buttonReRun() {
		guiGame();
	}
}
