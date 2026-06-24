public class Funcionario {
    
    protected String nome;
    protected String mail;
    protected int idade = -1;

    //Contrutor
    public Funcionario(String nome, String mail){
        setNome(nome);
        setMail(mail);
    }

    public Funcionario(String nome, String mail, int idade){
        setNome(nome);
        setMail(mail);
        setIdade(idade);
    }

    //Metodos
    public void exibeDados(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("mail: %s\n", mail);
        if(idade != -1){
            System.out.printf("Idade: %d\n", idade);
        }
    }
    

    //GET SET
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade>=0) this.idade = idade;
        else{
            System.out.println("idade invalida, mudando para idade padrão 20");
            this.idade = 20;
        } 
    }
}
