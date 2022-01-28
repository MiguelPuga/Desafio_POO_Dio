import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + joao.getConteudosInscritos());
        joao.progredir();
        System.out.println("***");
        System.out.println("Conteúdos Inscritos João: " + joao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + joao.getConteudosConcluidos());
        System.out.println("XP: " + joao.calcularTotalXp());

        System.out.println("*****************");

        Dev paulo = new Dev();
        paulo.setNome("Paulo");
        paulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo: " + paulo.getConteudosInscritos());
        paulo.progredir();
        paulo.progredir();
        paulo.progredir();
        System.out.println("***");
        System.out.println("Conteúdos Inscritos Paulo: " + paulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo: " + paulo.getConteudosConcluidos());
        System.out.println("XP: " + paulo.calcularTotalXp());
    }

}
