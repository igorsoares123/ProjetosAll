package view;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadernoDeContasFx extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
      
        Parent root = FXMLLoader.load(getClass().getResource("FXMLCadastroCliente.fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Caderno de anotações");
        stage.setScene(scene);
        stage.show();
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
