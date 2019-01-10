package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("View1.fxml"));
			primaryStage.setTitle("ShiFuMi Vs Samir");
			primaryStage.setScene(new Scene(root));
			primaryStage.sizeToScene();
			primaryStage.setResizable(false);
			primaryStage.getIcons().add(new Image("File:logo.png"));
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
