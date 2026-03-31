package pkg;

import java.util.Scanner;

public class Retangulo {
    double largura;
    double altura;


    public Retangulo(double l, double a) {
        largura = l;
        altura = a;
        System.out.println("Largura do retangulo: " + largura);
        System.out.println("Altura do retangulo: " + altura);
    }
    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
    public boolean ehQuadrado() {
        if (largura == altura) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o largura do retangulo: ");
        double l = teclado.nextDouble();
        System.out.println("Digite o altura do retangulo: ");
        double a = teclado.nextDouble();
        Retangulo retangulo = new Retangulo(l, a);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.calcularDiagonal();
        if (retangulo.ehQuadrado()) {
            System.out.println("É Quadrado");
        }else {
            System.out.println("Não é Quadrado");
        }
    }
}
