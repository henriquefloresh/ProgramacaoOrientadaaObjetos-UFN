package pkgas;

import java.util.Scanner;

public class Time {
    public String nome;
    public int golsMarcados;
    public int golsSofridos;

    public Time(String nome, int golsMarcados, int golsSofridos) {
        this.nome = nome;
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
    }

    public void marcarGol() {
        golsMarcados++;
    }

    public void sofrerGol() {
        golsSofridos++;
    }

    public int saldoGols() {
        return golsMarcados - golsSofridos;
    }

    public String resultadoPartida() {
        if (saldoGols() > 0) {
            return "Vitória";
        } else if (saldoGols() == 0) {
            return "Empate";
        } else {
            return "Derrota";
        }
    }

    public String detalhesTime() {
        return "Time: " + nome +
               "\nGols Marcados: " + golsMarcados +
               "\nGols Sofridos: " + golsSofridos +
               "\nSaldo de Gols: " + saldoGols() +
               "\nResultado: " + resultadoPartida();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do time: ");
        String nome = teclado.nextLine();

        Time time = new Time(nome, 0, 0);

        int opcao;

        do {
            System.out.println("\n1 - Marcar gol");
            System.out.println("2 - Sofrer gol");
            System.out.println("3 - Ver dados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    time.marcarGol();
                    break;
                case 2:
                    time.sofrerGol();
                    break;
                case 3:
                    System.out.println("\n" + time.detalhesTime());
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        teclado.close();
    }
}
