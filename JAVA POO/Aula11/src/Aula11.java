public class Aula11 {
    public static void main(String[] args) throws Exception {
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        System.out.println(v1.toString());

        Alun a1 = new Alun();
        a1.setNome("Augusto");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("João");
        b1.setBolsa(11);
        b1.pagarMensalidade();
    }
}
