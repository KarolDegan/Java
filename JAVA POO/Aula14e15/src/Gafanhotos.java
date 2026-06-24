public class Gafanhotos extends Pessoa {
    private String login;
    private int totAssistido;

    //Construtor   
    public Gafanhotos(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    //Metodos
    public void viuMaisUm(){

    }


    //gets e sets
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }


    @Override
    public String toString() {
        return "Gafanhotos [" + super.toString() + "\nlogin=" + login + ", \ntotAssistido=" + totAssistido + "]";
    }

}
