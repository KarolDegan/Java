import java.util.Scanner;
import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        int n;

        System.out.println("Sequencia de Fibonacci");

        do{
            System.out.printf("Quantos Números: ");
            n = leitor.nextInt();
        }while(n<1);

        for(int i=0;i<n;i++){
            if(i==0) vetor.add(0);
            else if(i==1) vetor.add(1);
            else{
                int aux = vetor.get(i-2) +vetor.get(i-1);
                vetor.add(aux);
            }
        }
        System.out.println("Sequencia: ");
        System.out.println(vetor);

    }
}
