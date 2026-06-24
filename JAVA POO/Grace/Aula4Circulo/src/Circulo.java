import java.lang.Math.*;
public class Circulo {
    
    //Atributos
    private double raio;

    //Construtor
    public Circulo(double r){

        setRaio(r);

    }

    //Métodos
    public void setRaio(double r){

        if(r<0) System.out.println("O raio não pode ser negativo");
        else raio = r;

    }

    public double getRaio(){

        return raio;

    }

    public double diametroCir(){

        return 2*raio;

    }

    public double areaCir(){

        return Math.PI * Math.pow(raio, 2);

    }

    public double perimetroCir(){

        return 2*Math.PI*raio;

    }

    public void exibeDados(){

        System.out.println("Dados do circulo de raio: " + getRaio());
        System.out.printf("%-15s: %5.2f\n", "Diâmetro", diametroCir());
        System.out.printf("%-15s: %5.2f\n", "Circunferência", perimetroCir());
        System.out.printf("%-15s: %5.2f\n", "Área", areaCir());

    }

}
