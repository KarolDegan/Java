public class Instrutor extends Funcionario{
    
    private String disciplina;

    //Contrutor
    public Instrutor(String nome, String mail, String disciplina){
        super(nome,mail);
        setDisciplina(disciplina);
    }

    //Métodos
    public void exibeDados(){
        super.exibeDados();
        System.out.printf("Disciplina: %s\n", disciplina);
    }

    //GET SET
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
