package application;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class SampleController {
	
	@FXML
    // fx:id="combo"
    private ComboBox<String> choix_language; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
   void initialize() {
    	    
       // Initialize your logic here: all @FXML variables will have been injected
    	choix_language.setPromptText("Anglais");
    	choix_language.getItems().addAll("Anglais", "Espagnol","Italien","Allemand");
    	//choix_language.getItems().add("Others...");
   }
}
