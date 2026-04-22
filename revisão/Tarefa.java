package pkg;
import java.util.Scanner;
public class Tarefa {
	public String descricao;
	public boolean concluida = false;
	
	void concluirTarefa() {
		concluida = true;
	}
	
	void exibirTarefa() {
		System.out.println("Descrição: " +descricao);
		if(concluida) {
			System.out.println("Status: concluída!");
		} else {
			System.out.println("Status: Pendente.");
		}
			System.out.println("-------------");
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Tarefa[] tarefas = new Tarefa[3];
		
		// Entrada das tarefas
        for (int i = 0; i < 3; i++) {
            tarefas[i] = new Tarefa();

            System.out.print("Digite a descrição da tarefa " + (i + 1) + ": ");
            tarefas[i].descricao = teclado.nextLine();
        }

        // Escolher qual tarefa concluir
        System.out.print("Qual tarefa deseja concluir? (1, 2 ou 3): ");
        int opcao = teclado.nextInt();

        if (opcao >= 1 && opcao <= 3) {
            tarefas[opcao - 1].concluirTarefa();
        } else {
            System.out.println("Opção inválida.");
        }

        // Exibir todas as tarefas
        System.out.println("\n--- Lista de Tarefas ---");
        for (int i = 0; i < 3; i++) {
            tarefas[i].exibirTarefa();
        }

        teclado.close();
		

	}

}
