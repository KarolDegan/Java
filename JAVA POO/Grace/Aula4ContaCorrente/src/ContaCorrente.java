public class ContaCorrente {
    //Atributos
    private int num;

    private String titular;

    private double saldo;

    //Construtor
    public ContaCorrente(int n, String t, double s){
        setNum(n);
        setTitular(t);
        setSaldo(s);
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

    public void setSaldo(double s){
        if(s>=0) saldo = s;
    }

    public double getSaldo(){
        return saldo;
    }

    //
    public void deposito(double d){
        if(d>0) saldo += d;
        else System.out.println("Valor de depósito invalido");
    }

    public void saque(double s){
        if(s>0 && saldo>=s) saldo -= s;
        else System.out.println("Valor de saque invalido");
    }

    public void verDados(){
        System.out.printf("\n======================================================\n");

        System.out.printf("%-15s: %07d", "Conta", getNum());
        System.out.printf("\n%-15s: %7s", "Titular", getTitular());
        System.out.printf("\n%-15s: %5.2f", "Saldo", getSaldo());

        System.out.printf("\n======================================================\n");
    }

}
