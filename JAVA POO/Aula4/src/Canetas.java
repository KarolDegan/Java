public class Canetas {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Canetas(String m, float p){ //obriga que na declaração do objeto ja se definam os parametros modelo e ponta
        this.tampada = true;
        this.cor = "Azul";

        this.modelo = m;
        this.ponta = p;
    }

    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c; 
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("STATUS: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
