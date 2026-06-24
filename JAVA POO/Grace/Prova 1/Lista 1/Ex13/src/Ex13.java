/*13.	Escreva um programa que leia o valor de um capital investido e a taxa de juros mensais. Supondo que essa taxa seja constante ao longo de um ano, apresente o valor do investimento ao final de cada mês durante um ano.*/

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) throws Exception {
        
        double capital;
        double taxa;
        

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Capital inicial: ");
        capital = entrada.nextDouble();

        System.out.println("Valor da taxa de jusros em decimal: ");
        taxa = entrada.nextDouble();

        entrada.close();

        for (int i = 1; i <= 3; i++){
            capital += capital * taxa;
        }

        System.out.printf("Valor final de uma ano: %.2f", capital);
        
    }
}
