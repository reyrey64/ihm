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


public class GenreController extends SampleController implements Initializable {

	
    private ObservableList<Traduction> GenreData = FXCollections.observableArrayList();
    private ObservableList<Traduction> GenreExceptionData = FXCollections.observableArrayList();
    
    @FXML
    private TableView<Traduction> TVGenre;
    
    @FXML
    private TableView<Traduction> TVGenreException;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		GenreData.add(new Traduction("a man (homme)", "a woman  (femme)"));
		GenreData.add(new Traduction("a gentleman (monsieur)", "a lady (dame)"));
		GenreData.add(new Traduction("an actor (acteur)", "an actress (actrice)"));
		GenreData.add(new Traduction("an uncle (oncle)", "an aunt (tante)"));
		GenreData.add(new Traduction("a father (père)", "a mother (mère)"));
		GenreData.add(new Traduction("a buck (cerf)", "a doe (biche)"));
		GenreData.add(new Traduction("a ram (bélier)", "an ewe (brebis)"));
		GenreData.add(new Traduction("a bull (taureau)", "a cow (vache)"));
		GenreData.add(new Traduction("a stallion (étalon)", "a mare (jument)"));
		GenreData.add(new Traduction("a fox (renard)", "a vixen (renarde)"));
		GenreData.add(new Traduction("an ox (bœuf)", "a heifer (génisse)"));
		TVGenre.getItems().addAll(GenreData);
		
		GenreExceptionData.add(new Traduction("a female cat", "une chatte"));
		GenreExceptionData.add(new Traduction("a male giraffe", "une girafe mâle"));
		GenreExceptionData.add(new Traduction("a male fish", "un poisson mâle"));
		GenreExceptionData.add(new Traduction("a female dog", "une chienne"));
		TVGenreException.getItems().addAll(GenreExceptionData);
		
		
	} 

	
}