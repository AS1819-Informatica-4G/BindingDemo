/**
 * Sample Skeleton for 'PopupView.fxml' Controller Class
 */

package bindings.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopupController {
	private static Stage MyStage=null;
	public static void buildMe(Stage parent) {
		if (MyStage==null) {
			Stage popupStage=new Stage();
			try {
			
				FXMLLoader popuploader = new FXMLLoader(PopupController.class.getResource("PopupView.fxml"));
				BorderPane popupRoot = (BorderPane)popuploader.load();
				Scene popupScene = new Scene(popupRoot);
				popupScene.getStylesheets().add(PopupController.class.getResource("application.css").toExternalForm());
				popupStage.setScene(popupScene);
				popupStage.setTitle("Popup Window");
			    popupStage.initOwner(parent);
				popupStage.initModality(Modality.APPLICATION_MODAL); 
				MyStage=popupStage;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (null != MyStage) MyStage.showAndWait();
	}

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnClose"
    private Button btnClose; // Value injected by FXMLLoader

    @FXML
    void onClose(ActionEvent event) {
    final Node node=(Node)event.getSource();
    final Stage stage=(Stage)node.getScene().getWindow();
    stage.hide(); // (o close())	
    	//((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnClose != null : "fx:id=\"btnClose\" was not injected: check your FXML file 'PopupView.fxml'.";

    }
}
