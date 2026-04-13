import java.util.Scanner;

class Carro {
    // Atributos privados (encapsulamento)
    private String marca;
    private String modelo;
    private int ano;

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir os detalhes
    public void exibeDetalhes() {
        System.out.println("\nDetalhes do carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carro carro = new Carro();

        // Leitura dos dados
        System.out.print("Digite a marca: ");
        carro.setMarca(teclado.nextLine());

        System.out.print("Digite o modelo: ");
        carro.setModelo(teclado.nextLine());

        System.out.print("Digite o ano: ");
        carro.setAno(teclado.nextInt());

        // Exibindo os detalhes
        carro.exibeDetalhes();

        teclado.close();
    }
}
