public class Veiculo {
    protected String modelo, placa;
    protected int anofab;
    protected double valor;
    
    //Contrutor
    public Veiculo (String pModelo, String pPlaca, int pAnoFabr, double pValor){
        setModelo(pModelo);
        setPlaca(pPlaca);
        setAnofab(pAnoFabr);
        setValor(pValor);
    }

    //Métodos
    public void deprecia(float taxa) {
		setValor(valor - valor * taxa/100);
	}

	public void imprime(){
		System.out.printf( 
			" \nVeiculo: %s\nPlaca: %7s\nAno: %4d\nValor: R$%.2f\n",  
			modelo, placa, anofab, valor);
    }


    //GET SET
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo( )  {
        return this.modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }

    public void setAnofab(int anofab) {
        this.anofab = anofab;
    }
    public int getAnoFabr() {
        return anofab;
    }

    public void setValor(double valor) {
        if (valor >= 0)	this.valor = valor;
    	else    this.valor = 0;
	}

    public double getValor(){
        return valor;
    }
}