public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

        validarTriangulo();
    }

    public void validarTriangulo() {

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException(
                "Os lados do triângulo devem ser maiores que zero."
            );
        }

        if ((lado1 + lado2 <= lado3) ||
            (lado1 + lado3 <= lado2) ||
            (lado2 + lado3 <= lado1)) {

            throw new IllegalArgumentException(
                "Os valores informados não formam um triângulo válido."
            );
        }
    }

    public void exibirLados() {
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
    }
}
