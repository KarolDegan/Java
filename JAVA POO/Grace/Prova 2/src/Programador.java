public class Programador extends Funcionario {
    
    private String linguagem;
    private String sistOper;
    
    //Construtor
    public Programador(String nome, String mail, String linguagem){
        super(nome,mail);
        setLinguagem(linguagem);
    }

    //Metodos
    public void exibeDados(){
        super.exibeDados();
        System.out.printf("Linguagem: %s\n", linguagem);
        if(sistOper != null){
            System.out.printf("SistOper: %s\n", sistOper);
        }
        
    }
    
    //SET GET
    public String getSistOper() {
        return sistOper;
    }
    public void setSistOper(String sistOper) {
        this.sistOper = sistOper;
    }

    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
