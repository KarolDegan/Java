import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class calculadora extends Application {
    public static void main(String[] args) throws Exception{
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        FXMLLoader abrir = new FXMLLoader(getClass().getResource("super calculadora.fxml"));
        Parent root = abrir.load();
        Scene tela = new Scene(root);
        
        arg0.setScene(tela);
        arg0.show();

    }
}
