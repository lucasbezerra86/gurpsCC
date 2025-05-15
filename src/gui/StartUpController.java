package gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class StartUpController {
	
	@FXML
	Button btNew;
	
	@FXML
	Button btOpen;
	
	@FXML
	Button btQuit;
	
	@FXML
	AnchorPane mvPane;

	public void onBtNewAction() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/gui/MainView.fxml"));
		mvPane.getChildren().setAll(pane);
	}

}
