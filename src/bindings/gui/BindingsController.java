/**
 * Sample Skeleton for 'BindingsView.fxml' Controller Class
 */

package bindings.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BindingsController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtTestone"
    private TextField txtTestone; // Value injected by FXMLLoader

    @FXML // fx:id="lblEtichetta"
    private Label lblEtichetta; // Value injected by FXMLLoader

    public  StringProperty txtTestoneProperty() {
    	return txtTestone.textProperty();
    }
    
    //	return txtTestone.textProperty();
    
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtTestone != null : "fx:id=\"txtTestone\" was not injected: check your FXML file 'BindingsView.fxml'.";
        assert lblEtichetta != null : "fx:id=\"lblEtichetta\" was not injected: check your FXML file 'BindingsView.fxml'.";
        lblEtichetta.textProperty().bind(txtTestone.textProperty());
      
    } 
}
