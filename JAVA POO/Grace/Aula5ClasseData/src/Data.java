public class Data {
    private int mes;
    private int dia;
    private int ano;

    //Construtores
    public Data (int d, int m, int a){
        setData(d,m,a);
    }

    public Data (int m, int a){
		setData(1, m, a);
	}

	public Data (int a){
		setData(1, 1, a);
	}

    //Validação
    public void setData(int d,int m,int a){
        if (m>0 && m<=12)
            mes = m;

        else{
            mes = 1;
            System.out.println("Mês " + m + " invalido. Configurado mês = 1.");
        }

        ano = a;
        dia = checkDia(d);
    }

    private int checkDia (int diaTeste){

        int diaMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if(bissexto() && mes == 2) diaMes[2] = 29;

        if (diaTeste > 0 && diaTeste <= diaMes[mes]) return diaTeste;

        System.out.println("Dia " + diaTeste + " invalido. Configurado dia = 1.");
            return 1;
    }

    //Bissexto
    private boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    //Geters
    public int getDia (){
		return dia;
	}
	
    public int getMes (){
            return mes;
    }

    public int getAno (){
            return ano;
    }

    public String toString(){
        return dia +"/" + mes + "/" + ano;
    }

    
}
