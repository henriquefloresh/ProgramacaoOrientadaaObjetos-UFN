public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Serafim";
        cachorro.raca = "Dobbermann";
        cachorro.idade = 3;

        cachorro.emitirSom();
        cachorro.exibirInfo();
        System.out.println("Chamando verificação cachorro: " +cachorro.verificarVacinacao());


        Gato gato = new Gato();
        gato.nome = "Lhoco";
        gato.raca = "Siamês";
        gato.idade = 2;

        gato.emitirSom();
        gato.exibirInfo();
        System.out.println("Chamando verificação gato: " +gato.verificarVacinacao());

    }
}
