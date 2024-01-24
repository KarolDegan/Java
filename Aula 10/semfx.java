import java.util.Scanner;

public class semfx {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor dos lados do Triangulo: ");
        System.out.println("Lado A: ");
        int A = teclado.nextInt();
        System.out.println("Lado B: ");
        int B = teclado.nextInt();
        System.out.println("Lado C: ");
        int C = teclado.nextInt();

        if (A+B>=C && A+C>=B && B+C>=A){
            System.out.println("Forma Triangulo!");
            if(A == B && A == C && B == C){
                System.out.println("Equilatero");
            } else if(A != B && A!= C && C!=B){
                System.out.println("Escaleno");
            } else{
                System.out.println("Isoceles");
            }
        } else{
            System.out.println("Não forma triangulo");
        }

    }
    
}
