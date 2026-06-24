/*15.	Faça um programa que leia um dado n positivo e uma seqüência de n temperaturas em Celsius. Calcule e exiba seus valores correspondentes em Fahrenheit. (F = 32 + C * 5 / 9).*/

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.print("Quantos números: ");
        n = entrada.nextInt();

        double vetor[] = new double[n];
        double f;
        
        for(int i = 0; i<n; i++){
            System.out.print("\n"+ (i+1) + "° Temperatura em Celsius: ");

            vetor[i] = entrada.nextInt();   
        }

        entrada.close();

        for(int i = 0; i<n; i++){
            f = 32 + (vetor[i] * 9/5);
            System.out.printf("\nValores em Fahrenheit: %.1f°F", f);
        }

    }
}
