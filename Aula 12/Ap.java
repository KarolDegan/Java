import javax.swing.JOptionPane;

public class Ap {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Digite um número: <em><br>Zero interrompe!</br></em></html>"));
        System.out.println(n);
        // AS mensagens do JOption se coloca nos args
    }
}
