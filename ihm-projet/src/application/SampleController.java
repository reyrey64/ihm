package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class SampleController implements Initializable { 
	
	@FXML 
	private Button connexion;

	@FXML 
	private Button retourc;
	
	@FXML 
	private Pane rootpane;
	
	@FXML 
	private Label mdpoublie;
	
	@FXML 
	private Label inscription;
	

	@FXML 
	private ImageView flagsc;
	
	@FXML 
	private ImageView homec;

	private String getButton;
	    

	
	@FXML 
    private void ClickedTest(ActionEvent event) throws IOException { 
		getButton = ((Button)event.getSource()).getText();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource(getButton + ".fxml"));
	    Node source = (Node) event.getSource();
	    Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle(getButton);
		rootpane.getChildren().setAll(root);
	}
		
	@FXML 
    private void ClickedAnimal(ActionEvent event) throws IOException { 
		System.out.println(((Button)event.getSource()).getText());//prints out Click Me
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Animal.fxml"));
		rootpane.getChildren().setAll(root);
		
    }
	
	@FXML 
    private void ClickedFamille() throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Famille.fxml"));
		rootpane.getChildren().setAll(root);
		
    }
	
	@FXML 
    private void ClickedExercice() throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
		rootpane.getChildren().setAll(root);
		
    }
	
	@FXML 
    private void ClickedCountry(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Connexion");
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
	private void ClickedRetour(ActionEvent event) throws IOException {
	Node source = (Node) event.getSource();
	Stage stage = (Stage) source.getScene().getWindow();
	Pane root;
	switch(stage.getTitle()) {
	
	case "Connexion":
		root = (Pane)FXMLLoader.load(getClass().getResource("Accueil.fxml"));
		stage.setTitle("Accueil");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Menu":
		root = (Pane)FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		stage.setTitle("Connexion");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Choix du niveau":
		root = (Pane)FXMLLoader.load(getClass().getResource("Menu.fxml"));
		stage.setTitle("Menu");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Outil":
		root = (Pane)FXMLLoader.load(getClass().getResource("Menu.fxml"));
		stage.setTitle("Menu");
		rootpane.getChildren().setAll(root);
		break;
		
		
	case "Lexique":
		root = (Pane)FXMLLoader.load(getClass().getResource("Outil.fxml"));
		stage.setTitle("Outil");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Famille":
		root = (Pane)FXMLLoader.load(getClass().getResource("Lexique.fxml"));
		stage.setTitle("Lexique");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Animaux":
		root = (Pane)FXMLLoader.load(getClass().getResource("Lexique.fxml"));
		stage.setTitle("Lexique");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Grammaire":
		root = (Pane)FXMLLoader.load(getClass().getResource("Outil.fxml"));
		stage.setTitle("Outil");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Genre":
		root = (Pane)FXMLLoader.load(getClass().getResource("Grammaire.fxml"));
		stage.setTitle("Grammaire");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Quantité":
		root = (Pane)FXMLLoader.load(getClass().getResource("Grammaire.fxml"));
		stage.setTitle("Grammaire");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Magazine":
		root = (Pane)FXMLLoader.load(getClass().getResource("Menu.fxml"));
		stage.setTitle("Menu");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Magazines":
		root = (Pane)FXMLLoader.load(getClass().getResource("Magazine.fxml"));
		stage.setTitle("Magazine");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Exercices":
		root = (Pane)FXMLLoader.load(getClass().getResource("Exos_niv.fxml"));
		stage.setTitle("Choix du niveau");
		rootpane.getChildren().setAll(root);
		break;
		
	case "QCM":
		root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
		stage.setTitle("Exercices");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Texte a trou":
		root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
		stage.setTitle("Exercices");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Traduction":
		root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
		stage.setTitle("Exercices");
		rootpane.getChildren().setAll(root);
		break;
		
	case "Compréhension Oral":
		root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
		stage.setTitle("Exercices");
		rootpane.getChildren().setAll(root);
		break;
		
		
		
		
		
		
		
	}
}
		
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) { 

	} 
	
 
	
	
}