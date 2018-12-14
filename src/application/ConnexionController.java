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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class ConnexionController extends SampleController implements Initializable { 
	
	@FXML 
	private Image image;
	
	@FXML 
	private int flagcount=1;
	
	@FXML 
	private int swipe=1;
	
	@FXML 
	private TextField tf1;
	
	@FXML 
	private TextField tf2;
	
	@FXML 
	private Label error;
	
	@FXML 
	private ImageView redcross1;
	
	@FXML 
	private ImageView redcross2;
	
	
	@FXML 
	private Button exercice;
	
	@FXML 
	private Button magazine;
	
	@FXML 
	private Button outil;
	
	@FXML 
	private Button profil;
	
	@FXML 
	private Button connexion;
	
	@FXML 
	private Button retour;
	
	@FXML 
	private Pane rootpane;
	
	@FXML 
	private Label mdpoublie;
	
	@FXML 
	private Label inscription;
	

	@FXML 
	private ImageView flags;
	
	@FXML 
	private ImageView flags2;
	
	@FXML 
	private ImageView flags3;
	
	@FXML 
	private ImageView flags4;
	
	@FXML 
	private ImageView flags5;
	
	@FXML 
	private ImageView flags6;
	
	@FXML 
	private ImageView home;
	
	
	@FXML 
    private void ClickedTxtField() { 
		redcross1.setVisible(false);
		redcross2.setVisible(false);
		error.setVisible(false);
    }
	
	

	@FXML 
    private void ClickedConnection(MouseEvent event) throws IOException { 
		
		if(tf1.getText().isEmpty() || tf2.getText().isEmpty())
		{
			redcross1.setVisible(true);
			redcross2.setVisible(true);
			error.setVisible(true);
		}
		else {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Menu.fxml"));
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			stage.setTitle("Menu");
			rootpane.getChildren().setAll(root);
		}
    } 
		
	@FXML 
    private void ClickedInscription(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Inscription.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Inscription");
		rootpane.getChildren().setAll(root);
		
    }
	
	@FXML 
    private void ClickedMdpoublie(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Mdp_oublie.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Mot de passe oublié");
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
	
	@FXML 
    private void ClickedFlag(MouseEvent event) throws IOException { 
		if(flagcount==1) {
			flags2.setVisible(true);
			flags3.setVisible(true);
			flags4.setVisible(true);
			flags5.setVisible(true);
			flags6.setVisible(true);
			flagcount=flagcount+1;
		}
		else {
			flags2.setVisible(false);
			flags3.setVisible(false);
			flags4.setVisible(false);
			flags5.setVisible(false);
			flags6.setVisible(false);
			image = flags.getImage();
			flags.setImage(flags6.getImage());
			flags6.setImage(image);
			if(swipe==1)
			{flags6.setLayoutY(50);
			 swipe=swipe+1;}
			else {
				flags6.setLayoutY(43);
				swipe=swipe-1;
				
			}
			flagcount=flagcount-1;
		}
			
	}
				
	@Override 
	public void initialize(URL location, ResourceBundle resources) { 
	         
	} 
	
 
	
	
}