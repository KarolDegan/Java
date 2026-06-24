import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int min, max, x=1, aux, tot=0, soma=0;

        System.out.println("Primeiro Velor: ");
        min = leitor.nextInt();
        
        System.out.println("Segundo Valor: ");
        max = leitor.nextInt();

        if(min>max){
            aux = min;
            min = max;
            max = aux;
        }

        while(x!=0){

        System.out.println("valor x: ");
        x = leitor.nextInt();

        if(x>=min && x<=max){
            tot +=1;
            soma+=x;

        }else System.out.println("Ignorado na totalização");

        }
        leitor.close();
        System.out.printf("Max: %d Min: %d \nTot: %d\nSoma: %d", max,min,tot,soma);
    }
}
