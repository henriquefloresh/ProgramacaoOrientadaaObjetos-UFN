class Retangulo2 {
    // Atributos privados
    private int x;
    private int y;

    // Construtor
    public Retangulo(int a, int b) {
        this.x = a;
        this.y = b;
    }

    // Método para inserir lados
    public void inserir_lados(int a, int b) {
        this.x = a;
        this.y = b;
    }

    // Método para calcular área
    public void calcular_area() {
        int area = x * y;
        System.out.println("Área do retângulo: " + area);
    }
}
