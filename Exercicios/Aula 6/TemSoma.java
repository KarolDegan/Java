import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemSoma {

    @FXML
    private Button btnSoma;

    @FXML
    private Label lblResposta;

    @FXML
    private TextField txtN1;

    @FXML
    private TextField txtN2;

    @FXML
    void clicar(ActionEvent event) {
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int s = n1 + n2;
        lblResposta.setText(Integer.toString(s));

    }

}
