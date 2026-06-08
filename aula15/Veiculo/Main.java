public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2023);
        Moto moto = new Moto("Honda", "CB 500", 2022);

        System.out.println("=== CARRO ===");
        carro.acelerar();
        carro.frear();

        System.out.println("\n=== MOTO ===");
        moto.acelerar();
        moto.frear();
    }
}
