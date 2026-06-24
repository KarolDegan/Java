public abstract class Animal {
    private float peso;
    private int idade;
    private int menbros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();



    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getMenbros() {
        return menbros;
    }
    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }
}
