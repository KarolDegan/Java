import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        final int ALUNOS = 5;
        final int PROVAS = 2;

        int lin, col;
        double media_aluno, media_turma = 0;

        double notas[][] = new double[ALUNOS][PROVAS + 1];

        Scanner entrada = new Scanner(System.in);

        for (lin = 0; lin < ALUNOS; lin++) {

            media_aluno = 0;

            System.out.printf("\nDigite as notas do %do aluno\n", lin + 1);

            for (col = 0; col < PROVAS; col++) {
                notas[lin][col] = entrada.nextDouble();
                media_aluno += notas[lin][col];
            }
            
            notas[lin][PROVAS] = media_aluno / PROVAS;
            media_turma += notas[lin][PROVAS];        
        }

        
        media_turma /= ALUNOS; // Média da Turma

        System.out.println("\nNotas e Média dos Alunos:");
        for (lin = 0; lin < ALUNOS; lin++) {
            
            System.out.printf("\nAluno %d: ", lin + 1);
            
            for (col = 0; col < PROVAS; col++) {
                
                System.out.printf("%2.2f ", notas[lin][col]);
            }
            System.out.printf("-Média %2.2f", notas[lin][PROVAS]);

            // Classificação aluno
            if(notas[lin][PROVAS]<media_turma){
                System.out.println("- Abaixo da média");
            } 
            else if(notas[lin][PROVAS] == media_turma){
                System.out.println("- Na média");
            } 
            else{
                System.out.println("- Acima da média");
            }
        }
        System.out.printf("\n\nMédia da turma: %2.2f\n", media_turma);
    }
}
