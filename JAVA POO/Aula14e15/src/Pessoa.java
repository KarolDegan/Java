public abstract class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private float experiencia;

    //Construtor    
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    //Metodos
    public void ganharExp(){
        this.experiencia++;
    }
    
    //Gets e Sets
    public float getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", \nidade=" + idade + ", \nsexo=" + sexo + ", \nexperiencia=" + experiencia + "]";
    }
    

}
