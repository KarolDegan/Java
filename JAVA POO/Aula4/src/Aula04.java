public class Aula04 {
    public static void main(String[] args) throws Exception {
        Canetas c1 = new Canetas("Bic",0.5f); //parâmetros obrigatórios inseridos no método construtor 
        c1.modelo = "Bic"; // acesso direto, é possivel pq o atributo é público
        c1.setModelo("Fabber");
        //c1.ponta = 0.5f; // Erro pois o atributo é privado, preceisa do metodo set
        c1.setPonta(0.5f);
        c1.status();
        
        // O método get serve para acessar uma informação já estabelecida
        
        Canetas c2 = new Canetas("Bic",0.5f);
        c2.setModelo("Bic");
        c2.setPonta(0.7f);

        System.out.println("Modelo de c2: " + c2.modelo); // é possível pq o atributo é público c2.getModelo
        System.out.println("Ponta de c2: " + c2.getPonta()); // como o atributo é privado é preciso usar o metodo acessor
        
    }
}
