package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private int nivel = 1;
    private int xpRequerido = 25;
    private int xpAtual = 0;

    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp)
    {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }

    public void progredir()
    {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            xpAtual += conteudo.get().calcularXp();
            calcularNivel();
            this.conteudosInscritos.remove((conteudo.get()));
        }else
        {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void calcularNivel()
    {
        while(xpAtual >= xpRequerido)
        {
            xpAtual -= xpRequerido;
            nivel++;
            xpRequerido *= 2;
        }
    }

    public int calcularTotalXp()
    {
        return this.conteudosConcluidos.stream().mapToInt(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public int getNivel() {
        return nivel;
    }

    public int getXpRequerido() {
        return xpRequerido;
    }

    public int getXpAtual() {
        return xpAtual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
