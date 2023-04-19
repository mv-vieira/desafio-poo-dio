import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Conteudo curso = new Curso("Java", "POO", 100);
//        System.out.println(curso);

        Conteudo curso2 = new Curso("Angular", "Curso em Angular 15", 50);
//        System.out.println(curso2);

        Conteudo mentoria = new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now());
//        System.out.println(mentoria);

        Conteudo mentoria2 = new Mentoria("Mentoria Angular", "Descrição Mentoria Angular", LocalDate.now());
//        System.out.println(mentoria2);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java / Angular Developer");
        bootcamp.setDescricao("Um Bootcamp desenvolvido pelo Banco Pan");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria2);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("-");
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("Conteúdos Inscritos após progressão Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("Xp atual: " + devMatheus.calcularTotalXp());


        System.out.println("--------------");


        Dev devMikaela = new Dev();
        devMikaela.setNome("Mikaela");
        devMikaela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mikaela: " + devMikaela.getConteudosInscritos());
        System.out.println("-");
        devMikaela.progredir();
        System.out.println("Conteúdos Inscritos após progressão Mikaela: " + devMikaela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mikaela: " + devMikaela.getConteudosConcluidos());
        System.out.println("Xp atual: " + devMikaela.calcularTotalXp());


    }
}