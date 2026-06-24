//9.	Faça um programa que leia 3 valores inteiros, encontre e exiba o maior deles.

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) throws Exception {
        int n1,n2,n3, aux;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Primeiro número:");
        n1 = entrada.nextInt();

        System.out.println("Segundo número:");
        n2 = entrada.nextInt();

        System.out.println("Terceiro número:");
        n3 = entrada.nextInt();

        entrada.close();

        if(n1>n2) aux = n1;
        else aux = n2;

        if(aux < n3) aux = n3;

        System.out.println("Maior: " + aux);

    }
}
