public class Aula12 {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();

        m.setPeso(80.2f);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        r.locomover();
        r.alimentar();
        r.emitirSom();

        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        Canguru c = new Canguru();
        c.locomover();
    }
}
