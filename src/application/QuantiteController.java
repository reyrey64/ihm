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


public class QuantiteController extends SampleController implements Initializable {

	
    private ObservableList<Traduction> QuantiteData = FXCollections.observableArrayList();
    
    @FXML
    private TableView<Traduction> TVQuantite;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		QuantiteData.add(new Traduction("peu de", "few"));
		QuantiteData.add(new Traduction("quelques", "a few"));
		QuantiteData.add(new Traduction("beaucoup de", "a lot of"));
		QuantiteData.add(new Traduction("beaucoup de", "many"));
		QuantiteData.add(new Traduction("tous", "all"));
		QuantiteData.add(new Traduction("chaque", "each"));
		QuantiteData.add(new Traduction("chaque", "every"));
		QuantiteData.add(new Traduction("aucun", "no"));
		QuantiteData.add(new Traduction("plusieurs", "several"));
		QuantiteData.add(new Traduction("pas beaucoup", "not much"));
		QuantiteData.add(new Traduction("pas beaucoup", "not many"));
		TVQuantite.getItems().addAll(QuantiteData);		
	} 	
}