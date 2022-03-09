import com.sun.jdi.BooleanType;
import domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course curso = new Course();
        curso.setTitle("curso JAVA");
        curso.setDescription("descricao curso JAVA");
        curso.setWorkload(3);

        Course cursoJS = new Course();
        curso.setTitle("curso JS");
        curso.setDescription("descricao curso JS");
        curso.setWorkload(3);

        Content content = new Course();
        Content content1 = new Mentorship();

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("mentoria JAVA");
        mentorship.setDescription("descricao mentoria JAVA");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp JAVA Dev");
        bootcamp.setName("Bootcamp JAVA Dev description");
        bootcamp.getContents().add(curso);
        bootcamp.getContents().add(cursoJS);
        bootcamp.getContents().add(mentorship);

        Dev dev  = new Dev();
        dev.setName("dogra");
        dev.subscribeBootcamp(bootcamp);
        System.out.printf("Conteúdos inscritos dogra: %s %n", dev.getContentsSubscribed());
        dev.progress();
        System.out.printf("Conteúdos inscritos dogra: %s %n", dev.getContentsSubscribed());
        System.out.printf("Conteúdos concluídos dogra: %s %n", dev.getContentsFinished());
        System.out.printf("XP: %s %n", dev.calculateTotalXP());

        System.out.println("================================");

        Dev dev1 = new Dev();
        dev1.setName("jao");
        dev1.subscribeBootcamp(bootcamp);
        System.out.printf("Conteúdos inscritos jao: %s %n", dev1.getContentsSubscribed());
        dev1.progress();
        System.out.printf("Conteúdos inscritos jao: %s %n", dev1.getContentsSubscribed());
        System.out.printf("Conteúdos concluídos jao: %s %n", dev1.getContentsFinished());
        System.out.printf("XP: %s %n", dev1.calculateTotalXP());
    }
}
