package application;
 
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
 
public class Traduction {
 
    public StringProperty french;
    public StringProperty english;
    
    public Traduction() {
        this.french = null;
        this.english = null;
    }
 
    public Traduction(String french, String english) {
        this.french = new SimpleStringProperty(french);
        this.english = new SimpleStringProperty(english);
    }
    
 
    /**
     * @return the french
     */
    public String getFrench() {
        return this.french.get();
    }
 
    /**
     * @param the french to set
     */
    public void setFrench(String french) {
        this.french.set(french);
    }
 
    /**
     * @return the english
     */
    public String getEnglish() {
        return this.english.get();
    }
 
    /**
     * @param the english to set
     */
    public void setEnglish(String english) {
        this.english.set(english);
    }
    
 
}