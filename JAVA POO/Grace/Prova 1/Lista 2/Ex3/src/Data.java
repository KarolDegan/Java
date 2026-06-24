public class Data {
    //Atributos
    int dia;
    int mes;
    int ano;

    int vetormeses [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    //Construtores
    public Data(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public Data(int mes, int ano){
        setMes(mes);
        setAno(ano);
        setDia(1);
    }

    public Data(int ano){
        setDia(1);
        setMes(1);
        setAno(ano);
    }

    //Métodos
    public boolean bissexto(int ano) {
        if (ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0)){
            vetormeses[2] = 29;
            return true;
        } return false;
    }

    public void getData(){
        System.out.printf("%d/%d/%d", dia, mes, ano);
    }

    //GET SET
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if(dia>0 && dia<= vetormeses[mes]) this.dia = dia;
        else{
            System.out.println("Dia invalido. Dia padrão 1");
            this.dia = 1;
        }
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if(mes > 0 && mes <= 12)  this.mes = mes;
        else {
            System.out.println("Mes inválido, Mes padrão 1");
            this.mes = 1;
        }
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        bissexto(ano);
        this.ano = ano;
    }

    public static void main(String[] args) throws Exception {
        Data d = new Data(1996);
        
    }
}
