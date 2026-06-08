class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, cidade);
        this.cpf = cpf;
    }

    @Override
    public void efetuarCompra(double valor) {
        System.out.println("Pessoa Física: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Compra realizada no valor de R$ " + valor);
    }
}
