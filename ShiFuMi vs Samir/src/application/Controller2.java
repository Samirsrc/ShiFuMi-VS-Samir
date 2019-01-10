package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller2 implements Initializable {
	@FXML
	private Button btn;

	@FXML
	private Button pierre;

	@FXML
	private Button feuille;

	@FXML
	private Button Ciseaux;

	@FXML
	private Button pseudo;

	@FXML
	private Button rejouer;

	@FXML
	private Label nomJoueur;

	@FXML
	private Label msgJoueur;

	@FXML
	private Label msgSamir;

	@FXML
	private Label scoreJoueur;

	@FXML
	private Label scoreSamir;

	@FXML
	private ImageView cj;

	@FXML
	private ImageView fj;

	@FXML
	private ImageView pj;

	@FXML
	private ImageView cs;

	@FXML
	private ImageView fs;

	@FXML
	private ImageView ps;

	int userClic;
	int ordiClic;
	int ss = 0;
	int js = 0;

	@FXML
	void goCiseaux(ActionEvent event) throws IOException {
		userClic = 3;

		game();
		if (js == 3) {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("View3.fxml"));
			Scene scene = new Scene(root);
			Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Window.setScene(scene);
			Window.setResizable(false);
			Window.centerOnScreen();
			Window.show();
		} else if (ss == 3) {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("View4.fxml"));
			Scene scene = new Scene(root);
			Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Window.setScene(scene);
			Window.setResizable(false);
			Window.centerOnScreen();
			Window.show();

		}
	}

	@FXML
	void goFeuille(ActionEvent event) throws IOException {
		userClic = 1;

		game();
		if (js == 3) {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("View3.fxml"));
			Scene scene = new Scene(root);
			Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Window.setScene(scene);
			Window.setResizable(false);
			Window.centerOnScreen();
			Window.show();
		} else if (ss == 3) {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("View4.fxml"));
			Scene scene = new Scene(root);
			Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Window.setScene(scene);
			Window.setResizable(false);
			Window.centerOnScreen();
			Window.show();

		}
	}

	@FXML
	void goPierre(ActionEvent event) throws IOException {

		userClic = 2;

		game();
		if (js == 3) {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("View3.fxml"));
			Scene scene = new Scene(root);
			Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Window.setScene(scene);
			Window.setResizable(false);
			Window.centerOnScreen();
			Window.show();
		} else if (ss == 3) {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("View4.fxml"));
			Scene scene = new Scene(root);
			Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Window.setScene(scene);
			Window.setResizable(false);
			Window.centerOnScreen();
			Window.show();

		}
	}

	@FXML
	void pseudo(ActionEvent event) throws IOException {
		AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("View1.fxml"));
		Scene scene = new Scene(root);
		Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Window.setScene(scene);
		Window.setResizable(false);
		Window.centerOnScreen();
		Window.show();

	}

	@FXML
	void rejouer(ActionEvent event) {
		scoreJoueur.setText("0");
		scoreSamir.setText("0");
		msgJoueur.setText("...");
		msgSamir.setText("go !");
		ss = 0;
		js = 0;

	}

	@FXML
	void gg(ActionEvent event) {

	}

	// 1 feuille 2 pierre 3 ciseaux
	int quiwin(int ordi, int user) {
		int r = 0;
		if (ordi == 1 && user == 1) {
			r = 0;
		}
		if (ordi == 2 && user == 2) {
			r = 0;
		}
		if (ordi == 3 && user == 3) {
			r = 0;
		}
		// 1
		if (ordi == 1 && user == 2) {
			r = 1;
		}
		if (ordi == 1 && user == 3) {
			r = 2;
		}
		if (ordi == 1 && user == 3) {
			r = 2;
		}
		// 2
		if (ordi == 2 && user == 1) {
			r = 2;
		}

		if (ordi == 2 && user == 3) {
			r = 1;
		}
		// 3
		if (ordi == 3 && user == 1) {
			r = 1;
		}
		if (ordi == 3 && user == 2) {
			r = 2;
		}
		return r;
	}

	void game() throws IOException {
		imageReset();

		ordiClic = (int) (Math.random() * 3 + 1);

		if (quiwin(ordiClic, userClic) == 2) {
			js++;
			scoreJoueur.setText(String.valueOf(js));
			msgSamir.setText("Non !");
			msgJoueur.setText("Lol :)");

		} else if (quiwin(ordiClic, userClic) == 1) {
			ss++;
			scoreSamir.setText(String.valueOf(ss));
			msgSamir.setText("Facile !");
			msgJoueur.setText("Grrr");

		}
		if (quiwin(ordiClic, userClic) == 0) {
			msgSamir.setText("...");
			msgJoueur.setText("...");
		}
		image();

	}

	void image() {
		switch (ordiClic) {
		case 1:
			fs.setOpacity(1);
			break;
		case 2:
			ps.setOpacity(1);
			break;
		case 3:
			cs.setOpacity(1);
			break;
		}
		switch (userClic) {
		case 1:
			fj.setOpacity(1);
			break;
		case 2:
			pj.setOpacity(1);
			break;
		case 3:
			cj.setOpacity(1);
			break;
		}
	}

	void imageReset() {
		fs.setOpacity(0);
		ps.setOpacity(0);
		cs.setOpacity(0);
		fj.setOpacity(0);
		pj.setOpacity(0);
		cj.setOpacity(0);

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nomJoueur.setAlignment(Pos.CENTER);
		msgJoueur.setAlignment(Pos.CENTER);
		msgSamir.setAlignment(Pos.CENTER);
		nomJoueur.setText(Controller.nomJoueur);
		scoreJoueur.setText("0");
		scoreSamir.setText("0");
		msgJoueur.setText("...");
		msgSamir.setText("go !");
	}

}
