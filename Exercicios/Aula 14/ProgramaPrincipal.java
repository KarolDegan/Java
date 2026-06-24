public class ProgramaPrincipal {
    public static void main(String[] args) {
        Fatorial f = new Fatorial(); //É como criar uma nova estrutura, só que aqui a variavél f tem acesso aos metogos/função da classe Fatorial
        f.setValor(3); //enviando o valor desejado para fazer o fatorial
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());

    }
}
