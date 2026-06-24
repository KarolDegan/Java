//8.	Faça um programa que leia 3 valores inteiros, exiba os valores em ordem crescente.

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) throws Exception {
        
        int n1, n2, n3, aux;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Primeiro número:");
        n1 = entrada.nextInt();

        System.out.println("Segundo número:");
        n2 = entrada.nextInt();

        System.out.println("Terceiro número:");
        n3 = entrada.nextInt();

        entrada.close();

        if(n1 > n2){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if(n1> n3){
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if(n2>n3){
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        System.out.printf("Ordem Crescente: %d, %d, %d", n1,n2,n3);
    }
}
