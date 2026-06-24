import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        ArrayList<Integer> v = new ArrayList<Integer>();

        int x,i,n;
        
        do{
            System.out.println("Numero de 0 a 50");
            n = leitor.nextInt();
        }while(n<=0 || n>50);

        for(i = 0; i < n; i++) {
            x = gerador.nextInt(10);
            v.add(x);
          }

        System.out.println("Valores gerados");
        for (i = 0; i < n; i++) {
        System.out.print(v.get(i) + ", ");
        }

        System.out.printf("\nNumero busca: \n");
        x = leitor.nextInt();

        for(i = 0; i < v.size(); i++) {
            if(v.get(i)==x) System.out.printf("Posição: %d\n", i);
            else if(i==v.size()-1) System.out.println("Não encontrado");
        }
    }
}
