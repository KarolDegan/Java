import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

public class calcularidade {

    @FXML
    private Button btnCalcular;

    @FXML
    private Label lblIdade;

    @FXML
    private Spinner<?> sprAno;

    @FXML
    void calcular(ActionEvent event) {
        int ano = Integer.parseInt(sprAno.getValue().toString());
        int idade = 2024 - ano;
        lblIdade.setText(Integer.toString(idade));
    }

}

