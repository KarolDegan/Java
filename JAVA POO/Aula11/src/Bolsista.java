public class Bolsista extends Alun {
    private  int bolsa;

    public void renovarBolsa(){

    }

    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagamento Facilitado");
    }


    
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
