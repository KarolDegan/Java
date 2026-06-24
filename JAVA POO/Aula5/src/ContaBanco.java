public class ContaBanco {
    public int numConta;
    protected String tipo; // CC  para conta corrente (Saldo inicial 50) CP para conta polpança (Saldo inicial 150)
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual(){
        System.out.println("--------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDodo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("STATUS: " + this.status);
    }
    
    public void abrirConta(String t){
        
        this.tipo = t;
        
        if (t == "CC"){
            this.saldo = 50.0;
        } else {
            this.setSaldo(150);
        }
        this.status = true;
    }

    public void fecharConta(){
        if(this.saldo == 0){
            this.status = false;
        } else {
            System.out.println("Não foi possivel fechar a Conta");
        }
        
    }

    public void depositar(double v){
        if(this.status == true){
            //this.saldo += v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Dinheiro Depositado com sucesso!");
        }else{
            System.out.println("Impossivel depositar. Conta fechada");
        }     
    }

    public void sacar(double s){
        if(this.status){
            if (this.saldo < s){
            System.out.println("Não há dinheiro o suficiente!");
            } else {
                this.saldo -= s;
                System.out.println("Dinheiro Sacado com sucesso!" + this.getDodo());   
            } 
        } else{
            System.out.println("Impossivel sacar");
        }
    }

    public void pargarMensalidade(){
        double v;
        if (this.tipo == "CC"){
            v = 12;
        } else{
            v = 20;
        }
        if (this.status == true){
            if(this.saldo > v){
                this.saldo -= v;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Imposiivel pagar. Conta fechada");
        }
        
    }

    //Metodos acessores e Modificadores

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDodo(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }
    

}
