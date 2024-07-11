package dio_desafio_dominio.biblioteca;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Livro de Java");
        livro1.setDescricao("Descrição do Livro de Java");
        livro1.setTotalPaginas(200);

        Livro livro2 = new Livro();
        livro2.setTitulo("Livro de JavaScript");
        livro2.setDescricao("Descrição do Livro de JavaScript");
        livro2.setTotalPaginas(150);

        Leitura leitura = new Leitura();
        leitura.setTitulo("Leitura de Java");
        leitura.setDescricao("Descrição da Leitura de Java");
        leitura.setData(LocalDate.now());

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNome("Biblioteca de Desenvolvedores");
        biblioteca.setDescricao("Biblioteca para Desenvolvedores");
        biblioteca.getConteudos().add(livro1);
        biblioteca.getConteudos().add(livro2);
        biblioteca.getConteudos().add(leitura);

        Usuario usuarioCamila = new Usuario();
        usuarioCamila.setNome("Camila");
        usuarioCamila.inscreverBiblioteca(biblioteca);
        System.out.println("Livros Escolhidos Camila:" + usuarioCamila.getLivrosEscolhidos());
        usuarioCamila.progredir();
        usuarioCamila.progredir();
        System.out.println("-");
        System.out.println("Livros Escolhidos Camila:" + usuarioCamila.getLivrosEscolhidos());
        System.out.println("Livros Concluídos Camila:" + usuarioCamila.getLivrosConcluidos());
        System.out.println("XP:" + usuarioCamila.calcularTotalXp());

        System.out.println("-------");

        Usuario usuarioJoao = new Usuario();
        usuarioJoao.setNome("João");
        usuarioJoao.inscreverBiblioteca(biblioteca);
        System.out.println("Conteúdos Inscritos João:" + usuarioJoao.getLivrosEscolhidos());
        usuarioJoao.progredir();
        usuarioJoao.progredir();
        usuarioJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + usuarioJoao.getLivrosEscolhidos());
        System.out.println("Conteúdos Concluídos João:" + usuarioJoao.getLivrosConcluidos());
        System.out.println("XP:" + usuarioJoao.calcularTotalXp());
    }
}
