public class Caminhao extends Veiculo{
    // Atributos
    double capacidade;
    int eixos;

    // Construtor
    public Caminhao(String modelo, String placa, int anofab,
			double capacidade, int eixos, double valor) {
	super (modelo, placa, anofab, valor);
	setCapacidade(capacidade);
    setEixos(eixos);
    }

    //Métodos
    public void imprime( ){
        System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
        System.out.printf("\nFabr: %4d\nCapacidade: %.2fkg", anofab, 	capacidade);
        System.out.printf("\n%02d Eixos\nR$ %.2f\n", eixos, valor);
    }

    //GET SET

    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }
    public double getCapacidade(){
        return capacidade;
    }

    public void setEixos(int eixos){
        this.eixos = eixos;
    }
    public int getEixos(){
        return eixos;
    }
}