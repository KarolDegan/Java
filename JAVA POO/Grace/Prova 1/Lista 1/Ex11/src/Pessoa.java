public class Pessoa {
    //atributos
    private int sexo;
    private double altura;

    // Construtor
    public Pessoa (int sexo, double altura){
        setSexo(sexo);
        setAltura(altura);
    }


    // SET GET
    public void setSexo(int s){
        sexo = s;
    }
    public int getSexo(){
        return sexo;
    }

    public void setAltura(double a){
        altura = a;
    }
    public double getAltura(){
        return altura;
    }

    //metódos
    public double pesoIdeal(){

        double peso = 0;

        if(getSexo() == 1){
            peso = (getAltura() * 72.7) - 58;
        }
        else if (getSexo() == 2){
            peso = (getAltura() * 62.1) - 44.7;
        }

        return peso;
    }
}
