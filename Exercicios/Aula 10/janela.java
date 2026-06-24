import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

public class janela {

    @FXML
    private Button btnVerificar;

    @FXML
    private Label lblA;

    @FXML
    private Label lblB;

    @FXML
    private Label lblC;

    @FXML
    private Label lblForma;

    @FXML
    private Label lblTipo;

    @FXML
    private Slider sdrA;

    @FXML
    private Slider sdrB;

    @FXML
    private Slider sdrC;

     @FXML
    void moverA(InputMethodEvent event) {
        double a = Math.floor(sdrA.getValue());

        lblA.setText(Double.toString(a));
    }

    @FXML
    void moverB(MouseEvent event) {
        double b = Math.floor(sdrB.getValue());

        lblB.setText(Double.toString(b));

    }

    @FXML
    void moverC(MouseEvent event) {
        double c = Math.floor(sdrC.getValue());
        lblC.setText(Double.toString(c));
        
    }

    @FXML
    void verificar(ActionEvent event) {
        double c = Math.floor(sdrC.getValue());
        int C = Integer.parseInt(Double.toString(c));
        double b = Math.floor(sdrB.getValue());
        int B = Integer.parseInt(Double.toString(b));
        double a = Math.floor(sdrA.getValue());
        int A = Integer.parseInt(Double.toString(a));
        if (A+B>=C && A+C>=B && B+C>=A){
            lblForma.setText("Forma Triangulo!");
            if(A == B && A == C && C == B){
                lblTipo.setText("Equilátero!");
            } else if (A != B && A != C && B!=C){
                lblTipo.setText("Escaleno!");
            }else{
                lblTipo.setText("Isoceles!");
            }
        } else {
            lblForma.setText("Não Forma Triangulo!");
        }
    }


}