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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class ProfilController extends SampleController implements Initializable {

	
	
	@FXML 
	private ComboBox<String> langueChoice = new ComboBox();
	
	@FXML 
	private ComboBox<String> levelChoice = new ComboBox();
    
	@FXML 
	private ProgressBar progress1;
	
	@FXML 
	private ProgressBar progress2;

	@FXML 
	private ProgressBar progress3;

	@FXML 
	private ProgressBar progress4;

	@FXML 
	private ProgressBar progress5;

	@FXML 
	private ProgressBar progress6;
	
	@FXML 
	private Text pourc1;
	
	@FXML 
	private Text pourc2;
	
	@FXML 
	private Text pourc3;
	
	@FXML 
	private Text pourc4;
	
	@FXML 
	private Text pourc5;
	
	@FXML 
	private Text pourc6;
	
	private void updateProgress(double prog1, double prog2, double prog3, double prog4, double prog5, double prog6, String pour1, String pour2, String pour3, String pour4, String pour5, String pour6) {
		progress1.setProgress(prog1);
		progress2.setProgress(prog2);
		progress3.setProgress(prog3);
		progress4.setProgress(prog4);
		progress5.setProgress(prog5);
		progress6.setProgress(prog6);
		pourc1.setText(pour1);
		pourc2.setText(pour2);
		pourc3.setText(pour3);
		pourc4.setText(pour4);
		pourc5.setText(pour5);
		pourc6.setText(pour6);
	}
	
	@FXML 
    private void ClickedLevelChoice(ActionEvent event) throws IOException { 
	String level = levelChoice.getSelectionModel().getSelectedItem().toString();
	String langue = langueChoice.getSelectionModel().getSelectedItem().toString();
	switch(langue) {
		case "Anglais": 
			switch(level) {
				case "A1(Débutant)":
					updateProgress(1.0, 1.0, 0.5, 0.5, 0.0, 0.0, "100%", "100%","50%", "50%", "0%", "0%");
					break;
				case "A2(Elémentaire)":
					updateProgress(1.0, 1.0, 0.25, 0.25, 0.0, 0.0, "100%", "100%","25%", "25%", "0%", "0%");
					break;
				case "B1(Pré-Intermediaire)":
					updateProgress(1.0, 1.0, 0.5, 0.0, 0.0, 0.0, "100%", "100%","50%", "0%", "0%", "0%");
					break;
				case "B2(Intermédiaire)":
					updateProgress(1.0, 1.0, 0.0, 0.0, 0.0, 0.0, "100%", "100%","0%", "0%", "0%", "0%");
					break;
				case "C1(Autonome)":
					updateProgress(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "0%", "0%","0%", "0%", "0%", "0%");
					break;
				case "C2(Maîtrise)":
					updateProgress(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "0%", "0%","0%", "0%", "0%", "0%");
					break;
			}
			break;
		case "Allemand": 
			switch(level) {
			case "A1(Débutant)":
				updateProgress(1.0, 0.8, 0.5, 0.0, 0.0, 0.0, "100%", "80%","50%", "0%", "0%", "0%");
				break;
			case "A2(Elémentaire)":
				updateProgress(1.0, 0.0, 0.5, 0.5, 0.0, 0.0, "100%", "0%","50%", "50%", "0%", "0%");
				break;
			case "B1(Pré-Intermediaire)":
				updateProgress(1.0, 0.25, 0.25, 0.5, 0.0, 0.0, "100%", "25%","25%", "50%", "0%", "0%");
				break;
			case "B2(Intermédiaire)":
				updateProgress(1.0, 0.0, 0.0, 0.0, 0.0, 0.0, "100%", "0%","0%", "0%", "0%", "0%");
				break;
			case "C1(Autonome)":
				updateProgress(0.5, 0.0, 0.0, 0.0, 0.0, 0.0, "50%", "0%","0%", "0%", "0%", "0%");
				break;
			case "C2(Maîtrise)":
				updateProgress(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "0%", "0%","0%", "0%", "0%", "0%");
				break;
		}
			break;
		case "Chinois": 
			updateProgress(1.0, 1.0, 0.5, 0.5, 0.0, 0.0, "100%", "100%","50%", "50%", "0%", "0%");
			break;
		case "Espagnol": 
			updateProgress(1.0, 1.0, 0.5, 0.5, 0.0, 0.0, "100%", "100%","50%", "50%", "0%", "0%");
			break;
		case "Italien": 
			updateProgress(1.0, 1.0, 0.5, 0.5, 0.0, 0.0, "100%", "100%","50%", "50%", "0%", "0%");
			break;
		case "Russe": 
			updateProgress(1.0, 1.0, 0.5, 0.5, 0.0, 0.0, "100%", "100%","50%", "50%", "0%", "0%");
			break;
	}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		langueChoice.getItems().setAll("Anglais", "Allemand", "Chinois", "Espagnol", "Italien", "Russe");
		langueChoice.getSelectionModel().selectFirst();

		levelChoice.getItems().setAll("A1(Débutant)", "A2(Elémentaire)", "B1(Pré-Intermediaire)", "B2(Intermédiaire)", "C1(Autonome)","C2(Maîtrise)");
		levelChoice.getSelectionModel().selectFirst();



		
	} 

	
}