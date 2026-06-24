public class Ex1 {
    //Atributos
    private int n;

    //Contrutor
    public Ex1(int n){
        setN(n);
    }

    //GET SET
    public void setN(int n){
        this.n = n;
    }

    public int getN(){
        return n;
    }

    //Metodo
    public boolean isPar(){
        if(n%2 == 0) return true;
        return false;
    }

    public boolean isPrimo(){
        if(n<2) return false;
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public int Fatorial(){
        if(n<0) return 0;
        else if(n<2) return 1;
        int i = 1 ;
        int f = 1;
        while(i<=n){
            f *= i;
            i++;
        }
        return f;        
    }

    public static void main(String[] args) {
        Ex1 n = new Ex1(7);

        System.out.println(n.isPar());
        System.out.println(n.isPrimo());
    }
}
