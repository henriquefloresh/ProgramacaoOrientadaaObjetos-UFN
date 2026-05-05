class Pessoa extends SerHumano {
    String nome;
    int idade;

    public Pessoa(String nome, int idade, String tipo) {
        super(tipo);
        this.nome = nome;
        this.idade = idade;
    }

    public String falar() {
        return "Nem todos falam";
    }
}
