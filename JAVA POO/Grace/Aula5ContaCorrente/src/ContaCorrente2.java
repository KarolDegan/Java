public class ContaCorrente2 {
    //Atributos
    private int num;

    private String titular;

    private double saldo;

    private double limite;

    //Construtor
    public ContaCorrente2(int n, String t, double s, double l){
        setNum(n);
        setTitular(t);
        setSaldo(s);
        setLimite(l);
    }

    public ContaCorrente2(int n, String t, double s){
        setNum(n);
        setTitular(t);
        setSaldo(s);
        setLimite(1000);
    }
    public ContaCorrente2(int n, String t){
        setNum(n);
        setTitular(t);
        setSaldo(0);
        setLimite(0);
    }

    //Metodos
    private void setNum(int n){
        if(n>=0) num = n;
    }

    public int getNum(){
        return num;
    }

    public void setTitular(String t){
        titular = t;
    }

    public String getTitular(){
        return titular;
    }

    private void setSaldo(double s){
        if(s>=0) saldo = s;
    }

    public double getSaldo(){
        return saldo;
    }

    private void setLimite(double l) {
        if(l>=0) limite = l;
        else limite = 1000;
    }
    public double getLimite(){
        return limite;
    }


    //
    public void deposito(double d){
        if(d>0) saldo += d;
        else System.out.println("Valor de depósito invalido");
    }

    public void saque(double s){
        if(s<0) System.out.println("Valor de saque invalido");
        else if (saldo+limite>=s) saldo -= s;
        else System.out.println("Falta de recursos");
    }

    public void verDados(){
        System.out.printf("\n======================================================\n");

        System.out.printf("%-15s: %07d", "Conta", getNum());
        System.out.printf("\n%-15s: %7s", "Titular", getTitular());
        System.out.printf("\n%-15s: %5.2f", "Saldo", getSaldo());
        System.out.printf("\n%-15s: %5.2f", "Limite", getLimite());

        System.out.printf("\n======================================================\n");
    }

}
