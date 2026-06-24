import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        Retangulo ret = new Retangulo(1, 6, 7, 1);
        ret.isDentro(8,3);

       int n;

        int v[] = new int [4];
        
        System.out.println("Defina o retângulo: ");
        
        System.out.print("\nValor x1: ");
        v[0] = entrada.nextInt();

        System.out.print("\nValor y1: ");
        v[1] = entrada.nextInt();

        System.out.print("\nValor x2: ");
        v[2] = entrada.nextInt();

        System.out.print("\nValor y2: ");
        v[3] = entrada.nextInt();

        Retangulo r = new Retangulo(v[0], v[1], v[2],v[3]);

        System.out.println("Quantos Pontos deseja conferir?");
        n = entrada.nextInt();

        int pontos [][] = new int[n][2];

        for(int i = 0; i<n; i++){
            System.out.println((i+1)+"° Ponto: ");
            
            System.out.print("Valor x: ");
            pontos[i][0] = entrada.nextInt();

            System.out.print("Valor y: ");
            pontos[i][1] = entrada.nextInt();
        }

        entrada.close();

        System.out.println("Verificando os pontos...");
        for (int i = 0; i < n; i++) {
            int x = pontos[i][0];
            int y = pontos[i][1];
            if (r.isDentro(x, y)) {
                System.out.printf("O ponto (%d, %d) está dentro do retângulo.\n", x, y);
            } else {
                System.out.printf("O ponto (%d, %d) está fora do retângulo.\n", x, y);
            }
        }

        
    }
}
