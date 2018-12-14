package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MagazineController extends SampleController implements Initializable { 
	
	
	@FXML 
	private Button exercice;
	
	@FXML 
	private Button magazine;
	
	@FXML 
	private Button outil;
	
	@FXML 
	private Button profil;
	
	@FXML 
	private Button retour;
	
	@FXML 
	private Pane rootpane;
	
	@FXML 
	private Button deco;
	
	@FXML 
	private Button right1;
	
	@FXML 
	private Button left2;
	
	@FXML 
	private Button right2;
	
	@FXML 
	private Label nb;
	

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
    private void ClickedLeft2() throws IOException { 
		
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Magazines.fxml"));
			rootpane.getChildren().setAll(root);
		
    }
	
	
	@FXML 
    private void ClickedRight1() throws IOException { 
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Magazines2.fxml"));
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
    private void ClickedMagazine() throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Magazines.fxml"));
		rootpane.getChildren().setAll(root);
		
    }
	
	@FXML 
    private void MouseOverExercice() { 
       exercice.setCursor(javafx.scene.Cursor.HAND);   
    } 
	
	@FXML 
    private void MouseOverMagazine() { 
       magazine.setCursor(javafx.scene.Cursor.HAND);   
    } 
	
	@FXML 
    private void MouseOverOutil() { 
       outil.setCursor(javafx.scene.Cursor.HAND);   
    } 
	
	@FXML 
    private void MouseOverProfil() { 
       profil.setCursor(javafx.scene.Cursor.HAND);   
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