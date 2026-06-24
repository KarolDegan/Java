/*6.	Faça um programa que leia o consumo de energia mensal de uma residência, calcule e exiba o valor da
conta seguindo os seguintes critérios:
-	Consumo até 50kWh: taxa mínima de R$ 10,00
-	Consumo até 100kWh: além da taxa mínima de R$ 10,00 paga 0,20 por kWh que exceder 50.
-	Consumo até 200kWh: segue o critério anterior mais 0,25 por kWh que exceder 100.
-	Consumo maior que 200kWh: segue o critério anterior mais 0,35 por kWh que exceder 200. Exemplo: Consumo de 130 kWh = 50 + 50 + 30 custa 10,00 + 50*0,20 + 30*0,25 = 27,50.*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws Exception {
        
        double kwh, valor;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CONSUMO DE ENERGIA em kWh: ");

        kwh = entrada.nextDouble();

        if(kwh <= 50) valor = 10;
        else if (kwh <= 100) valor = 10 + 0.2*(kwh - 50);
        else if (kwh <= 200) valor = 10 + 0.2*50 + 0.25*(kwh - 100);
        else valor = 10 + 0.2*50 + 0.25*100 + 0.35*(kwh - 200);

        System.out.printf("Valor da conta: %0.2f", valor);


    }
}
