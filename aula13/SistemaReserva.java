package revisao;

import java.util.ArrayList;
import java.util.List;

// Classe Base
class Reserva {
    protected String codigo;

    public Reserva(String codigo) {
        this.codigo = codigo;
    }

    public void adicionar() {
        System.out.println("Criando uma reserva genérica: " + codigo);
    }

    public void cancelar() {
        System.out.println("Cancelando uma reserva genérica: " + codigo);
    }
}

// Classe Derivada: ReservaDeHotel
class ReservaDeHotel extends Reserva {
    
    public ReservaDeHotel(String codigo) {
        super(codigo);
    }

    // Sobrescrita (Override) do método adicionar
    @Override
    public void adicionar() {
        System.out.println("[Hotel " + codigo + "] Reserva de quarto confirmada.");
    }

    // Sobrescrita (Override) com política específica de cancelamento
    @Override
    public void cancelar() {
        System.out.println("[Hotel " + codigo + "] Cancelamento realizado. Sem taxas (Política de 24h).");
    }
}

// Classe Derivada: ReservaDeVoo
class ReservaDeVoo extends Reserva {
    
    public ReservaDeVoo(String codigo) {
        super(codigo);
    }

    // Sobrescrita (Override) do método adicionar original
    @Override
    public void adicionar() {
        System.out.println("[Voo " + codigo + "] Assento reservado na classe Econômica padrão.");
    }

    // SOBRECARGA (Overload): Novo método que aceita o tipo de classe do voo
    public void adicionar(String classeVoo) {
        System.out.println("[Voo " + codigo + "] Assento confirmado na classe: " + classeVoo.toUpperCase());
    }

    // Sobrescrita (Override) com política específica de cancelamento
    @Override
    public void cancelar() {
        System.out.println("[Voo " + codigo + "] Cancelamento solicitado. Multa de 15% aplicada no reembolso.");
    }
}

// Classe Principal para demonstração de Polimorfismo
public class SistemaReserva {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DE RESERVAS (POLIMORFISMO) ===\n");

        // Criando uma lista genérica de Reservas (Polimorfismo)
        List<Reserva> minhasReservas = new ArrayList<>();

        // Adicionando os objetos das classes filhas na lista da classe mãe
        minhasReservas.add(new ReservaDeHotel("H-102"));
        minhasReservas.add(new ReservaDeVoo("V-777"));

        // 1. Executando os métodos de adição
        System.out.println("--- Efetuando as Reservas ---");
        
        // Chamada normal usando Polimorfismo
        minhasReservas.get(0).adicionar(); // Executa o adicionar do Hotel
        minhasReservas.get(1).adicionar(); // Executa o adicionar padrão do Voo

        // Testando a SOBRECARGA específica da classe ReservaDeVoo
        // Para acessar o método sobrecarregado que não existe na classe mãe, fazemos um cast:
        ReservaDeVoo vooExecutivo = new ReservaDeVoo("V-888");
        vooExecutivo.adicionar("Executiva"); // Executa o método sobrecarregado

        System.out.println("\n--- Cancelando as Reservas (Polimorfismo Puro) ---");
        
        // O laço percorre a lista tratando todos apenas como "Reserva"
        // O Java decide em tempo de execução qual método 'cancelar' chamar (Ligação Dinâmica)
        for (Reserva r : minhasReservas) {
            r.cancelar();
        }
    }
}

