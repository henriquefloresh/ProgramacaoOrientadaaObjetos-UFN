import java.util.ArrayList;

class Aluno {
    String nome;
    double nota1;
    double nota2;

    // Construtor
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando a lista de alunos
        ArrayList<Aluno> alunos = new ArrayList<>();

        // Adicionando alunos à lista
        alunos.add(new Aluno("Carlos", 7.5, 8.0));
        alunos.add(new Aluno("Maria", 5.0, 4.5));
        alunos.add(new Aluno("João", 6.0, 6.5));

        // Percorrendo a lista
        for (Aluno aluno : alunos) {

            double media = aluno.calcularMedia();

            System.out.println("Aluno: " + aluno.nome);
            System.out.println("Média: " + media);

            if (media >= 6) {
                System.out.println("Resultado: Aprovado");
            } else {
                System.out.println("Resultado: Reprovado");
            }

            System.out.println("----------------------");
        }
    }
}
