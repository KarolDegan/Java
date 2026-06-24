/*7.	Faça um programa que leia as 2 notas de um aluno, calcule e exiba a média aritmética das notas e a
situação final do aluno (MF >= 7 - APROVADO, MF >= 4 E MF < 7 - EXAME, MF < 4 - REPROVADO).*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws Exception {
        double n1, n2, nota;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Segunda nota: ");
        n2 = entrada.nextDouble();

        nota = (n1+n2)/2;

        if(nota<4) System.out.println("Reprovado");
        else if(nota <7) System.out.println("Exame");
        else System.out.println("Aprovado");
        
        entrada.close();
    }
}
