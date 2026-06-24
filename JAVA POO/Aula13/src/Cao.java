public class Cao {
    
    public void reagir(String frase){
        if(frase == "toma comida" || frase == "olá"){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }


    public void reagir(int hora){
        if(hora<12){
            System.out.println("Abanar");
        } else if(hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }


    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        } else {
            System.out.println("Latir");
        }
    }
}
