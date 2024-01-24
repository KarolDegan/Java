import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

public class calculador {

    @FXML
    private Button btncalcular;

    @FXML
    private Spinner<?> iptnumero;

    @FXML
    private Label lblAbsoluto;

    @FXML
    private Label lblAocubo;

    @FXML
    private Label lblCubica;

    @FXML
    private Label lblQuadrada;

    @FXML
    private Label lblResto;

    @FXML
    void Supercalcular(ActionEvent event) {
        int numero = Integer.parseInt(iptnumero.getValue().toString());
        int resto = numero%2;
        int aocubo = (int) Math.pow(numero,3);
        double quadrada = Math.sqrt(numero);
        double cubica = Math.cbrt(numero);
        int absoluto = Math.abs(numero);

        lblResto.setText(Integer.toString(resto));
        lblAocubo.setText(Integer.toString(aocubo));
        lblQuadrada.setText(Double.toString(quadrada));
        lblCubica.setText(Double.toHexString(cubica));
        lblAbsoluto.setText(Integer.toString(absoluto));
    }

}
