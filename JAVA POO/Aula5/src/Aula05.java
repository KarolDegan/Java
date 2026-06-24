public class Aula05 {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.estadoAtual();
        //
        p1.setNumConta(111111);
        p1.setDono("Jubilu");
        p1.estadoAtual();
        //
        p1.abrirConta("CC");
        p1.estadoAtual();
        //
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.estadoAtual();
        //
        p1.depositar(500);
        p2.depositar(50);
        p1.estadoAtual();
        p2.estadoAtual();
        //
        p1.sacar(150);
        p1.estadoAtual();
        //
        p2.sacar(300);
        //
        p2.fecharConta();
        //
        p2.sacar(200);
        p2.fecharConta();
        p2.estadoAtual();
        //
        p1.pargarMensalidade();
        p1.estadoAtual();

        p2.pargarMensalidade();
        
    }
}
