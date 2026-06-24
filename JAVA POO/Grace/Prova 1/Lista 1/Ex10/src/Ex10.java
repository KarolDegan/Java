/*10.	Faça um programa que leia os valores de uma data: o dia, o mês e o ano, com três variáveis inteiras. Faça a consistência da data. Considere:
	Meses com 30 dias: 4, 6, 9, 11
	Meses com 31 dias: 1, 3, 5, 7, 8, 10, 12
	Ano bissexto: Divisível por 4, mas não por 100.*/

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        int dia, mes, ano;

        Scanner entrada = new Scanner(System.in);

        int vetormeses [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Ano: ");
        ano = entrada.nextInt();
        
        if (ano%4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) vetormeses[2] = 29;
        
        System.out.println("Mês: ");
        mes = entrada.nextInt();
        while(mes < 1 || mes > 12){
            System.out.println("Mês invalido. Digite valor válido");
            mes = entrada.nextInt();
        }
        
        System.out.println("Dia: ");
        dia = entrada.nextInt();
        
        while(dia < 1 || dia > vetormeses[mes]){
            System.out.println("Dia invalido. Digite valor válido");
            dia = entrada.nextInt();
        }

        entrada.close();

        System.out.printf("Data: %d/%d/%d", dia, mes, ano);

    }
}
