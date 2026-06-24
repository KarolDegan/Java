public class Livro implements Publicação {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private People leitor;

    // Métodos

    public String detalhes(){
        return "Livro{" + "titulo=" + titulo + ", \nautor=" + autor + ", \ntotPagina=" + totPaginas + ", \npagAtual=" + pagAtual + " \naberto=" + aberto + ", \nleitor=" + 
        leitor.getNome() + '}'; // para mostrar o nome em vez da referencia
    }
    
    //Contrutor
    public Livro (String titulo, String autor, int totPaginas, People leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    //Metodos especiais
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public People getLeitor() {
        return leitor;
    }
    public void setLeitor(People leitor) {
        this.leitor = leitor;
    }

    //Métodos da Interface

    @Override
    public void abrir() {
        this.aberto = true;
    }
    
    @Override
    public void fechar(){
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
