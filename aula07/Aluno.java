package pkg;

import java.util.Scanner;

public class Aluno {
    public String nome;
    public Float nota1;
    public Float nota2;
    public Float nota3;

    public Aluno(String n, Float n1, Float n2, Float n3) {
        nome = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public boolean calcularMedia() {
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media do aluno: " + media);
        if (media >= 7) {
            System.out.println("Resulado: Aprovado");
            return true;
        } else {
            System.out.println("Resultado: Reprovado");
            return false;
        }
    }
    public void maiorNota() {
        if (nota1 >= nota2 && nota1 >= nota3) {
            System.out.println("Maior nota foi a nota 1: " + nota1);
        } else if (nota2 >= nota1 && nota2 >= nota3) {
            System.out.println("Maior nota foi a nota 2: " + nota2);
        } else {
            System.out.println("Maior nota foi a nota 3: " + nota3);
        }
    }
    public void menorNota() {
        if (nota1 <= nota2 && nota1 <= nota3) {
            System.out.println("Menor nota foi a nota 1: " + nota1);
        } else if (nota2 <= nota1 && nota2 <= nota3) {
            System.out.println("Menor nota foi a nota 2: " + nota2);
        } else {
            System.out.println("Menor nota foi a nota 3: " + nota3);
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota 1: ");
        Float nota1 = teclado.nextFloat();
        System.out.println("Digite a nota 2: ");
        Float nota2 = teclado.nextFloat();
        System.out.println("Digite a nota 3: ");
        Float nota3 = teclado.nextFloat();
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        aluno.calcularMedia();
        aluno.maiorNota();
        aluno.menorNota();

    }
}
