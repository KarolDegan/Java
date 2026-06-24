public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodos Especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    //Metodos Acessores
    private String getNome(){
        return this.nome;
    }
    private void setNome(String n){
        this.nome = n;
    }

    private String getNacionalidade(){
        return this.nacionalidade;
    }
    private void setNacionalidade(String nas){
        this.nacionalidade= nas;
    }

    private int getIdade(){
        return this.idade;
    }
    private void setIdade(int i){
        this.idade = i;
    }

    private float getAltura(){
        return this.altura;
    }
    private void setAltura(float a){
        this.altura = a;
    }

    private float getPeso(){
        return this.peso;
    }
    private void setPeso(float pes){
        this.peso = pes;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(){
        if(this.peso <52.2){
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9 ){
            this.categoria = "Medio";
        } else if (this.peso <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    private int getVitorias(){
        return this.vitorias;
    }
    private void setVitorias(int v){
        this.vitorias = v;
    }

    private int getDerrotas(){
        return this.derrotas;
    }
    private void setDerrotas(int d){
        this.derrotas = d;
    }

    private int getEmpate(){
        return this.empates;
    }
    private void setEmpate(int e){
        this.empates = e;
    }
    //Metodos

    public void apresentar(){
        System.out.println("APRESENTAÇÂO---------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpate());
    }

    public void status(){
        System.out.println("-------STATUS----------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Peso: " + this.getPeso() + "Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpate());
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpate(this.getEmpate()+1);
    }

    
}
