import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ano de nascimento: ");
            int ano = teclado.nextInt();

            int idade = 2024 - ano;

            String sit = (idade >= 18)?"MAIOR":"MENOR";
            System.out.println(sit);

            String voto = ((idade>=16 && idade<18) || idade >70)?"Opsional":"Obrigatório";
            System.out.println(voto);
        }

    }
}
