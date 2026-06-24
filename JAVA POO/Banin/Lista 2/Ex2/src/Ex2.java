import java.util.Scanner;
import java.util.ArrayList;

public class Ex2 {

    private static boolean ePrimo(int n){
        int r;       
        
        if(n==1) {
            return false;
        } 
    
        for(int i=2;i<= Math.sqrt(n);i++){
            r = n%i;
            if (r==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        int min, max, cont=0;

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        do{
            System.out.print("Mínimo (x>1): ");
            min = leitor.nextInt();
        }while(min<2 || min>999999);

        do{
            System.out.print("Máximo (x<10000000): ");
            max = leitor.nextInt();
        }while(max<min || max>999999);

        for(int i=min; i<=max; i++){
            if(ePrimo(i)) {
                vetor.add(i);
                cont += 1;
            }
        }

        System.out.println("Números primos:");
        System.out.println(vetor);
        System.out.println("Quantidade: ");
        System.out.println(cont);

    }
}
