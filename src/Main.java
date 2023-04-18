import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Java", "POO", 100);
        System.out.println(curso);

        Curso curso2 = new Curso("Angular", "Curso em Angular 15", 50);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now());
        System.out.println(mentoria);

        Mentoria mentoria2 = new Mentoria("Mentoria Angular", "Descrição Mentoria Angular", LocalDate.now());
        System.out.println(mentoria2);

    }
}