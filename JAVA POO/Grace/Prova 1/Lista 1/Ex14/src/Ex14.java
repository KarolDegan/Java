/*14.	Escreva um programa que, a partir do capital e taxa de juros informados, calcule em quantos anos (e meses) seu investimento dobrará. Considere juros constantes.*/

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) throws Exception {
        double capital, taxa, dobro;
        int cont = 0;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Capital inicial: ");
        capital = entrada.nextDouble();

        System.out.println("Valor da taxa de jusros em decimal: ");
        taxa = entrada.nextDouble();

        entrada.close();
        dobro = capital;

        while(2*capital > dobro){
            cont+=1;
            dobro += dobro * taxa;
            System.out.println(dobro);
        }

        System.out.printf("Quantidade de meses: ", cont);
    }
}
