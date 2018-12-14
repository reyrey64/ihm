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


public class Exos_nivController extends SampleController implements Initializable { 
	
	@FXML 
	private Button exercice;
	
	@FXML 
	private Button magazine;
	
	@FXML 
	private Button outil;
	
	@FXML 
	private Button profil;
	
	
	@FXML 
	private Button A1;
	
	@FXML 
	private Button A2;
	
	@FXML 
	private Button B1;
	
	@FXML 
	private Button B2;
	
	@FXML 
	private Button C1;
	
	@FXML 
	private Button C2;
	
	@FXML 
	private Button retour;
	
	@FXML 
	private Pane rootpane;
		
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
    private void ClickedNiv(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Exercices");
		rootpane.getChildren().setAll(root);
		
    } 
	
	@FXML 
    private void ClickedExercice(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Exos_niv.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Choix du niveau");
		rootpane.getChildren().setAll(root);
		
    }
	
	@FXML 
    private void ClickedMagazine(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Magazines.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Magazines");
		rootpane.getChildren().setAll(root);
		
    }
	
	
	
	
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) { 
	         
	} 
	
 
	
	
}
