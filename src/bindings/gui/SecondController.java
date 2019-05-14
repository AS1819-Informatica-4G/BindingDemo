/**
 * Sample Skeleton for 'SecondView.fxml' Controller Class
 */

package bindings.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblCesso"
    public Label lblClone; // Value injected by FXMLLoader
    
    public void setProperty(StringProperty sp) {
    	lblClone.textProperty().bind(sp);
    }
 

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblClone != null : "fx:id=\"lblCesso\" was not injected: check your FXML file 'SecondView.fxml'.";
    }
}
