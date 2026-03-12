package pkg;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ClasseAluno a = new ClasseAluno();
		float soma = 0;
		float media;
		
		System.out.println("Digite o nome do aluno: ");
		a.nome = teclado.nextLine();
		System.out.println("Digite o número da matricula do aluno: ");
		a.matricula = teclado.nextLine();
		System.out.println("Digite aqui o valor da nota 1 desse mesmo aluno: ");
		a.nota1 = teclado.nextFloat();
		System.out.println("Digite aqui o valor da nota 2 desse mesmo aluno: ");
		a.nota2 = teclado.nextFloat();
		System.out.println("Digite aqui o valor da nota 3 desse mesmo aluno: ");
		a.nota3 = teclado.nextFloat();
		
		soma = a.nota1 + a.nota2 + a.nota3;
		media = soma / 3;
		
		System.out.println("O aluno: "+a.nome);
		System.out.println("De matrícula: "+a.matricula);
		System.out.println("Que teve a nota 1 igual a: "+a.nota1);
		System.out.println("A nota 2 igual a: "+a.nota2);
		System.out.println("E a nota 3 igual a: "+a.nota3);
		System.out.println("Obteve a média final igual a: "+media);
		
		if(media >= 6) {
			System.out.println("O aluno está aproado!");
		} else {
			System.out.println("O aluno está reprovado.");
		}
		
		teclado.close();
	}
}
