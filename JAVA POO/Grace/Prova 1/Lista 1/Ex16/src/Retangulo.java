public class Retangulo{
    // atributos
    int [] p1 = new int [2];
    int [] p2 = new int [2];

    public Retangulo(int x1, int y1, int x2, int y2){
        p1[0] = x1;
        p1[1] = y1;
        p2[0] = x2;
        p2[1] = y2;
    }

    public int Base(){
        int base = p2[0] - p1[0];
        return base;
    }

    public int Altura(){
        int altura = p1[1] - p2[1];
        return altura;
    }

    public int Area(){
        return Altura()*Base();
    }

    public boolean isDentro(int x, int y){
        if((x <= p2[0] && x >= p1[0]) && (y <= p1[1] && y >= p2[1])) return true;
        return false;
    }

}