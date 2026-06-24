import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Numerador: ");
            int numerador = teclado.nextInt();
            
            System.out.println("\nDenominador: ");
            int denominador = teclado.nextInt();

            int divisao = numerador/denominador;
            int resto = numerador%denominador;

            System.out.printf("\nDivisão: %d \n Resto: %d", divisao, resto);
        }
    }
}
