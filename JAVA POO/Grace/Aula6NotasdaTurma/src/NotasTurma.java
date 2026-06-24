import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        final int ALUNOS = 3;
        final int PROVAS = 2;

        int lin,col;
        double media;

        double notas [] [] = new double [ALUNOS] [PROVAS];
        
        Scanner entrada = new Scanner(System.in);

        for(lin = 0; lin < ALUNOS; lin++){
            System.out.printf("\nDigite as notas do %do aluno\n", lin+1);
            for(col = 0;col<PROVAS;col++){
                notas[lin][col] = entrada.nextDouble();
            }
        }

        System.out.println();
        System.out.println("Notas e Média");

        for(lin = 0; lin < ALUNOS; lin++){
            System.out.printf("\nAluno %d: ", lin+1);
            
            media = 0;
            
            for(col = 0;col<PROVAS;col++){
                System.out.printf("%2.2f ",notas[lin][col]);
            
                media += notas[lin][col];
            }
            System.out.printf("-Média %2.2f", media/PROVAS);
        }
    }
}
