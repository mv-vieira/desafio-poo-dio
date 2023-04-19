import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Conteudo curso = new Curso("Java", "POO", 100);
        System.out.println(curso);

        Conteudo curso2 = new Curso("Angular", "Curso em Angular 15", 50);
        System.out.println(curso2);

        Conteudo mentoria = new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now());
        System.out.println(mentoria);

        Conteudo mentoria2 = new Mentoria("Mentoria Angular", "Descrição Mentoria Angular", LocalDate.now());
        System.out.println(mentoria2);

    }
}