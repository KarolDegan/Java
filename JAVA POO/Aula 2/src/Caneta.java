public class Caneta {
   /*Atributos */
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //Metodos
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro!, esta caneta está tampada");
            System.out.printf("Deseja destampar?");

        } else{
            System.out.println("Rabiscado!");
        }
    } 

    public void tampar(){
        this.tampada = true; // auto referencia this.atributo
    }

    public void destampar(){
        this.tampada = false;
    }



}
