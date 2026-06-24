public class Ex14 {

    static void somar (int a, int b){ // precisa do static pq main é um metodo static
        int soma = a + b;
        System.out.printf("\nA soma é: %d", soma);
    }

    static int subitrai (int a, int b){
        int sub;
        if (a>b){
            sub = a - b;
        } else {
            sub = b -a ;
        }
        return sub;
    }

    public static void main(String[] args) throws Exception {
        somar(5,3);
        
        int menos = subitrai(5, 3);
        System.out.printf("\nA subtração é = %d",menos);

        System.out.printf("\n", Teste.multiplica(5,3));
    }
}
