import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        
        double a, b, c;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Lados do Triângulo: ");

        do {
            System.out.println("Primeiro Lado : ");
            a = leitor.nextDouble();
        } while (a <= 0);

        do {
            System.out.println("Segundo Lado : ");
            b = leitor.nextDouble();
        } while (b <= 0);
        
        do {
            System.out.println("Terceiro Lado : ");
            c = leitor.nextDouble();
        } while (c <= 0);

        if(a<b+c && b<a+c && c<a+b){
            System.out.println("Forma Triangulo");

            if(a == b && b == c) System.out.println("Equilátero!");

            else if(a!=b && a!=c && b!=c) System.out.println("Escaleno!");

            else System.out.println("Isosseles!");

        }else System.out.println("Não Forma Triangulo");

        leitor.close();
    }
}
