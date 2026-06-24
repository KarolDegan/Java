public class Acumulador {
    // Atributos
    private double soma;
    private int cont;

    // Construtor
    public Acumulador() {
        this.soma = 0;
        this.cont = 0;
    }

    // Método para adicionar valor e atualizar contagem
    public void Totalize(double valor) {
        this.soma += valor;
        this.cont++;
    }

    // Métodos GET
    public double Total() {
        return soma;
    }

    public int Contagem() {
        return cont;
    }

    // Método para calcular a média
    public double Media() {
        if (cont == 0) {
            return 0; // Evita divisão por zero
        }
        return Total() / Contagem();
    }

    public static void main(String[] args) throws Exception {
        Acumulador ac = new Acumulador();
        ac.Totalize(10);
        ac.Totalize(20);
        System.out.println(ac.Contagem());
        System.out.println(ac.Total());
        System.out.println(ac.Media());
    }
}
