public class Aula10 {
    public static void main(String[] args) throws Exception {
        Individuo p1 = new Individuo();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Predro");
        p2.setNome("Gabriel");
        p3.setNome("Amanda");
        p4.setNome("Gabi");

        p2.setCurso("Pediatria");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
