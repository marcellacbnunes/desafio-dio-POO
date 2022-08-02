import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso1.setTitulo("curso javaScript");
    curso1.setDescricao("descricao curso javaScript");
    curso1.setCargaHoraria(4);



    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("mentoria de java");
    mentoria1.setDescricao("descricao mentoria java");
    mentoria1.setData(LocalDate.now());
    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMarcella = new Dev();
        devMarcella.setNome("Marcella");
        devMarcella.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Marcella: " + devMarcella.getConteudoInscritos());
        devMarcella.progredir();
        devMarcella.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Marcella: " + devMarcella.getConteudoInscritos());
        System.out.println("Conteudos concluidos Marcella: " + devMarcella.getConteudosConcluidos());
        System.out.println("XP "+ devMarcella.calcularTotalXp() );
        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devMarcella.getConteudoInscritos());

        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao: " + devMarcella.getConteudoInscritos());
        System.out.println("Conteudos concluidos Joao: "+devJoao.getConteudosConcluidos());
        System.out.println("XP " + devJoao.calcularTotalXp());


    }
}
