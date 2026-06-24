import javax.sound.midi.Soundbank;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    //Metodos Especiais
    private int getRounds(){
        return this.rounds;
    }
    public void setRounds(int r){
        this.rounds = r;
    }

    public boolean getAprovado(){
        return this.aprovado;
    }
    public void setAprovado(boolean a){
        this.aprovado = a;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setLutador(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    //Metodos

    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1 != l2) && (l1.getCategoria() == l2.getCategoria())){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2; 
        } else{
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar(){
        if(this.aprovado){

            desafiado.apresentar();
            desafiante.apresentar();
            //valor aleatoria
            double ale = Math.random();
            int vencedor = (int) (ale*(3-0));
            //Escolhendo vencedor
            System.out.println("------Lutando-------");
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //Vitoria Desafiado
                    System.out.println("Vitória desafiado: " + this.desafiado);
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //Vitória Desafiante
                    System.out.println("Vitória Desafiante: " + desafiante);
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                default:
                    break;
            }


        } else{
            System.out.println("Luta não pode acontecer!");
        }
    }
}
