/*11.	Dados a altura e o sexo de uma pessoa, determine seu peso ideal de acordo com as fórmulas a seguir:
•	para homens o peso ideal é 72.7altura  58
•	para mulheres o peso ideal é 62.1altura  44.7
Nota: Faça a leitura do sexo como um valor inteiro 1- para Homens e 2 – para Mulheres.*/

public class Ex11 {
    public static void main(String[] args) throws Exception {
        
        Pessoa p = new Pessoa(2,1.63);

        System.out.printf("Peso ideial: %.2fkg", p.pesoIdeal());
    }
}
