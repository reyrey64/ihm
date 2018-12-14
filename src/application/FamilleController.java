package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


public class FamilleController extends SampleController implements Initializable {

	
    private ObservableList<Traduction> FamilleData = FXCollections.observableArrayList();
	
    @FXML
    private TableView<Traduction> TVFamille;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		FamilleData.add(new Traduction("Un père", "A father"));
		FamilleData.add(new Traduction("Une mère", "A mother"));
		FamilleData.add(new Traduction("Un parent", "A parent"));
		FamilleData.add(new Traduction("Un enfant", "A child"));
		FamilleData.add(new Traduction("Un fils", "A son"));
		FamilleData.add(new Traduction("Une fille", "A daughter"));
		FamilleData.add(new Traduction("Une frère", "A brother"));
		FamilleData.add(new Traduction("Une sœur", "A sister"));
		FamilleData.add(new Traduction("Une grand-père", "A grandfather"));
		FamilleData.add(new Traduction("Une grand-mère", "A grandmother"));
		FamilleData.add(new Traduction("Un petit-fils", "A grandson"));
		FamilleData.add(new Traduction("Une petite-fille", "A granddaughter"));
		FamilleData.add(new Traduction("Un oncle", "An uncle"));
		FamilleData.add(new Traduction("Une tante", "An aunt"));
		FamilleData.add(new Traduction("Un cousin", "A cousin"));
		FamilleData.add(new Traduction("Un neveu", "A nephew"));
		FamilleData.add(new Traduction("Une nièce", "A niece"));
		FamilleData.add(new Traduction("Un copain", "A boyfriend"));
		FamilleData.add(new Traduction("Une copine", "A girlfriend"));
		FamilleData.add(new Traduction("Un fiancé", "A fiancé"));
		TVFamille.getItems().addAll(FamilleData);
	} 

	
}