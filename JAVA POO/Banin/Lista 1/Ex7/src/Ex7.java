import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int x, maior, menor, quant =0, soma=0;

        System.out.println("Valor x: ");
        x = leitor.nextInt();

        maior = x;
        menor = x;
        
        while (x>0){
            
            soma += x;
            quant +=1;

            if(maior < x) maior = x;
            if(menor > x) menor = x;

            System.out.println("Valor x: ");
            x = leitor.nextInt();

        }
        leitor.close();
        System.out.printf("Maior: %d \nMenor: %d \n Quantidade: %d \nSoma: %d", maior, menor, quant, soma);

    }
}
