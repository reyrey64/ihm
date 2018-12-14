package application;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ExosController extends SampleController implements Initializable { 
	
	@FXML 
	private Button exercice;
	
	@FXML 
	private Button magazine;
	
	@FXML 
	private Button outil;
	
	@FXML 
	private Button profil;
	
	@FXML 
	private Button exo1;
	
	@FXML 
	private Button exo2;
	
	@FXML 
	private Button exo3;
	
	@FXML 
	private Button exo4;
	
	@FXML 
	private Button exo5;
	
	@FXML 
	private Button exo6;
	
	@FXML 
	private Button valid1;
	
	@FXML 
	private Button valid2;
	
	@FXML 
	private Button valid3;
	
	@FXML 
	private Button valid4;
	
	@FXML 
	private Button valid5;

	@FXML 
	private Button valid6;
	
	@FXML 
	private TextField trad1;
	
	@FXML 
	private TextField trad2;
	
	@FXML 
	private TextField trad3;
	
	@FXML 
	private TextField trad4;
	
	@FXML 
	private TextField trad5;
	
	@FXML 
	private TextField trad6;
	
	@FXML 
	private Text correction1;
	
	@FXML 
	private Text correction2;
	
	@FXML 
	private Text correction3;
	
	@FXML 
	private Text correction4;
	
	@FXML 
	private Text correction5;
	
	@FXML 
	private Text correction6;
	
	@FXML 
	private Text conseil1;
	
	@FXML 
	private Text conseil2;
	
	@FXML 
	private Button suivant;
	
	@FXML 
	private Button retour;
	
	@FXML 
	private Pane rootpane;
		
	@FXML 
	private Button deco;
	
	@FXML 
	private ProgressBar progress;
	
	@FXML 
	private ProgressBar progress3;
	
	@FXML 
	private ProgressBar progressTrad;
		
	@FXML 
	private RadioButton rb1;
	
	@FXML 
	private RadioButton rb2;
	
	@FXML 
	private RadioButton rb3;
	
	@FXML 
	private RadioButton rb4;
	
	@FXML 
	private RadioButton rbtat1;
	
	@FXML 
	private RadioButton rbtat2;
	
	@FXML 
	private RadioButton rbtat3;
	
	@FXML 
	private RadioButton rbtat4;
	
	@FXML 
	private RadioButton rbtat5;
	
	@FXML 
	private RadioButton rbtat6;
	
	@FXML 
	private RadioButton rbtat7;
	
	@FXML 
	private RadioButton rbtat8;
	
	@FXML
	private ImageView errortat1;
	
	@FXML
	private ImageView errortat2;
	
	@FXML
	private ImageView errortat3;
	
	@FXML
	private ImageView errortat4;
	
	@FXML
	private ImageView errortat5;
	
	@FXML
	private ImageView errortat6;
	
	@FXML
	private ImageView error1;
	
	@FXML
	private ImageView error2;
	
	@FXML
	private ImageView error3;
	
	@FXML
	private ImageView error4;
	
	@FXML
	private ImageView error5;
	
	@FXML
	private ImageView error6;
	
	@FXML
	private ImageView correct;
	
	@FXML
	private ImageView correct2;
	
	@FXML
	private ImageView correct3;
	
	@FXML
	private ImageView correct4;
	
	@FXML
	private ImageView correcttat;
	
	@FXML
	private ImageView correcttat2;
	
	@FXML
	private AudioInputStream audiostream1;
	
	@FXML
	private AudioInputStream audiostream2;
	
	@FXML
	final ToggleGroup group = new ToggleGroup();
	
	@FXML
	final ToggleGroup grouptat = new ToggleGroup();
	
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
    private void ClickedExo(MouseEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("Exercices");
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
    private void ClickedVerificationQCM(ActionEvent event) throws IOException { 
		if(rb1.isSelected()) {
			error1.setVisible(true);
		}
		
		if(rb2.isSelected()) {
			correct.setVisible(true);
			progress.setProgress(0.5);
			valid1.setText("Suivant");
			valid1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) { 
					try {
						Pane root = (Pane)FXMLLoader.load(getClass().getResource("QCM2.fxml"));
						Node source = (Node) event.getSource();
						Stage stage = (Stage) source.getScene().getWindow();
						stage.setTitle("QCM");
						rootpane.getChildren().setAll(root);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
			    }
			});
		}
		
		if(rb3.isSelected()) {
			error2.setVisible(true);
		}
		
		if(rb4.isSelected()) {
			error3.setVisible(true);
		}
		
    } 
	
	@FXML 
    private void ClickedVerificationOral(ActionEvent event) throws IOException { 
		if(rb1.isSelected()) {
			error1.setVisible(true);
		}
		
		if(rb2.isSelected()) {
			correct.setVisible(true);
			progress.setProgress(0.5);
			valid1.setText("Suivant");
			valid1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) { 
					try {
						Pane root = (Pane)FXMLLoader.load(getClass().getResource("CompréhensionOral2.fxml"));
						Node source = (Node) event.getSource();
						Stage stage = (Stage) source.getScene().getWindow();
						stage.setTitle("Compréhension Oral");
						rootpane.getChildren().setAll(root);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
			    }
			});
		}
		
		if(rb3.isSelected()) {
			error2.setVisible(true);
		}
		
		if(rb4.isSelected()) {
			error3.setVisible(true);
		}
		
    } 
	
	@FXML 
    private void ClickedVerificationTexte(ActionEvent event) throws IOException { 
		if(rbtat1.isSelected()) {
			errortat1.setVisible(true);
		}
		
		if(rbtat3.isSelected()) {
			correcttat.setVisible(true);
			progress3.setProgress(0.5);
			valid5.setText("Suivant");
			valid5.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) { 
					try {
						Pane root = (Pane)FXMLLoader.load(getClass().getResource("Texteatrou2.fxml"));
						Node source = (Node) event.getSource();
						Stage stage = (Stage) source.getScene().getWindow();
						stage.setTitle("Texte a trou");
						rootpane.getChildren().setAll(root);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
			    }
			});
		}
		
		if(rbtat2.isSelected()) {
			errortat2.setVisible(true);
		}
		
		if(rbtat4.isSelected()) {
			errortat3.setVisible(true);
		}
		
    } 
	
	
	
	@FXML 
    private void ClickedVerificationTexte2(ActionEvent event) throws IOException { 
		if(rbtat5.isSelected()) {
			errortat4.setVisible(true);
		}
		
		if(rbtat7.isSelected()) {
			correcttat2.setVisible(true);
			valid6.setText("Terminer");
			valid6.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) { 
					try {
						Pane root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
						Node source = (Node) event.getSource();
						Stage stage = (Stage) source.getScene().getWindow();
						stage.setTitle("Exercice");
						rootpane.getChildren().setAll(root);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			    }
			});
			progress3.setProgress(1.0);
		}
		
		if(rbtat6.isSelected()) {
			errortat5.setVisible(true);
		}
		
		if(rbtat8.isSelected()) {
			errortat6.setVisible(true);
		}
		
    }
	
	@FXML 
    private void ClickedVerificationTraduction(ActionEvent event) throws IOException { 
		if(trad1.getText().equals("A cat eats a mouse")) {
			correct2.setVisible(true);
		} else {
			correction1.setVisible(true);
			error4.setVisible(true);
		}
		
		if(trad2.getText().equals("My mother is sleeping")) {
			correct3.setVisible(true);
		} else {
			error5.setVisible(true);
			correction2.setVisible(true);
		}
		
		if(trad3.getText().equals("My female cat is ill")) {
			correct4.setVisible(true);
		} else {
			error6.setVisible(true);
			correction3.setVisible(true);
			conseil1.setVisible(true);
		}
		valid3.setText("Suivant");
		valid3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) { 
				try {
					Pane root = (Pane)FXMLLoader.load(getClass().getResource("Traduction2.fxml"));
					Node source = (Node) event.getSource();
					Stage stage = (Stage) source.getScene().getWindow();
					stage.setTitle("Traduction");
					rootpane.getChildren().setAll(root);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		    }
		});
		progressTrad.setProgress(0.5);
    } 
	
	@FXML 
    private void ClickedVerificationTraduction2(ActionEvent event) throws IOException { 
		if(trad4.getText().equals("A bird fly")) {
			correct2.setVisible(true);
		} else {
			correction4.setVisible(true);
			error4.setVisible(true);
		}
		
		if(trad5.getText().equals("My cousin is reading")) {
			correct3.setVisible(true);
		} else {
			error5.setVisible(true);
			correction5.setVisible(true);
		}
		
		if(trad6.getText().equals("My brothers are playing")) {
			correct4.setVisible(true);
		} else {
			error6.setVisible(true);
			correction6.setVisible(true);
			conseil2.setVisible(true);
		}
		valid4.setText("Terminer");
		valid4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) { 
				try {
					Pane root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
					Node source = (Node) event.getSource();
					Stage stage = (Stage) source.getScene().getWindow();
					stage.setTitle("Exercice");
					rootpane.getChildren().setAll(root);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		    }
		});
		progressTrad.setProgress(1.0);
    } 
	
	@FXML 
    private void ClickedSuivant(ActionEvent event) throws IOException { 
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("QCM2.fxml"));
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.setTitle("QCM");
		rootpane.getChildren().setAll(root);
		
    } 
	
	@FXML
    private void ClickedTerminer(ActionEvent event) throws IOException { 
		if(rb1.isSelected()) {
			error1.setVisible(true);
		}
		
		if(rb2.isSelected()) {
			correct.setVisible(true);
			valid2.setText("Terminer");
			valid2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) { 
					try {
						Pane root = (Pane)FXMLLoader.load(getClass().getResource("Exercice.fxml"));
						Node source = (Node) event.getSource();
						Stage stage = (Stage) source.getScene().getWindow();
						stage.setTitle("Exercice");
						rootpane.getChildren().setAll(root);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
			    }
			});
			progress.setProgress(1);
		}
		
		if(rb3.isSelected()) {
			error2.setVisible(true);
		}
		
		if(rb4.isSelected()) {
			error3.setVisible(true);
		}
		
	    }
	@FXML
	private void makeSound() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException { 
		File fichier = new File("./snd/hello.wav");
		audiostream1 = AudioSystem.getAudioInputStream(fichier.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream1);
		clip.start();
	}
	
	@FXML
	private void makeSound2() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException { 
		File fichier = new File("./snd/kitchen.wav");
		audiostream2 = AudioSystem.getAudioInputStream(fichier.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream2);
		clip.start();
	}
	
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) { 

	} 
	
 
	
	
}
