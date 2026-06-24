public class Aluno extends Individuo {
    
    private int matricula;
    
    private String curso;


    public void cancelarMatricula(){
        System.out.println("Metricula será cancelada");
    }


    //public Aluno(){

    


    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
