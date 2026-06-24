import java.util.Scanner;
public class Celsius {
    public static void main(String[] args) {
        
        double fah, cel;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Temperatura Fahrenheit: ");
        fah = leitor.nextDouble();

        cel = (fah-32)*5/9;
        System.out.printf("Temperatura em Celsius: %.1f", cel);

        leitor.close();

    }
}
