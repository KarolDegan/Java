import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);

        int n, d = 0, s;

        do{
            System.out.println("Número até 6 dígitos: ");
            n = leitor.nextInt();
        }while(n/1000000 !=0 || n<0);

        s = n;

        do{
            d += s%10;
            s = s/10;
        }while(s != 0);

        d = d%10;

        System.out.printf("O número da conta é: %06d-%d", n, d);
        
    }
}
