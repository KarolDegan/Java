import java.util.Scanner;
public class Caixa {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        double tot=0,valor;

        do{
            System.out.println("Preço da mercadoria: ");
            valor = leitor.nextDouble();
            tot += valor;
        }while(valor!=0);

        System.out.printf("Valor Total: %.2f\n",tot);
        if(tot<50){
            System.out.println("Desconto de 5%");
            tot = tot* 0.95;
        }
        else if(tot<=100){
            System.out.println("Desconto de 10%");
            tot = tot*0.9;
        }
        else if(tot<=200){
            System.out.println("Desconto de 15%");
            tot = tot*0.85;
        }
        else{
            System.out.println("Desconto de 20%");
            tot = tot*0.8;
        }

        System.out.printf("Valor a ser pago: %.2f",tot);
        

    }
}
