package Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		MazeGUIPane maze1 = new MazeGUIPane();
		Scene scene1 = new Scene(maze1,900,900);
		primaryStage.setScene(scene1);
		maze1.getStylesheets().add("Application/MazeGUIPane.css");
		primaryStage.show();
		maze1.guiGame();
	}
}
