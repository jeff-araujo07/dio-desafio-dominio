package dio_desafio_dominio.biblioteca;


public class Livro extends Conteudo {
    private int totalPaginas;

    @Override
    public double calcularXp() {
        return XP_PADRAO * totalPaginas;
    }

    public Livro() {}

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", totalPaginas=" + totalPaginas +
                '}';
    }
}
