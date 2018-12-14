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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Mdp_oublieController extends SampleController implements Initializable { 
	
	@FXML 
	private Button exercice;
	
	@FXML 
	private Button magazine;
	
	@FXML 
	private Button outil;
	
	@FXML 
	private Button profil;
	
	private int stage=1;
	
	@FXML 
	private Label error;
	
	@FXML 
	private Label lb1;
	
	@FXML 
	private Label lb2;
	
	@FXML 
	private Text aide;
	
	@FXML 
	private ImageView redcross;
	
	@FXML 
	private TextField tf1;
	
	@FXML 
	private TextField tf2;
	
	@FXML 
	private Button envoi;
	
	@FXML 
	private Button retour;
	
	@FXML 
	private Pane rootpane;

	
	@FXML 
	private ImageView flags;
	
	@FXML 
	private ImageView home;
		
	@FXML 
    private void ClickedEnvoi(MouseEvent event) throws IOException { 
		if(stage==1) {
			
			if(tf1.getText().isEmpty()) {
				error.setVisible(true);
				redcross.setVisible(true);
			}
			else {
				
				envoi.setText("Valider");
				aide.setText("Saisir le code que vous avez reçu par mail.");
				lb1.setText("Code");
				tf1.setText(null);
				stage=stage+1;
				
			}
			
		}
		else if(stage==2) {
			aide.setVisible(false);
			lb1.setText("Nouveau mot de passe");
			lb1.setLayoutX(148);
			tf1.setText(null);
			lb2.setVisible(true);
			lb2.visibleProperty();
			tf2.setVisible(true);
			tf2.setText(null);
			stage=stage+1;
			
			
		}
		
		else {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Connexion.fxml"));
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			stage.setTitle("Connexion");
			rootpane.getChildren().setAll(root);
		}
		
		
    } 
	
	
	
	
	@FXML 
    private void ClickedTxtField() { 
		redcross.setVisible(false);
		error.setVisible(false);
    }
		
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) { 
	         
	} 
	
}
