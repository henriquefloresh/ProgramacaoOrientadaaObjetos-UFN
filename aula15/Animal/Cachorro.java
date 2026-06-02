public class Cachorro implements Animal {
    String nome;
    String raca;
    int idade;

    @Override
    public void emitirSom(){
        System.out.println("Au AU!");
    }

    @Override
    public void exibirInfo(){
        System.out.println("Cachorro: ");
        System.out.println("Nome: " +nome);
        System.out.println("Raça: " +raca);
        System.out.println("Idade: "+idade);
    }

    @Override
    public boolean verificarVacinacao(){
        System.out.println("Verificando vacinação do cachorro...");
        return true;
    }
}
