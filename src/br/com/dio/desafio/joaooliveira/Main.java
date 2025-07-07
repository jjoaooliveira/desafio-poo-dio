package br.com.dio.desafio.joaooliveira;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import br.com.dio.desafio.joaooliveira.dominio.Bootcamp;
import br.com.dio.desafio.joaooliveira.dominio.Content;
import br.com.dio.desafio.joaooliveira.dominio.Course;
import br.com.dio.desafio.joaooliveira.dominio.Dev;
import br.com.dio.desafio.joaooliveira.dominio.Mentoring;

public class Main {
    public static void main(String[] args) {
        Mentoring mentoria = new Mentoring("Mentoria de java", "Descrição mentoria java", LocalDate.now());
        Course curso1 = new Course("Curso java", "Descrição curso java", 8);
        Course curso2 = new Course("Curso js", "Descrição curso js", 4);
        Set<Content> cursos = new LinkedHashSet<>();
        cursos.addAll(List.of(curso1, curso2, mentoria));

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer", cursos);

        Dev devJoao = new Dev("João Oliveira");
        devJoao.subscribeToBootcamp(bootcamp);
        
        System.out.println("\nConteúdos Inscritos João:" + devJoao.getSubscribedContents());
        devJoao.makeProgress();
        devJoao.makeProgress();
        System.out.println("-------------------------------------");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribedContents());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getCompletedContents());
        System.out.println("XP:" + devJoao.calculateTotalXp());
        System.out.println("-------------------------------------");

    }
}
