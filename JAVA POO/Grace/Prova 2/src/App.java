import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitura = new Scanner(System.in);
        double altura[] = new double[20];
        double media = 0;
        int cont = 0;

        for (int i=0;i<5;i++){
            System.out.print("Altura da "+ (i+1) + "º pessoa: ");
            altura[i] = leitura.nextDouble();
            media += altura[i];
        }

        media = media/20;

        for(int i= 0; i<20; i++){
            if (altura[i]> media) cont++;
        }

        System.out.println("Média: " + media);
        System.out.println("Número de pessoas ACIMA da média: " + cont);
    }
}
