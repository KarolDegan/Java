public class Aula02 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.carga = 10;
        //c1.ponta = 0.7f;  atributos privados
        c1.modelo = "Bic";
        //c1.tampada = true;
        
        //Chamada para método
        c1.destampar(); // o método contudo é publico e esse como está dentro da classe pode alterar o atributo privado da própria classe
        c1.status();
        c1.rabiscar();

        
    }
}
