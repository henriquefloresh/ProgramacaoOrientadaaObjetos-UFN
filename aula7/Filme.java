package pkgas;

import java.util.Scanner;

public class Filme {
    private String titulo;
    private int duracao; 
    private int classificacaoEtaria;

    
    public Filme(String titulo, int duracao, int classificacaoEtaria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    
    public double converterDuracaoHoras() {
        return duracao / 60.0;
    }

    
    public boolean podeAssistir(int idade) {
        return idade >= classificacaoEtaria;
    }

    
    public String descricaoFilme() {
        return "Título: " + titulo +
               "\nDuração: " + duracao + " minutos" +
               "\nClassificação Etária: " + classificacaoEtaria + " anos";
    }

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Digite o título do filme: ");
        String titulo = teclado.nextLine();

        System.out.print("Digite a duração (em minutos): ");
        int duracao = teclado.nextInt();

        System.out.print("Digite a classificação etária: ");
        int classificacao = teclado.nextInt();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        
        Filme filme = new Filme(titulo, duracao, classificacao);

        
        System.out.println("\n--- Informações do Filme ---");
        System.out.println(filme.descricaoFilme());

        System.out.println("\nDuração em horas: " + filme.converterDuracaoHoras());

        if (filme.podeAssistir(idade)) {
            System.out.println("Você pode assistir a este filme! ");
        } else {
            System.out.println("Você NÃO pode assistir a este filme. ");
        }

        teclado.close();
    }
}
