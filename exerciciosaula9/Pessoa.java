class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void trabalhar() {
        System.out.println("A pessoa está trabalhando");
    }
}

class Funcionario extends Pessoa {

    public Funcionario(String nome) {
        super(nome); // chama o construtor da classe Pessoa
    }

    @Override
    public void trabalhar() {
        System.out.println("O funcionário está trabalhando");
    }
}
