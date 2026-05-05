class Figura {
    String cor;
    boolean preenchido;

    public Figura(String cor, boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }
}

class Retangulo extends Figura {
    double largura;
    double altura;

    public Retangulo(String cor, boolean preenchido, double largura, double altura) {
        super(cor, preenchido); // chama o construtor da classe Figura
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}
