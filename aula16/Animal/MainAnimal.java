public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3);
        Gato gato = new Gato("Mimi", 2);

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
