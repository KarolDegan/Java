public class Professor extends Individuo{
    private String especialidade;
    private float salario;


    /*public Professor(String no, int id, char sexo, String especialidade, float salario) {
        super(no, id, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }*/


    public void receberAumento(float a){
        this.salario += a;
    }


    

    
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
}
