import java.util.Scanner;
import java.util.ArrayList;
public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x,i,n;

        ArrayList<Integer> a = new ArrayList<Integer>();
        
        ArrayList<Integer> neg = new ArrayList<Integer>();

        ArrayList<Integer> pos = new ArrayList<Integer>();

        do{
            System.out.println("Numero de 0 a 50");
            x = leitor.nextInt();
        }while(x<=0 || x>50);
        
        for(i=0;i<x;i++){
            System.out.println("Numero: ");
            n = leitor.nextInt();
            a.add(n);
        }

        leitor.close();

        for(i=0;i<x;i++){
            if(a.get(i) >=0) pos.add(a.get(i));
            else neg.add(a.get(i));
        }

        System.out.printf("Positivos: \n");
        for(i=0; i<pos.size(); i++){

            System.out.println("[" + i + "]: " + pos.get(i) + "   ");

        }


        System.out.printf("Negativos: \n");
        for(i=0; i<neg.size(); i++){

            System.out.println("[" + i + "]: " + neg.get(i) + "   ");

        }
    }
}
