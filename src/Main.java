import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //Instanciando os cursos
        Curso curso1 = new Curso("Curso Java", "Aprendendo os conceitos de POO.", 8);
        Curso curso2 = new Curso("Curso Javascript", "Aprendendo o básico de Javascript.", 4);

        //Instanciando as mentorias
        Mentoria mentoria = new Mentoria("Mentoria de Java", "Tirando dúvidas sobre Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria de Javascript", "Tirando dúvidas sobre Javascript", LocalDate.now());

        //Instanciando o bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "GFT Start Java.");

        //adicionando os cursos e as mentorias ao bootcamp
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria2);

        //Instanciando Dev Joao
        Dev joao = new Dev("João");

        //Inscrevendo Joao no bootcamp
        joao.inscreverBootcamp(bootcamp);

        //Printando conteudos incritos ao incio do bootcamp
        System.out.println("Conteúdos Inscritos João: " + joao.getConteudosInscritos());
        //Printando nivel do Joao antes de progredir
        System.out.println("Nível: " + joao.getNivel());
        System.out.println("XP para o próximo nível: " + joao.getXpAtual() + "/" + joao.getXpRequerido());
        System.out.println("XP Total: " + joao.calcularTotalXp());

        //Progredindo no bootcamp finalizando 1 conteudo
        joao.progredir();

        //Printando conteudos incritos e concluidos
        System.out.println("-----------------");
        System.out.println("Conteúdos Inscritos João: " + joao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + joao.getConteudosConcluidos());
        //Printando novo progresso de nivel e xp após concluir conteudos
        System.out.println("Nível: " + joao.getNivel());
        System.out.println("XP para o próximo nível: " + joao.getXpAtual() + "/" + joao.getXpRequerido());
        System.out.println("XP Total: " + joao.calcularTotalXp());

        System.out.println("*************************************************");

        //Instanciando Dev Paulo
        Dev paulo = new Dev("Paulo");

        //Inscrevendo Paulo no bootcamp
        paulo.inscreverBootcamp(bootcamp);

        //Printando conteudos incritos ao incio do bootcamp
        System.out.println("Conteúdos Inscritos Paulo: " + paulo.getConteudosInscritos());
        //Printando nivel do Paulo antes de progredir
        System.out.println("Nível: " + paulo.getNivel());
        System.out.println("XP para o próximo nível: " + paulo.getXpAtual() + "/" + paulo.getXpRequerido());
        System.out.println("XP Total: " + paulo.calcularTotalXp());

        //Progredindo no bootcamp finalizando 4 conteudos
        paulo.progredir();
        paulo.progredir();
        paulo.progredir();
        paulo.progredir();

        //Printando conteudos incritos e concluidos
        System.out.println("-----------------");
        System.out.println("Conteúdos Inscritos Paulo: " + paulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo: " + paulo.getConteudosConcluidos());
        //Printando novo progresso de nivel e xp após concluir conteudos
        System.out.println("Nível: " + paulo.getNivel());
        System.out.println("XP para o próximo nível: " + paulo.getXpAtual() + "/" + paulo.getXpRequerido());
        System.out.println("XP Total: " + paulo.calcularTotalXp());
    }

}
