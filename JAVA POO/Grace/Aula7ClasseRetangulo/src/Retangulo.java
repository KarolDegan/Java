public class Retangulo {
    //Atributos
    private double base, altura;

    // Construtor
    public Retangulo(double base, double altura){
        setAltura(altura);
        setBase(base);
    }

    public Retangulo(){
        setAltura(1);
        setBase(2);
    }

    //Metodos
    public double Area(){
        return getBase()*getAltura();
    }

    public double Perimetro(){
        return 2*getBase()+2*getAltura();
    }

    public boolean isQuadrado(){
        if (getBase() == getAltura()) return true;
        return false;
    }

    public void Infos(){
        System.out.printf("Retangulo\n");
        System.out.printf("Base: %.2f\n", getBase());
        System.out.printf("Altura: %.2f\n", getAltura());
        System.out.printf("Área: %.2f\n", Area());
        System.out.printf("Perimetro: %.2f\n", Perimetro());
        if(isQuadrado()){
            System.out.println("Quadrado: true");
        }else{
            System.out.printf("Quadrado: false");
        }
        
    }
    
    //GET SET
    public void setAltura(double altura){
       if(altura>0){
            this.altura = altura;
       }else{
            System.out.println("Altura invalida, mudando para altura padrão: 1");
            this.altura = 1;
       }
    }

    public double getAltura(){
        return altura;
    }

    public void setBase (double base){
        if(base>0){
            this.base = base;
        }else{
            System.out.println("Base invalida, mudando para base padrão: 2");
            this.base =2;
        }
        
    }

    public double getBase(){
        return base;
    }

}
