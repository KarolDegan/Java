import java.util.Scanner;
public class TesteCorrente2 {
    public static void main(String[] args) {
        ContaCorrente2 cc1 = new ContaCorrente2(12345,"Joao da Silva", 20,-10);
        cc1.verDados();

        ContaCorrente2 cc2;
        cc2 = new ContaCorrente2(54321, "Maria dos Santos",100);
        cc2.verDados();

        Scanner entrada = new Scanner(System.in);

        System.out.printf("\nValor para deposito c1:");
        double vlr = entrada.nextDouble();
        cc1.deposito(vlr);
        cc1.verDados();

        System.out.println("Valor para saque c2: ");
        cc2.saque(entrada.nextDouble());
        cc2.verDados();
    }
}
