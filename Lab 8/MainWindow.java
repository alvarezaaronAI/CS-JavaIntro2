package Lab8;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow extends Application {
	Stage window;
	VBox mainVLay;
	HBox titleHLay, buttonHLay;
	Button answerBInput;
	GridPane mutlGPLay;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Replacing Primary Stage
		window = primaryStage;
		// Create A Main Layout V Box Parent
		mainVLay = new VBox();
		// Create A Title H Box Layout Children of Main Layout
		titleHLay = new HBox();
		// Create A Label title that goes in the middle, Children of TitleHLay
		Label title = new Label("Reverse Multiplication Table");
		// add all the children created here to TittleHLay
		titleHLay.setAlignment(Pos.CENTER);
		titleHLay.getChildren().add(title);
		// Create A Button H Box Layout Children of Main Layout
		buttonHLay = new HBox();
		// create a Label Info For the Box, Children Of ButtonHLay
		Label buttonInfo = new Label("Enter Answer: ");
		// create a TextField where the answer is going to go, Children of
		// ButtonHLay
		TextField answerText = new TextField();
		answerText.setPromptText("Enter Number");
		// Create a Button answer , Children of buttonHLay
		answerBInput = new Button("Find Problems");
		answerBInput.setOnAction(e -> {
			int answer = Integer.parseInt(answerText.getText());
			findAnswerBox(answer);
		});
		// add all the children created here to buttonHLay
		buttonHLay.setAlignment(Pos.CENTER);
		buttonHLay.getChildren().addAll(buttonInfo, answerText, answerBInput);
		// Create A Multiplication Table Grid Pane Children of Main Layout
		mutlGPLay = new GridPane();
		for (int row = 0; row < 11; row++) {
			for (int col = 0; col < 11; col++) {
				// prints only the first col
				if (row == 0) {
					Label colString = new Label(" " + col);
					GridPane.setConstraints(colString, col, row);
					colString.getStyleClass().add("grid-backgroundColor");
					mutlGPLay.getChildren().add(colString);
					colString.getStyleClass().add("Grid-red");
				}
				// print only the first row
				if (col == 0 && row != 0) {
					Label rowString = new Label(" " + row);
					GridPane.setConstraints(rowString, col, row);
					rowString.getStyleClass().add("grid-backgroundColor");
					mutlGPLay.getChildren().add(rowString);
					rowString.getStyleClass().add("Grid-red");
				}
				// prints only the the rest of multiplication table
				if (row != 0 && col != 0) {
					Label multOnly = new Label("   " + row + "*" + col);
					GridPane.setConstraints(multOnly, col, row);
					multOnly.getStyleClass().add("grid-backgroundColor2");
					mutlGPLay.getChildren().add(multOnly);
					multOnly.getStyleClass().add("Grid-lightblue");
				}
			}

		}
		// Setting CSS
		// css for Title H Layout
		titleHLay.getStyleClass().add("Title");
		// css For Button
		buttonHLay.getStyleClass().add("Button");
		// css for GridPane
		mutlGPLay.getStyleClass().add("Grid");
		// add all the children created previously.
		mainVLay.getChildren().addAll(titleHLay, buttonHLay, mutlGPLay);
		// Create A Scene Containing Main Layout
		mutlGPLay.setGridLinesVisible(true);
		Scene scene1 = new Scene(mainVLay);
		scene1.getStylesheets().add("Lab8/StyleWindow.css");
		window.setScene(scene1);
		window.show();
	}

	private void findAnswerBox(int answer) {
		for (int row = 0; row < 11; row++) {
			for (int col = 0; col < 11; col++) {
				// prints only the the rest of multiplication table
				if (row != 0 && col != 0) {
					int multiplication = row * col;
					if (multiplication == answer) {
						Label multOnly = new Label("   " + row + "*" + col);
						GridPane.setConstraints(multOnly, col, row);
						multOnly.getStyleClass().add("grid-backgroundColor2");
						mutlGPLay.getChildren().add(multOnly);
						multOnly.getStyleClass().add("text-fieldMul");
					} else {
						Label multOnly = new Label("   " + row + "*" + col);
						GridPane.setConstraints(multOnly, col, row);
						multOnly.getStyleClass().add("grid-backgroundDele");
						mutlGPLay.getChildren().add(multOnly);
					}
				}
			}

		}

	}
}
