public class Individuo {
    private String nome;
    private int idade;
    private char sexo;


    public void fazAniversario(){
        this.idade ++;
    }


    /*public Individuo(String no, int id, char sexo){
        this.nome = no;
        this.idade = id;
        this.sexo = sexo;
    }*/


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    @Override //Esses métodos especiais podem ser gerados altomaticamente clicando na classe
    public String toString() {
        return "Individuo [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    }
    
    
}
