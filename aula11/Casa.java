import java.util.Scanner;

// Classe Casa
class Casa {

    // Método com apenas o tamanho
    public double calcularPreco(int tamanho) {

        double preco = tamanho * 1000;

        return preco;
    }

    // Sobrecarga do método
    public double calcularPreco(int tamanho, int quartos) {

        double preco = (tamanho * 1000) + (quartos * 20000);

        return preco;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Casa casa = new Casa();

        System.out.print("Digite o tamanho da casa em m²: ");
        int tamanho = teclado.nextInt();

        // Chamando o primeiro método
        double preco1 = casa.calcularPreco(tamanho);

        System.out.println("Preço da casa sem considerar quartos: R$ " + preco1);

        System.out.print("Digite a quantidade de quartos: ");
        int quartos = teclado.nextInt();

        // Chamando o método sobrecarregado
        double preco2 = casa.calcularPreco(tamanho, quartos);

        System.out.println("Preço da casa considerando quartos: R$ " + preco2);

        teclado.close();
    }
}
