package pkg;
//ex1
import java.util.Scanner;

public class Disc {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClasseDisciplina d = new ClasseDisciplina();

        // a) Conteúdo original
        System.out.println(" Conteúdo ORIGINAL ");
        System.out.println("Nome: " + d.nome);
        System.out.println("Carga Horária: " + d.cargaHoraria);
        System.out.println("Professor: " + d.professor);

        // b) Entrada de dados
        System.out.println("\n Digite os novos valores ");

        System.out.print("Nome da disciplina: ");
        d.nome = scanner.nextLine();

        System.out.print("Carga horária: ");
        d.cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do professor: ");
        d.professor = scanner.nextLine();

        // c) Novo conteúdo
        System.out.println("\n Novo Conteúdo ");
        System.out.println("Nome: " + d.nome);
        System.out.println("Carga Horária: " + d.cargaHoraria);
        System.out.println("Professor: " + d.professor);

        scanner.close();
    }

}
