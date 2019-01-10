package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	public static String nomJoueur;
	
	@FXML
	private TextField pseudo;


	@FXML
	void pseudo(ActionEvent event) throws IOException {
		nomJoueur = pseudo.getText();
		if (nomJoueur.length() < 16) {
            
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("View2.fxml"));
			Scene scene = new Scene(root);
			Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Window.setScene(scene);
			Window.setResizable(false);
			Window.centerOnScreen();
			Window.show();
		}

	}

}
