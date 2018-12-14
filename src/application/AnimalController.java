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


public class AnimalController extends SampleController implements Initializable {

	
    private ObservableList<Traduction> AnimalData = FXCollections.observableArrayList();
	
    @FXML
    private TableView<Traduction> TVAnimal;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		AnimalData.add(new Traduction("Un chat", "A cat"));
		AnimalData.add(new Traduction("Un chien", "A dog"));
		AnimalData.add(new Traduction("Un éléphant", "An elephant"));
		AnimalData.add(new Traduction("Un hibou", "An owl"));
		AnimalData.add(new Traduction("Un écureuil", "A squirrel"));
		AnimalData.add(new Traduction("Un canard", "A duck"));
		AnimalData.add(new Traduction("Un oiseau", "A bird"));
		AnimalData.add(new Traduction("Une grenouille", "A frog"));
		AnimalData.add(new Traduction("Une vache", "A cow"));
		AnimalData.add(new Traduction("Un taureau", "A bull"));
		AnimalData.add(new Traduction("Un cheval", "A horse"));
		AnimalData.add(new Traduction("Une abeille", "A bee"));
		AnimalData.add(new Traduction("Un papillon", "A butterfly"));
		AnimalData.add(new Traduction("Une mouche", "A fly"));
		AnimalData.add(new Traduction("Un singe", "A monkey"));
		AnimalData.add(new Traduction("Un gorille", "A gorilla"));
		AnimalData.add(new Traduction("Un lion", "A lion"));
		AnimalData.add(new Traduction("Un poisson", "A fish"));
		AnimalData.add(new Traduction("Un phoque", "A seal"));
		AnimalData.add(new Traduction("Un requin", "A shark"));
		TVAnimal.getItems().addAll(AnimalData);
		
	} 

	
}