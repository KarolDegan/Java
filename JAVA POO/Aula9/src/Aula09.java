public class Aula09 {
    public static void main(String[] args){
        People p[] = new People[2];
        Livro l[] = new Livro[3];

        p[0] = new People("Pedro", 22, "M");
        p[1] = new People("Maria", 26, "F");

        l[0] = new Livro("Jogos vorazes","Suzanne Collins",300,p[0]);
        l[1] = new Livro("Os miseraveis", "Vitor Hugo", 1200, p[1]);
        l[2] = new Livro ("Naruto", "Masashi Kishimoto", 10000, p[0]);

        l[0].abrir();
        l[0].folhear(50);
        System.out.println("alguma coisa " + l[0].detalhes());
    }
}
