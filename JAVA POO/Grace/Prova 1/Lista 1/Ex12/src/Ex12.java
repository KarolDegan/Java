/*12.	Altere o exercício anterior para ler uma seqüência de valores de pessoas de uma comunidade, determinando seu peso ideal de acordo com as fórmulas dadas no exercício anterior. Ao final (quando o usuário digitar altura igual a 0), informe a altura média das mulheres e dos homens.*/

import java.util.Scanner;


public class Ex12 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        double altura,mediam = 0,mediah = 0;
        int sexo, conth = 0, contm = 0;

        while(true){       
            System.out.println("Aluta: ");
            altura = entrada.nextDouble();
            if(altura == 0) break;

            System.out.println("Sexo: ");
            sexo = entrada.nextInt();

            if(sexo == 1){
                conth +=1;
                mediah += altura;
                System.out.printf("Peso ideal: %.2f",  altura * 72.7- 58);
            } 
            else if(sexo == 2){
                contm += 1;
                mediam += altura;
                System.out.printf("Peso ideal: %.2f",  altura * 62.1- 44.7);
            } 
        }

        entrada.close();

        if(conth > 0) {
            mediah = mediah / conth; 
        }
        if(contm > 0) {
            mediam = mediam / contm;  
        }
        
        System.out.printf("Altura média mulheres: %.2f \nAltura média homens: %.2f", mediam, mediah);

    }
}
