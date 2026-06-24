import java.util.Scanner;

public class Ex3 {
    
    private static int digito(int n){
        int resto,soma=0;
        for(int i=6;i>0;i--){
            soma += (n%10)*i;
            n = (n/10);
        }
        resto = soma%7;
        return resto;

    }
    
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        int n;

        do{
            System.out.println("Número 5 Dígitos: ");
            n = leitor.nextInt();
        }while(n<10000 || n>99999);

        System.out.printf("Dígito verificador: "+ digito(n));
    }
}
