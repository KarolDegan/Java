import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int min, max, x=1, aux, i;
        int tot=0, soma=0;
        //int v[] = new int[5]; vetor estático
        ArrayList<Integer> v = new ArrayList<Integer>(); // vetor dinâmico

        System.out.println("Min: ");
        min = leitor.nextInt();
        
        System.out.println("Max: ");
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
            v.add(x); //para o vetor dinamico não pode v[tot] =x
            tot +=1;
            soma+=x;
            

        }else System.out.println("Ignorado na totalização");

        }
        leitor.close();

        for(i=0; i<tot; i++){

            System.out.println("[" + i + "]: " + v.get(i) + "   ");//tbm não pode v[i]

        }
        System.out.printf("Max: %d Min: %d \nTot: %d\nSoma: %d", max,min,tot,soma);
    }
}
