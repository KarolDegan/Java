public class Aula14e15 {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 1");

        Gafanhotos g[] = new Gafanhotos[2];
        g[0] = new Gafanhotos("Amanda", 21, 'f', "Amandinha");
        //System.out.println(g[0].toString());

        Visualizacao vis = new Visualizacao(g[0],v[0]);

        System.out.println(vis.toString());
    }
}
