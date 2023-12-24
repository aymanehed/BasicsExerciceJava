package tp_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Matiere");
		BorderPane borderPaneRoot=new BorderPane();
		Scene scene=new Scene(borderPaneRoot,800,600);
		
		
	}
	public static void main(String[]args) {
		launch(args);
	}

}
