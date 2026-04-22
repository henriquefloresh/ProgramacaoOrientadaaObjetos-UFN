package pkg;
import java.util.Scanner;

public class Quest12 { //como se fosse a classe Aluno
	private String nome;
	private double nota;
	
	public Quest12(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	void aprovado() {
		if(nota>=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
	
	void exibirInformacoes() {
		System.out.println("Nome: "+nome);
		System.out.println("Nota: "+nota );
		aprovado();
	}



	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Quest12 q12 = new Quest12("Henrique", 10);
		
		
		
		System.out.println("MENU INTERATIVO");
		System.out.println("Digite 1 para criar aluno, digite 2 para exibir informações do aluno, digite 3 para atribuir nota, digite 4 para obter nota, digite 5 para atribuir nome, digite 6 para obter nome, digite 7 para verificar aprovação e digite 0 para sair.");
		
		
		int i = 0;
		while(i==i) {
			System.out.println("1 2 3 4 5 6 7 0");
			i = teclado.nextInt();
			if(i==1) {
				System.out.println("Digite o nome do aluno: ");
				q12.nome = teclado.next();
				System.out.println("Digite a nota do aluno: ");
				q12.nota = teclado.nextDouble();		
			}else if(i==2){
					q12.exibirInformacoes();
			}else if(i==3) {
				System.out.println("Digite a nota do aluno: ");
				q12.nota = teclado.nextDouble();
			}else if(i==4) {
				System.out.println("Nota: "+q12.nota);	
			}else if(i==5) {
				System.out.println("Digite o nome do aluno: ");
				q12.nome = teclado.next();
			}else if(i==6) {
				System.out.println("Nome: "+q12.nome);
			}else if(i==7) {
				q12.aprovado();
			}else if(i==0) {
				System.out.println("Saindo...");
				return;
			}
		}
			
		teclado.close();
		
	}

}
