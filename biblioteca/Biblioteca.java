package dio_desafio_dominio.biblioteca;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Biblioteca {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Usuario> usuariosInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Usuario> getUsuariosInscritos() {
        return usuariosInscritos;
    }

    public void setUsuariosInscritos(Set<Usuario> usuariosInscritos) {
        this.usuariosInscritos = usuariosInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca biblioteca = (Biblioteca) o;
        return Objects.equals(nome, biblioteca.nome) &&
                Objects.equals(descricao, biblioteca.descricao) &&
                Objects.equals(dataInicial, biblioteca.dataInicial) &&
                Objects.equals(dataFinal, biblioteca.dataFinal) &&
                Objects.equals(usuariosInscritos, biblioteca.usuariosInscritos) &&
                Objects.equals(conteudos, biblioteca.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, usuariosInscritos, conteudos);
    }
}
