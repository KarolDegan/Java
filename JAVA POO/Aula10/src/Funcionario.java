public class Funcionario extends Individuo{
    
    private String setor;
    private boolean trabalhando;

    
    
    

    public void mudarTrabalhando(){
        if (trabalhando){
            this.trabalhando = false;
        } else {
            this.trabalhando = false;
        }
    }


    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
