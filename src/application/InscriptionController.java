package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class InscriptionController implements Initializable { 
	
	@FXML 
	private Button exercice;
	
	@FXML 
	private Button magazine;
	
	@FXML 
	private Button outil;
	
	@FXML 
	private Button profil;
	
	@FXML 
	private Button inscription;
	
	@FXML 
	private Button retour;
	
	@FXML 
	private Pane rootpane;

	
	@FXML 
	private ImageView flags;
	
	@FXML 
	private ImageView home;
	

	@FXML 
    private void ClickedInscription(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Connexion");
		rootpane.getChildren().setAll(root);
		
    }
	
	
	@FXML 
    private void ClickedTest(ActionEvent event) throws IOException { 
		String getButton = ((Button)event.getSource()).getText();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource(getButton + ".fxml"));
	    Node source = (Node) event.getSource();
	    Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle(getButton);
		rootpane.getChildren().setAll(root);
	}
	
	@FXML 
    private void ClickedAccueil(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Accueil.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Accueil");
		rootpane.getChildren().setAll(root);
		
    }
	
	@FXML 
    private void ClickedRetour(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Connexion");
		rootpane.getChildren().setAll(root);
		
    }
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) { 
	         
	} 
	
 
	
	
}
