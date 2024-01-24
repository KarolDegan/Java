import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Aula5 extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        FXMLLoader abrir = new FXMLLoader(getClass().getResource("testando.fxml"));
        Parent root = abrir.load();
        Scene tela = new Scene(root);
        
        arg0.setScene(tela);
        arg0.show();

    }
}