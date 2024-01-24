import java.util.Scanner;

public class Descobre {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double n = 1+ Math.random() * (6-1);
            double nu = Math.floor(n);

            System.out.println("Qual número eu pensei: ");
            int aposta = teclado.nextInt();

            String resp = (nu==aposta)?"Acertou":"Errou";
            System.out.println(resp);
            System.out.println((resp=="Errou"?nu:0));
        }
    }
    
}
