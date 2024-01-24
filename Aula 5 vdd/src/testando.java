import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class testando {

    @FXML
    private Button btnBotao;

    @FXML
    private Label lblMensagem;
    
    @FXML
    void clicarBotao(ActionEvent event) {
        lblMensagem.setText("Olá Mundo!");
    }

}
