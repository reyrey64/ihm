package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MenuController extends SampleController implements Initializable { 

	@FXML 
	private Button exercice;
	
	@FXML 
	private Button magazine;
	
	@FXML 
	private Button outil;
	
	@FXML 
	private Button profil;
	
	@FXML 
	private Button magazines;
	
	@FXML 
	private Button retour;
	
	@FXML 
	private Pane rootpane;
	
	@FXML 
	private Button atelier;
	
	@FXML 
	private Button outils;
	
	
	@FXML 
	private Button deco;
	

	@FXML 
	private ImageView flags;
	
	@FXML 
	private ImageView home;
	
	
	@FXML 
    private void ClickedDeco(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Connexion");
		rootpane.getChildren().setAll(root);
		
    }

	
	@FXML 
    private void ClickedMagazines(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Magazine.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Magazine");
		rootpane.getChildren().setAll(root);
		
    } 
	
	
	@FXML 
    private void ClickedAtelier(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Exos_niv.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Choix du niveau");
		rootpane.getChildren().setAll(root);
		
    } 
	
    
	
	
	
	@FXML 
    private void ClickedOutil(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Outil.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Outil");
		rootpane.getChildren().setAll(root);
		
    }
	

	@FXML 
    private void ClickedProfil(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Outil.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Outil");
		rootpane.getChildren().setAll(root);
		
    }
	
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) { 
	         
	} 
	
 
	
	
}
