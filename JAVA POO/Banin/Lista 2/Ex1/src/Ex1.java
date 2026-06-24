import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int n,r;
        boolean primo = true;

        System.out.println("Número Primo?");
        

        do{
            System.out.println("Numero Natural: ");
            n = leitor.nextInt();
        }while(n<=0);
        
        if(n==1) {
            System.out.println("Não é primo");
            System.exit(0);
        } 

        for(int i=2;i<= Math.sqrt(n);i++){
            r = n%i;
            if (r==0) {
                primo = false;
                break;
            }
        }
        
        if(primo) System.out.println("Primo");
        else System.out.println("Não é primo");
    }
}
