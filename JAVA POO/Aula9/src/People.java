public class People {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Metodos especiais
    public People(String no, int id, String sexo){
        this.nome = no;
        this.idade = id;
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }

    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }

    //Métodos
    public void fazerAniversario(){
        this.idade ++;
        
    }
}
