package bindings.gui;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(final Stage primaryStage) {
		try {
			FXMLLoader Bindingsloader = new FXMLLoader(getClass().getResource("BindingsView.fxml"));
			BorderPane root = (BorderPane)Bindingsloader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			 primaryStage.setTitle("First Window");
			
			BindingsController bc=Bindingsloader.getController();
		
			Stage secondaryStage=new Stage();
			FXMLLoader secondloader = new FXMLLoader(getClass().getResource("SecondView.fxml"));
			BorderPane secondRoot = (BorderPane)secondloader.load();
			Scene secondScene = new Scene(secondRoot);
			secondScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			secondaryStage.setScene(secondScene);
			secondaryStage.setTitle("Second Window");
			//secondaryStage.setX(primaryStage.getX());
			//secondaryStage.setY(primaryStage.getY());
			secondaryStage.setX(800);
			secondaryStage.setY(300);
			primaryStage.setX(500);
			primaryStage.setY(300);
			
			primaryStage.setOnCloseRequest(event -> {System.out.println("Bye Bye"); Platform.exit();});
			
			secondaryStage.show();
			primaryStage.show();
			SecondController sc=secondloader.getController();
			
			// sc.lblCesso.textProperty().bind(bc.txtTestoneProperty());
			sc.setProperty(bc.txtTestoneProperty());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
