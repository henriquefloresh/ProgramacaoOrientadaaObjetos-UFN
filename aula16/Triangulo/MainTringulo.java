public class MainTriangulo {

    public static void main(String[] args) {

        try {

            Triangulo t1 = new Triangulo(3, 4, 5);

            System.out.println("Triângulo válido!");
            t1.exibirLados();

            System.out.println();

            Triangulo t2 = new Triangulo(2, 3, 8);

            System.out.println("Triângulo válido!");
            t2.exibirLados();

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}
